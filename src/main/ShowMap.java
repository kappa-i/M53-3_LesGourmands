package main;

import utils.Array2DPrinter;

public class ShowMap extends Command {
    private WorldMap worldMap;

    public ShowMap(WorldMap worldMap) {
        super("map", "Affiche la carte du monde");
        this.worldMap = worldMap;
    }

    @Override
    public void execute(String[] args) {
        Array2DPrinter.print2DArray(worldMap.getPrintableMap());
    }
}
