package datautils.io;

import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.io.BufferedReader;

 public class DataIOParser {
    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    public static String dateToString(Date date) {
        SimpleDateFormat format = new SimpleDateFormat("MM/dd/yyyy");
        // Set date to epoch date 01-01-1970
        return format.format((date == null) ? new Date(0) : date);
    }

    public static Date strToDate(String csvDate) {
        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
        try {
            return sdf.parse(csvDate);
        } catch (ParseException e) { return null; }
    }    

    public static boolean checkInput(String input) { 
        return input.trim().length() == 0 || input == null; 
    }

    public static String getInput(String prompt) {
        boolean exceptionOccured = false; 
        String input = "";
        do {
            try {
                System.out.printf("%s: ", prompt);
                input = reader.readLine();
            } catch (IOException e) { exceptionOccured = true; }
        } while(checkInput(input) || exceptionOccured);
        return input;
    }
    
    public static int getIntInput(String prompt) {
        String in = "";
        try {
            do {
                System.out.printf("%s: ", prompt);
                in = reader.readLine();
            } while(!validateInt(in));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return Integer.parseInt(in);
    }

    public static double getDoubleInput(String prompt) {
        String in = "";
        try {
            do {
                System.out.printf("%s: ", prompt);
                in = reader.readLine();
            } while(!validateDouble(in));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return Double.parseDouble(in);
    }
    // Positive integers only
    public static boolean validateInt(String input) {
        try {
            return Integer.parseInt(input) > 0;
        } catch (NumberFormatException e) { return false; }
    }
    // Positive floating-point values only
    public static boolean validateDouble(String input) {
        try {
            return Double.parseDouble(input) > 0.0;
        } catch (NumberFormatException e) { return false; }
    }
    
    public static boolean areEmptyFields(String[] fields) {
        for(String f : fields) {
            if(DataIOParser.checkInput(f)) return true;
        }
        return false;
    }
    
    public static boolean areValidMeasures(String[] inputs) {
        for(String i : inputs) {
            if(!DataIOParser.validateDouble(i)) return true;
        }
        return false;
    }
}
