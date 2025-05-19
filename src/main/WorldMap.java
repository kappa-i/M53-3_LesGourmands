public class WorldMap {

    Location [][] grid;
    Location playerLocation;

    public WorldMap (int row, int column) {
        grid = new Location [rows][columns];
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