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
        Array2Dprinter.print2DArray(worldMap.getPrintableMap(),0,0);

        System.out.println(Array2Dprinter.print2DArray(worldMap.getPrintableMap(),0,0));
    }

    
}

