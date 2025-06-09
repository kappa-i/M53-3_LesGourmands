package main;

public class Help extends Command {

    public Help() {
        super("help", "Affiche les commandes disponibles");
    }

    @Override
    public void execute(String[] args) {
        System.out.println("Commandes disponibles :");
        System.out.println("- help : Affiche les commandes disponibles");
        System.out.println("- move <direction> : Déplace le joueur");
        System.out.println("- inspect : Affiche les objets dans l'inventaire");
        System.out.println("- inspect <item> : Donne la description d'un objet");
        System.out.println("- take : Ramasse un objet dans la pièce");
        System.out.println("- look : Affiche les objets et la description de la zone");
        System.out.println("- unlock : Permet de débloquer une zone si vous avezune clé dans l'inventaire");
        System.out.println("- solve : Permet de résoudre une énigme");
        System.out.println("- teleport <nom_de_zone>: Permet de vous téléporter à une zone");
        System.out.println("- drop <objet> : Dépose un objet de l'inventaire dans la zone");

    }
}

