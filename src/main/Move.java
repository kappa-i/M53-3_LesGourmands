package main;

public class Move extends Command {
    private WorldMap map;
    private Player player;

    public Move(Player player, WorldMap map) {
        this.name = "move";
        this.player = player;
        this.map = map;
    }

    public void movePlayerAround() {
        System.out.println("Moved player.");
        // exemple de déplacement fixe
        Location newLoc = map.getLocation(0, 1);
        player.moveToLocation(newLoc);
        map.setPlayerLocation(newLoc);
    }

    @Override
    public void execute(String input) {
        movePlayerAround();
    }
}


/* public class Move {

    public void movePlayerAround();
    
}*/
