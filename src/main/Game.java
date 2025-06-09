
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
        Location start = new Location("Depart", "Ceci est la case de départ", false);
        Location fleche1 = new Location(">", "Sentier battu...", false);
        Location fleche2 = new Location("v", "Sentier battu...", false);
        Location fleche3 = new Location("<", "Sentier battu...", false);
        Location fleche4 = new Location("<", "Sentier battu...", false);
        Location fleche5 = new Location(">", "Sentier battu...", false);
        Location fleche6 = new Location("^", "Sentier battu...", false);
        Location fleche7 = new Location(">", "Sentier battu...", false);
        Location fleche8 = new Location("^", "Sentier battu...", false);


        Location room1 = new Location("Aisschat-Street", "Vous êtes à Aisschat Street", false);
        Location room2 = new Location("GabwaaayBay", "Vous êtes à Gabwaaay Bay", true);
        Location room3 = new Location("Dibiril-House", "Vous êtes à Dibiril House", true);
        Location room4 = new Location("Eko-CoffeeShop", "Vous êtes à Eko CoffeeShop", true);
        Location room5 = new Location("Nuno's-Park", "Vous êtes à Nuno's Park", true);
        Location room6 = new Location("Sackkee-Studio", "Vous êtes à Sackkee Studio", true);
        Location room7 = new Location("Pierre-Stone", "Vous êtes à Pierre Stone", true);
        Location room8 = new Location("Tiakola-Arena", "Vous êtes à Tialoka Arena", true);
        Location room9 = new Location("Vieux-Port-de-Raul", "Vous êtes à Vieux Port de Raul", true);
        Location room10 = new Location("CilsByCarla", "Vous êtes à CilsByCarla", true);
        Location room11 = new Location("F2SS-Hall", "Vous êtes à F2SS Hall", true);
        Location room12 = new Location("Alex-GameCenter", "Vous êtes à Alex GameCenter", true);
        Location finish = new Location("Fin", "Ceci est la case de fin", true);



        start.addItem(new Letter("Lettre1", "N'hésiter pas à fouiller les sentiers battus avec la commade 'look' !"));
        fleche2.addItem(new Letter("Lettre2", "Inspecter une clé sert à connaître à quoi elle sert ^^"));
        fleche5.addItem(new Letter("Lettre3", "Courage, dernière ligne droite !"));
        fleche6.addItem(new Letter("Lettre4", "Quel est cet objet brillant devant moi ??"));
        finish.addItem(new Letter("LettreFinale", "Bravo ! Vous avez résolu toutes les énigmes du jeu !") );

        worldMap.addLocation(fleche1, 2, 0);
        worldMap.addLocation(fleche2, 3, 1);
        worldMap.addLocation(fleche3, 1, 2);
        worldMap.addLocation(fleche4, 3, 2);
        worldMap.addLocation(fleche5, 0, 5);
        worldMap.addLocation(fleche6, 4, 4);
        worldMap.addLocation(fleche7, 5, 3);
        worldMap.addLocation(fleche8, 5, 2);


        worldMap.addLocation(start, 0, 0);
        worldMap.addLocation(room1, 1, 0);
        worldMap.addLocation(room2, 3, 0);
        worldMap.addLocation(room3, 5, 1);
        worldMap.addLocation(room4, 4, 5);
        worldMap.addLocation(room5, 2, 2);
        worldMap.addLocation(room6, 0, 2);
        worldMap.addLocation(room7, 0, 3); 
        worldMap.addLocation(room8, 0, 4);
        worldMap.addLocation(room9, 1, 5);
        worldMap.addLocation(room10, 4, 3);
        worldMap.addLocation(room11, 3, 5);
        worldMap.addLocation(room12, 2, 5);
        worldMap.addLocation(finish, 5, 0);
 
        worldMap.setPlayerStartPosition(0, 0); 
        
        // Création d'énigmes
        Puzzle p1 = new Puzzle("EnigmeAissya","Le plat","Quel est le plat préféré de Aissya ? : \n - Lablabi \n - Sushi \n - Fricassé" ,"Lablabi", new Key("cleAissya", "Cette clé permet d'ouvrir la zone Gabwaaay Bay", "GabwaaayBay"),player);
        
        Puzzle p2 = new Puzzle("EnigmeGabriel","Mesurons Gab","Quel est la taille de Gabriel ? : \n - 1m65 \n - 1m70 \n - 1m75" ,"1m70", new Key("cleGab", "Cette clé permet d'ouvrir la zone Nuno's Park", "Nuno's-Park"),player);
        
        Puzzle p3 = new Puzzle("EnigmeDjibril","Langues de Djibril","Combien de langues parles Djibril : \n - 2 \n - 3 \n - 4" ,"3", new Key("cleDjib", "Une clé gagnée", "Fin"),player);
        
        Puzzle p4 = new Puzzle("EnigmeCindy","L'animal","En basket, Cindy a fait parti d'une équipe de : \n - 1erLigue \n - LigueA \n - 3èmeLigue" ,"1erLigue", new Key("cleCindy", "Cette clé permet d'ouvrir la zone CilsByCarla", "CilsByCarla"),player);
        
        Puzzle p5 = new Puzzle("EnigmeNuno","Le prénom","Quel est le deuxième prénom de Nuno ? : \n - José \n - Guilherme \n - João" ,"Guilherme", new Key("cleNuno", "Cette clé permet d'ouvrir la zone Sackke Studio", "Sackkee-Studio"),player);
        
        
        Puzzle p6 = new Puzzle("EnigmeMathias","Un média","Quel est le nom de l'entreprise de Mathias ? : \n - Blurrd.ch \n - BlurrdVision \n - BlurrdCapture" ,"Blurrd.ch", new Key("cleMathias", "Cette clé permet d'ouvrir la zone Pierre Stone", "Pierre-Stone"),player);
        
        
        Puzzle p7 = new Puzzle("EnigmePierre","Parcours professionnel","Quel est le CFC qu'a eu Pierre avant de venir à l'HEIG-VD ? : \n - Graphiste \n - Garagiste \n - Médiamaticien" ,"Graphiste", new Key("clePierre", "Cette clé permet d'ouvrir la zone Tiakola Arena", "Tiakola-Arena"),player);
        
        
        Puzzle p8 = new Puzzle("EnigmeLuka","L'appelation","Quel est le surnom de Luka : \n - Poire \n - Pastèque \n - Pomme" ,"Pomme", new Key("cleLuka", "Cette clé permet d'ouvrir la zone Vieux Port de Raul", "Vieux-Port-de-Raul"),player);
        
        
        Puzzle p9 = new Puzzle("EnigmeRaul","Le rappeur","Quel est le rappeur préféré de Raul ? : \n - Alonzo \n - JUL \n - NAPS" ,"JUL", new Key("cleRaul", "Cette clé permet d'ouvrir la zone Alex GameCenter", "Alex-GameCenter"),player);
        
        
        Puzzle p10 = new Puzzle("EnigmeCarla","","Quels sont les origines de Carla ? : \n - Maroc & Guadloupe \n - Liban & Jamaique \n - Vietnam & Bresil" ,"Liban & Jamaique", new Key("cleCarla", "Cette clé permet d'ouvrir la zone Dibiril-House", "Dibiril-House"),player);
        
        
        Puzzle p11 = new Puzzle("EnigmeMatteo","F2SS","Le média de Matteo, de quoi parle-t-il ? : \n - Rap \n - Actu \n - Mode" ,"Rap", new Key("cleMatteo", "Cette clé permet d'ouvrir la zone Eko CofeeShop", "Eko-CoffeeShop"),player);
        
        
        Puzzle p12 = new Puzzle("EnigmeAlex","La victoire","A quel jeu Alex est-il champion de Suisse romande ? : \n - LeagueOfLegend \n - Valorant \n - CallOfDuty" ,"LeagueOfLegend", new Key("cleAlex", "Cette clé permet d'ouvrir la zone F2SS Hall", "F2SS-Hall"),player);
        
        
        // Création du teleporteur
        Teleporter tp = new Teleporter("TeleportCrystal", "Ce teleporteur permet de se déplacer sur les zones dévérouillées");

        // Ajout d'items
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
        room1.addItem(tp);


        // Enregistrement des commandes
        commandRegistry.registerCommand(new Help(player));
        commandRegistry.registerCommand(new Move(player, worldMap));
        commandRegistry.registerCommand(new Inventory(player));
        commandRegistry.registerCommand(new Inspect(player));
        commandRegistry.registerCommand(new Take(player, worldMap));
        commandRegistry.registerCommand(new ShowMap(worldMap));
        commandRegistry.registerCommand(new Look(worldMap));
        commandRegistry.registerCommand(new Unlock(player, worldMap));
        commandRegistry.registerCommand(new Solve(player));
        commandRegistry.registerCommand(new Teleport(player, worldMap));
        commandRegistry.registerCommand(new Drop(player, worldMap));

    }

    public void run() {
        System.out.println("Bienvenue dans le jeu d'aventure DAI2. Taper 'help' pour voir la liste de commandes");
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("> ");
            String input = scanner.nextLine();
            commandRegistry.executeCommand(input);
            
        }
    }
}
