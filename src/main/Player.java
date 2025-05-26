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

    // Permet d'inspecter les objets inspectables
    public void interactWithItems() {
        for (Item item : inventory) {
            if (item.canBeInspected()) {
                System.out.println(item.inspect());
            }
        }
    }
}