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

    public void unlock() {
        isLocked = false;
    }

    public void lock() {
        isLocked = true;
    }

    public boolean isLocked() {
        return isLocked;
    }

    public String getDescription() {
        return description;
    }

    public boolean containObject(String itemName) {
        for (Item item : items) {
            if (item.name.equals(itemName)) return true;
        }
        return false;
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public Item removeItem(String name) {
        for (Item item : items) {
            if (item.name.equals(name)) {
                items.remove(item);
                return item;
            }
        }
        return null;
    }

    public ArrayList<Item> getItems() {
        return items;
    }
}

