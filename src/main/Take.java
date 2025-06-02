package main;

public class Take extends Command {
    private Player player;
    private WorldMap map;

    public Take(Player player, WorldMap map) {
        super("take", "Ramasse un objet dans la pièce");
        this.player = player;
        this.map = map;
    }

    @Override
    public void execute(String[] args) {
        Location currentLocation = map.getPlayerLocation();

        if (currentLocation.isLocked()) {
            System.out.println("Cette zone est verrouillée. Vous ne pouvez rien prendre.");
            return;
        }

        if (args.length < 2) {
            System.out.println("Usage : take <nomObjet>");
            return;
        }

        String itemName = args[1].toLowerCase(); // juste le 2e mot

        Item found = null;
        for (Item item : currentLocation.getItems()) {
            if (item.getName().toLowerCase().equals(itemName)) {
                found = item;
                break;
            }
        }

        if (found == null) {
            System.out.println("Aucun objet nommé \"" + itemName + "\" ici.");
        } else {
            player.addItem(found);
            currentLocation.removeItem(found);
            System.out.println("Vous avez pris : " + found.getName());
        }
    }
}
