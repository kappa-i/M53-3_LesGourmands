package main;

import java.util.ArrayList;

public class Location {
    private String name;
    private String description;
    private boolean isLocked;
    private ArrayList<Item> objects; // objets présents dans ce lieu

    public Location(String name, String description, boolean isLocked) {
        this.name = name;
        this.description = description;
        this.isLocked = isLocked;
        this.objects = new ArrayList<>();
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

    public void addObject(Item item) {
        objects.add(item);
    }

    public boolean containObject(String itemName) {
        for (Item item : objects) {
            if (item.getName().equalsIgnoreCase(itemName)) {
                return true;
            }
        }
        return false;
    }

    public Item removeObject(String itemName) {
        for (Item item : objects) {
            if (item.getName().equalsIgnoreCase(itemName)) {
                objects.remove(item);
                return item;
            }
        }
        return null;
    }

    public ArrayList<Item> getObjects() {
        return objects;
    }

    public String getName() {
        return name;
    }
}
