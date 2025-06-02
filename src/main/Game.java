
package main;
import java.util.Scanner;



public class Game {
    private Player player;
    private WorldMap worldMap;
    private CommandRegistry commandRegistry;

    public Game() {
        player = new Player();
        worldMap = new WorldMap(6, 2);
        commandRegistry = new CommandRegistry();

        // Création d'une pièce
        Location room1 = new Location("Aisschat Street", "Vous êtes à Aisschiat Street", false);
        Location room2 = new Location("Gabwaaay Bay", "Vous êtes à Gabwaaay Bay", true);
        Location room3 = new Location("Dibiril House", "Vous êtes à Dibiril House", true);
        Location room4 = new Location("Eko CoffeeShop", "Vous êtes à Eko CoffeeShop", true);
        Location room5 = new Location("Nuno's Park", "Vous êtes à Nuno's Park", true);
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
        worldMap.addLocation(room6, 5, 0);
        worldMap.addLocation(room7, 0, 1); 
        worldMap.addLocation(room8, 1, 1);
        worldMap.addLocation(room9, 2, 1);
        worldMap.addLocation(room10, 3, 1);
        worldMap.addLocation(room11, 4, 1);
        worldMap.addLocation(room12, 5, 1);

        worldMap.setPlayerLocation(room1);

        
        // Création d'énigmes
        Puzzle p1 = new Puzzle("EnigmeAissya","Le plat","Quel est le plat préféré de Aissya ? : \n - Lablabi \n - Sushi \n - Fricassé" ,"Lablabi");
        Puzzle p2 = new Puzzle("EnigmeGabriel","Mesurons Gab","Quel est la taille de Gabriel ? : \n - 1m65 \n - 1m70 \n - 1m75" ,"1m75");
        Puzzle p3 = new Puzzle("EnigmeDjibril","Langues de Djibril","Combien de langues parles Djibril : \n - 2 \n - 3 \n - 4" ,"3");
        Puzzle p4 = new Puzzle("EnigmeCindy","L'animal","En basket, Cindy a fait parti d'une équipe de : \n - 1erLigue \n - LigueA \n - 3èmeLigue" ,"1erLigue");
        Puzzle p5 = new Puzzle("EnigmeNuno","Le prénom","Quel est le deuxième prénom de Nuno ? : \n - José \n - Guilherme \n - João" ,"Guilherme");
        Puzzle p6 = new Puzzle("EnigmeMathias","Un média","Quel est le nom de l'entreprise de Mathias ? : \n - Blurrd.ch \n - BlurrdVision \n - BlurrdCapture" ,"Blurrd.ch");
        Puzzle p7 = new Puzzle("EnigmePierre","Parcours professionnel","Quel est le CFC qu'a eu Pierre avant de venir à l'HEIG-VD ? : \n - Graphiste \n - Garagiste \n - Médiamaticien" ,"Graphiste");
        Puzzle p8 = new Puzzle("EnigmeLuka","L'appelation","Quel est le surnom de Luka : \n - Poire \n - Pastèque \n - Pomme" ,"Pomme");
        Puzzle p9 = new Puzzle("EnigmeRaul","Le rappeur","Quel est le rappeur préféré de Raul ? : \n - Alonzo \n - JUL \n - NAPS" ,"JUL");
        Puzzle p10 = new Puzzle("EnigmeCarla","","Quels sont les origines de Carla ? : \n - Maroc & Guadloupe \n - Liban & Jamaique \n - Vietnam & Bresil" ,"Liban & Jamaique");
        Puzzle p11 = new Puzzle("EnigmeMatteo","F2SS","Le média de Matteo, de quoi parle-t-il ? : \n - Rap \n - Actu \n - Mode" ,"Rap");
        Puzzle p12 = new Puzzle("EnigmeAlex","La victoire","A quel jeu Alex est-il champion de Suisse romande ? : \n - LeagueOfLegend \n - Valorant \n - CallOfDuty" ,"LeagueOfLegend");
        

        // Ajout d'items
        player.addItem(new Key("Clé", "Cette clé permet de déverouiller une zone"));
        room1.addItem(p1);
        room2.addItem(p2);
        room3.addItem(p3);
        room4.addItem(p4);
        room5.addItem(p5);
        room6.addItem(p6);
        room7.addItem(p7);
        room8.addItem(p8);
        room9.addItem(p9);
        room10.addItem(p10);
        room11.addItem(p11);
        room12.addItem(p12);


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
