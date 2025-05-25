package main;

public class Move extends Command {
    private Player player;
    private WorldMap worldMap;

    public Move(String name, String description, Player player, WorldMap map) {
        super("move", "Déplace le joueur dans une direction");
        this.player = player;
        this.worldMap = map;
    }

    @Override
    public void execute(String[] args) {
        if (args.length < 2) {
            System.out.println("Usage: move <north|south|east|west>");
            return;
        }
        String direction = args[1];
        if (!worldMap.movePlayer(direction)) {
            System.out.println("Impossible d'aller là !");
        }
    }
}


