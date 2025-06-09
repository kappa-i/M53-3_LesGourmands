package main;

import java.util.ArrayList;

public class Player {
    private ArrayList<Item> inventory = new ArrayList<>();

    // Ajoute un objet à l'inventaire
    public void addItem(Item item) {
        inventory.add(item);
        item.addToInventory();
    }

   public void removeItem(String itemName) {
    for (int i = 0; i < inventory.size(); i++) {
        if (inventory.get(i).getName().equals(itemName)) {
            inventory.remove(i);
            break;
        }
    }
}


    // Affiche le nouvel emplacement du joueur
    public void moveToLocation(Location location) {
        System.out.println("You moved to: " + location.getDescription());
    }   

    public void listInventoryItems() {
        if (inventory.isEmpty()) {
            System.out.println("Votre inventaire est vide.");
        } else {
            System.out.println("Objets dans votre inventaire :");
            for (Item item : inventory) {
                System.out.println("- " + item.getName());
            }
        }
    }

    public ArrayList<Item> getInventory() {
        return inventory;
    }

}