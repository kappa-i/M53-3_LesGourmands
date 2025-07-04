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

    public void setPlayerStartPosition(int x, int y) {
    if (x >= 0 && x < width && y >= 0 && y < height && map[y][x] != null) {
        playerX = x;
        playerY = y;
    } else {
        System.out.println("Position de départ invalide !");
    }
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
/* */
    public void teleportTo(Location destination) {
    for (int y = 0; y < height; y++) {
        for (int x = 0; x < width; x++) {
            if (map[y][x] == destination) {
                playerX = x;
                playerY = y;
                System.out.println(destination.getDescription());
                return;
            }
        }
    }
}


    public boolean movePlayer(String direction) {
        int newX = playerX;
        int newY = playerY;

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

    public Location getLocationByName(String name) {
    for (int y = 0; y < height; y++) {
        for (int x = 0; x < width; x++) {
            Location loc = map[y][x];
            if (loc != null && loc.getName().equalsIgnoreCase(name)) {
                return loc;
            }
        }
    }
    return null;
}


}
