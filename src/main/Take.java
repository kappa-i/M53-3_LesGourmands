package main;

public class Take extends Command {
    private Player player;
    private WorldMap map;

    public Take(Player player, WorldMap map) {
        this.name = "take";
        this.player = player;
        this.map = map;
    }

    public void putObjectInInventory() {
        Location loc = map.getPlayerLocation();
        if (!loc.getItems().isEmpty()) {
            Item item = loc.getItems().get(0); // simplification
            player.addItem(item);
            loc.removeItem(item.name);
        }
    }

    @Override
    public void execute(String input) {
        putObjectInInventory();
    }
}


/* public class Take {
    
    public void putObjectInInvenrory();

} */
