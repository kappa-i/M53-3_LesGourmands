
package main;
import java.util.Scanner;



public class Game {
    private Player player;
    private WorldMap worldMap;
    private CommandRegistry commandRegistry;

    public Game() {
        player = new Player();
        worldMap = new WorldMap(5, 5);
        commandRegistry = new CommandRegistry();

        // Création d'une pièce
        Location room1 = new Location("Room1", "You are in a dark room.", false);
        Location room2 = new Location("Room2", "You are in a Light room.", false);
        Location room3 = new Location("room3", "You are in the room 3", true);
        room1.addItem(new Letter("Letter", "The treasure is east."));
        worldMap.addLocation(room1, 0, 0);
        worldMap.addLocation(room2, 1, 0);
        worldMap.addLocation(room3, 1, 1);
        worldMap.setPlayerLocation(room1);

        // Ajout d'items dans l'inventaire
        player.addItem(new Key("Clé", "Cette clé permet de déverouiller une zone"));


        // Enregistrement des commandes
        commandRegistry.registerCommand(new Help());
        commandRegistry.registerCommand(new Move(player, worldMap));
        commandRegistry.registerCommand(new Inspect(player));
        commandRegistry.registerCommand(new Take(player, worldMap));
        commandRegistry.registerCommand(new ShowMap(worldMap));
        commandRegistry.registerCommand(new Look(worldMap));
        commandRegistry.registerCommand(new Unlock(player, worldMap));



    }

    public void run() {
        System.out.println("Welcome to the Adventure Game!");
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("> ");
            String input = scanner.nextLine();
            commandRegistry.executeCommand(input);
            /*objet qui connaît toutes les commandes du jeu (move, look, help, etc.) */
        }
    }
}
