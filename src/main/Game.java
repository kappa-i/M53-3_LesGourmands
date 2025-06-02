
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
        Location room1 = new Location("Aisschiat Street", "Vous êtes à Aisschiat Street", false);
        Location room2 = new Location("Gabwaaay Bay", "Vous êtes à Gabwaaay Bay", false);
        Location room3 = new Location("Dibiril House", "Vous êtes à Dibiril House", true);
        Location room4 = new Location("Eko CoffeeShop", "Vous êtes à Eko CoffeeShop", true);
        Location room5 = new Location("Nuno's Park", "Vous êtes à Nuno's Park", false);
        Location room6 = new Location("Sackkee Studio", "Vous êtes à Sackkee Studio", true);
        Location room7 = new Location("Pierre Stone", "Vous êtes à Pierre Stone", true);
        Location room8 = new Location("Tialoka Arena", "Vous êtes à Tialoka Arena", true);
        Location room9 = new Location("Vieux Port de Raul", "Vous êtes à Vieux Port de Raul", true);
        Location room10 = new Location("CilsByCarla", "Vous êtes à CilsByCarla", true);
        Location room11 = new Location("F2SS Hall", "Vous êtes à F2SS Hall", true);
        Location room12 = new Location("Alex GameCenter", "Vous êtes à Alex GameCenter", true);



        room1.addItem(new Letter("Letter", "The treasure is east."));
        worldMap.addLocation(room1, 0, 0);
        worldMap.addLocation(room2, 1, 0);
        worldMap.addLocation(room3, 2, 0);
        worldMap.addLocation(room4, 3, 0);
        worldMap.addLocation(room5, 4, 0);
        worldMap.addLocation(room6, 0, 1);
        worldMap.addLocation(room7, 0, 2);
        worldMap.addLocation(room8, 0, 3);

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
