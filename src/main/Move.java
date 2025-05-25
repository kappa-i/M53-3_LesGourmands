package main;

public class Move extends Command {
    private WorldMap worldMap;
    private Player player;

    public Move(WorldMap worldMap, Player player) {
        super("move", "Move to another location.");
        this.worldMap = worldMap;
        this.player = player;
    }

    @Override
    public void execute(String input) {
        // Simule un mouvement vers un autre lieu
        System.out.println("You try to move somewhere...");

        // Pour simplifier : on déplace vers une autre position fixe (exemple)
        Location newLoc = worldMap.getLocation(0, 1);
        if (!newLoc.isLocked()) {
    player.moveToLocation(newLoc);
} else {
    System.out.println("Zone locked");
}

    
}

/*
 * public class Move {
 * 
 * public void movePlayerAround();
 * 
 * }
 */
