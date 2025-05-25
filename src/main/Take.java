package main;

public class Take extends Command {
    private WorldMap worldMap;
    private Player player;

    public Take(WorldMap worldMap, Player player) {
        super("take", "Take an object.");
        this.worldMap = worldMap;
        this.player = player;
    }

    @Override
    public void execute(String input) {
        Location current = worldMap.getPlayerLocation();
        if (current.containObject(input)) {
            Item item = current.removeObject(input);
            player.addItem(item);
            System.out.println("You picked up the " + input);
        } else {
            System.out.println("That item is not here.");
        }
    }
}


/* public class Take {
    
    public void putObjectInInvenrory();

} */
