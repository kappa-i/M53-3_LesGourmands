package main;

public abstract class Item {

    String name;
    
    public Item (String name){
        this.name = name;
    }

    //Méthodes
    public boolean canBeInspected() {
        return true;
    };

    public String inspect(){

    };

    public String addToInventory(String name){
        inventory.add(this.name);
    };

    public void drop (){
        
    };
    
}
