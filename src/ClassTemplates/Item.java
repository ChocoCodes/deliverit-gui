package ClassTemplates;

import java.util.ArrayList;

public class Item implements Measurable {
    private final String[] ITEMS_H = {"pkgID", "name", "weight_kg", "length_cm", "width_cm", "height_cm"};
    private String name;
    private double weight; // in kilograms
    private Dimension dimension;

    public Item(String name, double weight, Dimension dimension) {
        this.name = name;
        this.weight = toKilograms(weight);
        this.dimension = dimension;
    }

    public String getName() { return this.name; }
    public String[] getItemHeader() { return this.ITEMS_H; }
    public double toKilograms(double grams) {
        return grams / 1000.0;
    }
    
    @Override
    public double getWeight() { return this.weight; }
    @Override
    public Dimension getDimension() { return this.dimension; }
    @Override
    public double getVolume() { return getDimension().calcVolume(); }

    public String[] toCSVFormat(int pkgID) { 
        Dimension dim = getDimension();
        return new String[] {
            String.valueOf(pkgID),
            getName(), 
            String.valueOf(getWeight()),  
            String.valueOf(dim.getLength()), 
            String.valueOf(dim.getWidth()), 
            String.valueOf(dim.getHeight())
        }; 
    }
    
    public static Item toItem(String[][] raw, int idx) {
        return new Item(
            raw[idx][1],
            Double.parseDouble(raw[idx][2]),
            Dimension.toDimension(raw[idx], 3)
        );
    }

    public static Item[] toItem(String[][] rawData) {
        ArrayList<Item> items = new ArrayList<>();
        for(int i = 0; i < rawData.length; i++) {
            String name = "";
            double weight = 0.0;
            Dimension dim = null;
            for(int j = 0; j < rawData[i].length; j++) {
                name = rawData[i][0];
                weight = Double.parseDouble(rawData[i][1]);
                dim = new Dimension(Double.parseDouble(rawData[i][2]), Double.parseDouble(rawData[i][3]), Double.parseDouble(rawData[i][4])); 
            }
            items.add(new Item(name, weight, dim));
        }
        return items.toArray(new Item[0]);
    }
}