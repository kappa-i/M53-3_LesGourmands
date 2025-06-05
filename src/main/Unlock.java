package main;

public class Unlock extends Command {
    private Player player;
    private WorldMap map;

    public Unlock(Player player, WorldMap map) {
        super("unlock", "Déverrouille la zone si vous avez la bonne clé");
        this.player = player;
        this.map = map;
    }

    @Override
    public void execute(String[] args) {
        Location current = map.getPlayerLocation();

        if (!current.isLocked()) {
            System.out.println("Cette zone est déjà déverrouillée.");
            return;
        }

        for (Item item : player.getInventory()) {
            if (item instanceof Key) {
                Key key = (Key) item;
                if (key.getTargetZoneName().equalsIgnoreCase(current.getName())) {
                    current.unlock();
                    player.removeItem(key.getName());
                    System.out.println("Zone déverrouillée avec la clé : " + key.getName());
                    return;
                }
            }
        }

        System.out.println("Vous n'avez pas la bonne clé pour cette zone.");
    }

}
