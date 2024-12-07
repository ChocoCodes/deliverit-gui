package datautils.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import ClassTemplates.*;
import java.io.PrintWriter;
import java.io.IOException;

public class CSVParser {
    // Get the number of columns in the CSV file
    public static int getColumnCounts(String file) {
        int counts = -1;
        try (BufferedReader fin = new BufferedReader(new FileReader(file))) {
            String buffer;
            if ((buffer = fin.readLine()) != null) {
                String[] header = buffer.split(",");
                counts = header.length;
            }
        } catch(IOException e) { return -1; }
        return counts;
    }

    public static String[][] loadCSVData(String file) {
        ArrayList<String[]> data = new ArrayList<>();
        try (BufferedReader fin = new BufferedReader(new FileReader(file))) {
            String buffer;
            // Skip header column
            if ((buffer = fin.readLine()) != null) {}
            while ((buffer = fin.readLine()) != null) {
                String[] tmp = buffer.split(",");
                // Skip invalid columns: columns that does not have the same counts as the header
                if(tmp.length != getColumnCounts(file)) { continue; }
                data.add(tmp);
            }
        } catch (IOException e) { return new String[0][0]; }
        return data.toArray(new String[0][0]);
    }
    
    // Individual Entity - Save an entity's attributes to the CSV File
    public static void saveEntry(String[] data, String file) {
        boolean saved = false;
        try (PrintWriter fout = new PrintWriter(new FileWriter(file, true))) {
            String placeholder = generateEntryFormatCSV(data.length);
            fout.printf(placeholder,(Object[]) data);
            saved = true;
        } catch (IOException e) { saved = false; }
        if(!saved) System.out.println("Error saving new file data");
    }

    // Bulk Writing - Write all the current contents of the CSV after updating selected fields
    public static void writeToCSV(String[][] data, String[] header, boolean append, String file) {
        boolean saved = false;
        try (PrintWriter fout = new PrintWriter(new FileWriter(file, append))) {
            // Generate string CSV structure and save the headers first
            if(!append) {
                String placeholder = generateEntryFormatCSV(header.length);
                fout.printf(placeholder, (Object[]) header);
            }
            if (data.length > 0) { // To handle index out of bounds
                String dataPlaceholder = generateEntryFormatCSV(data[0].length);
                for (String[] row : data) {
                    fout.printf(dataPlaceholder, (Object[]) row);
                }
            }
            saved = true;
        } catch (IOException e) { saved = false; }
        System.out.println(saved ? "Successfully updated new data." : "An error occured while updating new data.");
    }

    // Helper Method for CSV Structure generation for data format
    private static String generateEntryFormatCSV(int length) {
        StringBuilder format = new StringBuilder();
        for(int i = 0; i < length; i++) {
            format.append("%s,");
        }
        format.setCharAt(format.length() - 1, '\n');
        return format.toString();
    }

    public static int getLatestID(String file) {
        String[][] rawCSV = loadCSVData(file);
        return rawCSV.length == 0 ? 0 : Integer.parseInt(rawCSV[rawCSV.length - 1][0]);
    }

    public static void updateCSV(String file, int id, String newEntry, int columnIndex, String[] headers) {
        String[][] csvData = loadCSVData(file);
        for (int i = 0; i < csvData.length; i++) {
            if (Integer.parseInt(csvData[i][0]) == id) {
                csvData[i][columnIndex] = newEntry;
                break;
            }
        }
        // Rewrite CSV
        writeToCSV(csvData, headers, false, file); 
    }

    public static Package[] searchPackage(int custID) {
        ArrayList<Package> custPkg = new ArrayList<>();
        String[][] csvPkg = loadCSVData("src/CSVFiles/packages.csv");
        for(int i = 0; i < csvPkg.length; i++) {
            int id = Integer.parseInt(csvPkg[i][1]);
            if(id == custID) {
                custPkg.add(Package.toPackage(csvPkg, i, null));
            }
        }
        return custPkg.toArray(new Package[0]);
    }
    // pkgId,name,weight_kg,length_cm,width_cm,height_cm
    public static Item[] searchItems(int pkgID) {
        String[][] csvItems = loadCSVData("src/CSVFiles/items.csv");
        ArrayList<Item> items = new ArrayList<>();
        for(int i = 0; i < csvItems.length; i++) {
            int itemPkgId = Integer.parseInt(csvItems[i][0]);
            if(itemPkgId == pkgID) {
                items.add(Item.toItem(csvItems, i));
            }
        } 
        return items.toArray(new Item[0]);
    }

    public static Shipment[] searchShipments(int custID) {
        // Load customer package/s
        ArrayList<Shipment> customerShipments = new ArrayList<>();
        Package[] custPkg = searchPackage(custID);
        // Load shipment CSV
        String[][] csvShips = CSVParser.loadCSVData("src/CSVFiles/shipments.csv");
        for(int i = 0; i < csvShips.length; i++) {
            int shipPkgId = Integer.parseInt(csvShips[i][1]);
            if(csvShips[i][7].equalsIgnoreCase("Paid") || csvShips[i][7].equalsIgnoreCase("Pending")) {
                for(Package pkg : custPkg) {
                    if(pkg.getId() == shipPkgId) {
                        Item[] items = searchItems(pkg.getId());
                        pkg.setContents(items);
                        customerShipments.add(Shipment.toShipment(csvShips, i, pkg));
                        break;
                    }
                }
            }
        }
        return customerShipments.toArray(new Shipment[0]);
    }
}