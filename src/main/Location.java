package main;

import java.util.ArrayList;

public class Location {
    private String name;
    private String description;
    private boolean isLocked;
    private ArrayList<Item> items;

    public Location(String name, String description, boolean isLocked) {
        this.name = name;
        this.description = description;
        this.isLocked = isLocked;
        this.items = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public boolean isLocked() {
        return isLocked;
    }

    public ArrayList<Item> getItems() {
        return items;
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public void removeItem(Item item) {
        items.remove(item);
    }
}
