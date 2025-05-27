package main;

import java.util.ArrayList;

public class Player {
    private ArrayList<Item> inventory = new ArrayList<>();

    // Ajoute un objet à l'inventaire
    public void addItem(Item item) {
        inventory.add(item);
        item.addToInventory();
    }

    // Supprime un objet de l'inventaire
    public void removeItem(String itemName) {
        inventory.removeIf(item -> item.getName().equals(itemName));
    }

    // Affiche le nouvel emplacement du joueur
    public void moveToLocation(Location location) {
        System.out.println("You moved to: " + location.getDescription());
    }

    // Affiche les objets de l'inventaire
    public void openInventory() {
        for (Item item : inventory) {
            System.out.println("- " + item.getName());
        }
    }

    // Affiche les objets inspectables et non inspectables
    public void inspectInventory() {
        if (inventory.isEmpty()) {
            System.out.println("Votre inventaire est vide.");
            return;
        }

        for (Item item : inventory) {
            if (item.canBeInspected()) {
                System.out.println("- " + item.getName() + " : " + item.inspect());
            } else {
                System.out.println("- " + item.getName() + " : Cet objet ne peut pas être inspecté.");
            }
        }
    }

    public ArrayList<Item> getInventory() {
    return inventory;
}


}