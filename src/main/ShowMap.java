package main;

import utils.*;

public class ShowMap extends Command {
    private WorldMap worldMap;

    public ShowMap(WorldMap worldMap) {
        super("map", "Affiche la carte du mmaponde");
        this.worldMap = worldMap;
    }

    @Override
    public void execute(String[] args) {
        int playerRow = worldMap.getPlayerY();
        int playerCol = worldMap.getPlayerX();

        System.out.println(Array2Dprinter.print2DArray(worldMap.getPrintableMap(), playerRow, playerCol));

    }

}
