package main;

public class Move extends Command {
    private Player player;
    private WorldMap worldMap;

    public Move(Player player, WorldMap map) {
        super("move", "Déplace le joueur dans une direction");
        this.player = player;
        this.worldMap = map;
    }

    @Override
    public void execute(String[] directions) {
        if (directions.length < 2) {
            System.out.println("Usage: move <north|south|east|west>");
            return;
        }
        String direction = directions[1];
        if (!worldMap.movePlayer(direction)) {
            System.out.println("Impossible d'aller là !");
        }
    }
}