package main;

public class WorldMap {
    private Location[][] grid;
    private Location playerLocation;

    public WorldMap(int rows, int cols) {
        grid = new Location[rows][cols];
    }

    public Location getLocation(int row, int col) {
        return grid[row][col];
    }

    public void addLocation(Location location, int row, int col) {
        grid[row][col] = location;
    }

    public Location getPlayerLocation() {
        return playerLocation;
    }

    public void setPlayerLocation(Location location) {
        playerLocation = location;
    }

    public void setItemLocation(int row, int col) {
        playerLocation = grid[row][col];
    }
}


/* 
 public class WorldMap {

    Location [][] grid;
    Location playerLocation;

    public WorldMap (int row, int column) {
        grid = new Location [rows] [columns];
    }

    public Location getLocation (int row, int column){
        return grid [rows] [columns];
    }
    
    public addLocation (Location location, int row, int column){
        grid [row][column] = location;
    }

    public Location getPlayerlocation (){
        return playerLocation;
    }

    public setPlayerLocation(Location location){
        this.playerLocation = location;
    }

    public void setitemLocation (int row, int column){

    }
}
*/
