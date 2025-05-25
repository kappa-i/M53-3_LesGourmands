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

    public abstract String inspect();
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
   


