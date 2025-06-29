package main;

public abstract class Item {
    protected String name;
    protected String description;
    protected boolean inInventory;

    public Item(String name, String description) {
        this.name = name;
        this.description = description;
        this.inInventory = false;
    }

    public String getName() {
        return name;
    }

    public void addToInventory() {
        inInventory = true;
    }

    public boolean canBeInspected() {
        return true;
    }

    public void drop() {
    
    }

    public abstract String inspect();


}



