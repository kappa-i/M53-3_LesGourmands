package main;

public class Inspect extends Command {
    private WorldMap worldMap;

    public Inspect(WorldMap worldMap) {
        super("inspect", "Inspect an object.");
        this.worldMap = worldMap;
    }

    @Override
    public void execute(String input) {
        Location current = worldMap.getPlayerLocation();
        for (Item item : current.getObjects()) {
            if (item.getName().equalsIgnoreCase(input)) {
                System.out.println(item.inspect());
                return;
            }
        }
        System.out.println("No such item found.");
    }
}


/* public class Inspect extends Command {
    
    public void inspectObject();
} */

