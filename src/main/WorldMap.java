package main;

public class WorldMap {

    private int [][] locationGrid;
    private int playerLocation;


    public WorldMap (int row, int column) {
        locationGrid = new int [row] [column];
    }

    public int getLocation (int row, int column){
        return locationGrid [row] [column];
    }
    
    public void addLocation (int value, int row, int column){
        locationGrid [row][column] = value;
    }

    public int getPlayerlocation (){
        return playerLocation;
    }

    public void  setPlayerLocation(int location){
        this.playerLocation = location;
    }

    public void setitemLocation (int row, int column){
        locationGrid [row][column] = 0;
    }
}

