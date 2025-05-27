package main;

import java.util.ArrayList;

import utils.IPrintable;

public class Location implements IPrintable {
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

    public void unlock() {
        isLocked = false;
    }

    public void lock() {
        isLocked = true;
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

    @Override
    public String getPrintableString() {
        return this.getName();
    }

    @Override
    public boolean isGrayedOut() {
        return isLocked;
    }

}
