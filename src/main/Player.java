package main;

import java.lang.reflect.AccessFlag.Location;
import java.util.ArrayList;

public class Player {
    
    ArrayList<String> inventory = new ArrayList<>();


    //Méthode
    public void addItem(String item){
        if(!inventory.contains(item)){
            inventory.add(item);
            System.out.println(item + " a été ajouté à l'inventaire.");
        } else {
            System.out.println(item + " est déjà dans l'inventaire.");
        }
    }

    public void removeItem(String item){
        if(inventory.contains(item)){
            inventory.remove(item);
            System.out.println(item + " a été retiré de l'inventaire.");
        } else {
            System.out.println(item + " n'est pas dans l'inventaire.");
        }
    }

    public void MoveToLocation(Location location){
        if (!location.) {
            System.out.println("Vous vous déplacez vers : " + location.getLocationName());
        } else{
            System.out.println("La zone est bloquée");
        }
    }

    public void OpenMap(){

    }

    public void openInventory(){

    }

}
