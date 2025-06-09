package main;

public class Drop extends Command {
    private Player player;
    private WorldMap map;

    public Drop(Player player, WorldMap map) {
        super("drop", "Laisse un objet de l'inventaire dans la pièce actuelle");
        this.player = player;
        this.map = map;
    }

    @Override
    public void execute(String[] args) {
        if (args.length < 2) {
            System.out.println("Utilisation : drop <nom_objet>");
            return;
        }

        String itemName = args[1];
        Item toDrop = null;

        // Trouver l'objet dans l'inventaire
        for (Item item : player.getInventory()) {
            if (item.getName().equalsIgnoreCase(itemName)) {
                toDrop = item;
                break;
            }
        }

        if (toDrop == null) {
            System.out.println("Objet '" + itemName + "' non trouvé dans votre inventaire.");
            return;
        }

        // Retirer de l'inventaire et ajouter à la pièce actuelle
        player.removeItem(toDrop.getName());
        map.getPlayerLocation().addItem(toDrop);
        toDrop.drop();
        System.out.println("Vous avez laissé tomber : " + toDrop.getName());
    }
}
