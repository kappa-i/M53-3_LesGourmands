package main;

public abstract class Item {
    protected String name;
    protected boolean canBeInspected;

    public Item(String name, boolean canBeInspected) {
        this.name = name;
        this.canBeInspected = canBeInspected;
    }

    public boolean canBeInspected() {
        return canBeInspected;
    }

    public String inspect() {
        if (canBeInspected) {
            return "You inspect the " + name + ". It looks interesting.";
        } else {
            return "You can't inspect the " + name + ".";
        }
    }

    public void addToInventory() {
        System.out.println(name + " added to your inventory.");
    }

    public void drop() {
        System.out.println(name + " dropped.");
    }

    public String getName() {
        return name;
    }
}


/*
public abstract class Item {

    String name;
    
    protected Item (String name){
        this.name = name;
    }

    //Méthodes
    public String getItem(){
        return this.name;
    };

    public boolean canBeInspected() {
        return true;
    };

    public String inspect(){
        return "lol";
    };

    public void drop (){

    };
    
}*/
   


