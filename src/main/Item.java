package main;

public abstract class Item {

    String name;
    
    public Item (String name){
        this.name = name;
    }

    //Méthodes
    
    public String getItem(){
        return this.name;
    }

    public boolean canBeInspected() {
        return true;
    };

    public String inspect(){
        return "lol";
    };

    public void drop (){

    };
    
}
