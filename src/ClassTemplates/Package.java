package ClassTemplates;

import datautils.io.DataIOParser;
import java.util.Date;

public class Package implements Measurable {
    private final String[] PACKAGE_H = {"cID", "pkgID", "receiverAddress", "created", "dimensionalWeight_kg", "length_cm", "width_cm", "height_cm"};
    private int id;
    private String receiverAddress;
    private Date packageCreated;
    private double dimensionalWeight;
    private Dimension dimension;
    private Item[] contents;
    // Constructor for newly created Packages
    public Package(int id, Item[] contents, String receiverAddress) {
        this.id = id;
        this.packageCreated = new Date();
        this.contents = contents;
        this.receiverAddress = receiverAddress;
        this.dimension = calculateDimensions();
        this.dimensionalWeight = calcDimensionalWeight();
    }
    // Constructor for CSV-loaded Packages
    public Package(int id, Item[] contents, String receiverAddress, Date packageCreated, double dimensionalWeight, Dimension dimension) {
        this.id = id;
        this.packageCreated = packageCreated;
        this.dimensionalWeight = dimensionalWeight;
        this.contents = contents;
        this.dimension = dimension;
        this.receiverAddress = receiverAddress;
    }

    // Getters
    public int getId() { return this.id; }
    public double getDimensionalWeight() { return this.dimensionalWeight; }
    public Date getDate() { return this.packageCreated; }
    public Item[] getContents() { return this.contents; }
    public String getreceiverAddress() { return this.receiverAddress; }
    public int itemCounts() { return getContents().length; }
    public String[] getPackageHeader() { return this.PACKAGE_H; }

    @Override
    public Dimension getDimension() { return this.dimension; }
    @Override
    public double getVolume() { return getDimension().calcVolume(); }
    /* Get which weight is bigger as basis for calculating costs: fairly priced for the space they occupy.
    * actual(param 1) - total item weight only; large/heavy parcels
    * dimensional - amount of space a package takes up relative to its actual weight; large but light (bulky but don’t weigh much)
    */ 
    @Override
    public double getWeight() {
        return Math.max(getTotalItemWeight(getContents()), getDimensionalWeight());
    }
    // Setters
    public void setId(int id) { this.id = id; }
    public void setDate(Date packageCreated) { this.packageCreated = packageCreated; }
    public void setContents(Item[] contents) { this.contents = contents; }
    public void setReceiver(String receiverAddress) { this.receiverAddress = receiverAddress; }

    // Follow header - pkgID,cID,receiverAddress,created,dimensionalWeight_kg,length_cm,width_cm,height_cm
    public String[] toCSVFormat(int customerID) { 
        Dimension dim = getDimension();
        return new String[] {
            String.valueOf(getId()), 
            String.valueOf(customerID),
            getreceiverAddress(), 
            DataIOParser.dateToString(getDate()),
            String.valueOf(getDimensionalWeight()), 
            String.valueOf(dim.getLength()), 
            String.valueOf(dim.getWidth()), 
            String.valueOf(dim.getHeight())
        }; 
    }
    
    // Calculate the Dimensional Weight of a package in cm^3/kg.
    private double calcDimensionalWeight() {
        double boxVolume = getVolume();
        return boxVolume / 5000;
    }

    // Calculate box category based on getPricingBasis()
    // 0.0 fee for invalid inputs, 200 fee for small, 300 fee for medium, 500 fee for large, 700 fee for exceeding size
    public double calcBoxFee(double weight) {
        if (weight <= 0.0) return 0.0; // invalid weight
        return (weight <= 2.0) ? 150.00 : // small packages
               (weight <= 5.0) ? 200.00 : // medium packages
               (weight <= 10.0) ? 300.00 : 500.00; // large and packages exceeding 10.0 kgs
    }

    // Sum all item weights in KG - different from the package's dimensional weight
    public double getTotalItemWeight(Item[] contents) { 
        double weight = 0.0;
        for(Item item : contents) { weight += item.getWeight(); }
        return weight;
    }

    // Max l,w,h of an item is assumed to be the dimensions of the package
    public Dimension calculateDimensions() {
        double maxLength = 0.0, maxWidth = 0.0, maxHeight = 0.0;
        for (Item item : getContents()) {
            Dimension dim = item.getDimension();
            maxLength = Math.max(maxLength, dim.getLength());
            maxWidth = Math.max(maxWidth, dim.getWidth());
            maxHeight = Math.max(maxHeight, dim.getHeight());
        }
        return new Dimension(maxLength, maxWidth, maxHeight);
    }

    // pkgID,cID,receiverAddress,created,dimensionalWeight_kg,length_cm,width_cm,height_cm
    public static Package toPackage(String[][] raw, int idx, Item[] items) {
        return new Package(
            Integer.parseInt(raw[idx][0]),
            items,
            raw[idx][2],
            DataIOParser.strToDate(raw[idx][3]),
            Double.parseDouble(raw[idx][4]),
            Dimension.toDimension(raw[idx], 5)
        );
    }
}

