package main;

public class Help extends Command {
    private Player player;

    public Help(Player player) {
        super("help", "Affiche les commandes disponibles");
        this.player = player;
    }

    @Override
    public void execute(String[] args) {
        System.out.println("Commandes disponibles :");
        System.out.println("- help : Affiche les commandes disponibles");
        System.out.println("- map : Permet d'afficher la carte");
        System.out.println("- move <north|south|east|west> : Déplace le joueur");
        System.out.println("- look : Affiche les objets et la description de la zone");
        System.out.println("- unlock : Permet de débloquer une zone si vous avezune clé dans l'inventaire");
        System.out.println("- inventory : Affiche les objets dans l'inventaire");
        System.out.println("- inspect <item> : Donne la description d'un objet");
        System.out.println("- take <objet> : Ramasse un objet dans la pièce");
        System.out.println("- drop <objet> : Dépose un objet de l'inventaire dans la zone");
        System.out.println("- solve <nom_de_l'énigme> : Permet de résoudre une énigme");
        
        
        for (Item item : player.getInventory()) {
            if (item instanceof Teleporter) {
                System.out.println("- teleport <nom_de_zone> : Permet de vous téléporter à une zone");
                break;
            }
        }
    }
}