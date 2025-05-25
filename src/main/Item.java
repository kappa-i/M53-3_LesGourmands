package main;

public abstract class Item {
    protected String name;

    public abstract boolean canBeInspected();
    public abstract String inspect();
    public abstract void addToInventory();
    public abstract void drop();
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
   


