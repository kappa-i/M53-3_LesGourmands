package main;

import utils.IPrintable;

public class WorldMap {
    private Location[][] map;
    private int width, height;
    private int playerX = 0, playerY = 0;

    public WorldMap(int width, int height) {
        this.width = width;
        this.height = height;
        map = new Location[height][width];
    }

    public void addLocation(Location location, int x, int y) {
        map[y][x] = location;
    }

    public Location getPlayerLocation() {
        return map[playerY][playerX];
    }

    public int getPlayerX() {
        return playerX;
    }

    public int getPlayerY() {
        return playerY;
    }

    public void setPlayerLocation(Location location) {
        map[playerY][playerX] = location;
    }

    public boolean movePlayer(String direction) {
        int newX = playerX;
        int newY = playerY;

        /*
         * méthode pour déplacer le joueur dans une direction (north, south, etc.) sur
         * une carte en 2D.
         */

        switch (direction.toLowerCase()) {
            case "north":
                newY -= 1;
                break;
            case "south":
                newY += 1;
                break;
            case "west":
                newX -= 1;
                break;
            case "east":
                newX += 1;
                break;
            default:
                System.out.println("Direction inconnue.");
                return false;
        }

        if (newX >= 0 && newX < width && newY >= 0 && newY < height && map[newY][newX] != null) {
            playerX = newX;
            playerY = newY;
            System.out.println(map[playerY][playerX].getDescription());
            return true;
        }

        return false;
    }

    public IPrintable[][] getPrintableMap() {
        IPrintable[][] printableMap = new IPrintable[height][width];
        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                printableMap[y][x] = map[y][x]; // map[y][x] est une Zone qui implémente IPrintable
            }
        }
        return printableMap;
    }

}
