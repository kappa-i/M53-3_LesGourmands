package main;

import utils.Array2Dprinter;

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
        } else {
            // Affiche la carte après un déplacement réussi
            System.out.println(Array2Dprinter.print2DArray(
                worldMap.getPrintableMap(),
                worldMap.getPlayerY(),
                worldMap.getPlayerX()
            ));
        }
    }
}