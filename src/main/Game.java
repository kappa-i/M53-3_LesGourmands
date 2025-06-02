
package main;
import java.util.Scanner;



public class Game {
    private Player player;
    private WorldMap worldMap;
    private CommandRegistry commandRegistry;

    public Game() {
        player = new Player();
        worldMap = new WorldMap(6, 6);
        commandRegistry = new CommandRegistry();

        // Création d'une pièce
        Location room1 = new Location("Aisschiat Street", "Vous êtes à “Aisschiat Street“", false);
        Location room2 = new Location("Gabwaaay Bay", "Vous êtes à “Gabwaaay Bay“", false);
        Location room3 = new Location("Dibiril House", "Vous êtes à “Dibiril House“", true);
        Location room4 = new Location("Savane Gigi", "Vous êtes à “Savane Gigi“", true);


        room1.addItem(new Letter("Letter", "The treasure is east."));
        worldMap.addLocation(room1, 0, 0);
        worldMap.addLocation(room2, 1, 0);
        worldMap.addLocation(room3, 1, 1);
        worldMap.addLocation(room4, 1, 2);
        worldMap.setPlayerLocation(room1);

        
        // Création d'énigmes
        Puzzle p1 = new Puzzle("Puzzle1","Un vieux parchemin tah Djibril.","Qui est-ce qui se fait le plus djoufara ?","Djibril");

        // Ajout d'items
        player.addItem(new Key("Clé", "Cette clé permet de déverouiller une zone"));
        room1.addItem(p1);

        // Enregistrement des commandes
        commandRegistry.registerCommand(new Help());
        commandRegistry.registerCommand(new Move(player, worldMap));
        commandRegistry.registerCommand(new Inspect(player));
        commandRegistry.registerCommand(new Take(player, worldMap));
        commandRegistry.registerCommand(new ShowMap(worldMap));
        commandRegistry.registerCommand(new Look(worldMap));
        commandRegistry.registerCommand(new Unlock(player, worldMap));
        commandRegistry.registerCommand(new Solve(player));
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
