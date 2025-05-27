
package main;
import java.util.Scanner;



public class Game {
    private Player player;
    private WorldMap worldMap;
    private CommandRegistry commandRegistry;

    public Game() {
        player = new Player();
        worldMap = new WorldMap(2, 2);
        commandRegistry = new CommandRegistry();

        // Création d'une pièce
        Location room1 = new Location("Room1", "You are in a dark room.", false);
        Location room2 = new Location("Room2", "You are in a Light room.", false);
        room1.addItem(new Letter("Letter", "The treasure is east."));
        worldMap.addLocation(room1, 0, 0);
        worldMap.addLocation(room2, 1, 0);
        worldMap.setPlayerLocation(room1);

        // Ajout d'items dans l'inventaire
        player.addItem(new Letter("Lettre", "Ceci est une lettre dans l'inventaire."));


        // Enregistrement des commandes
        commandRegistry.registerCommand(new Help());
        commandRegistry.registerCommand(new Move(player, worldMap));
        commandRegistry.registerCommand(new Inspect(player));
        commandRegistry.registerCommand(new Take(player, worldMap));
        commandRegistry.registerCommand(new ShowMap(worldMap));
        commandRegistry.registerCommand(new Look(worldMap));


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
