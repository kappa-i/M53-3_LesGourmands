package main;

public class Help extends Command {

    public Help(String name, String description) {
        super("help", "Affiche les commandes disponibles");
    }

    @Override
    public void execute(String[] args) {
        System.out.println("Commandes disponibles :");
        System.out.println("- help : Affiche les commandes disponibles");
        System.out.println("- move <direction> : Déplace le joueur");
        System.out.println("- inspect : Inspecte les objets de l'inventaire");
        System.out.println("- take : Ramasse un objet dans la pièce");
    }
}




/* import java.util.ArrayList;

public class Help extends Command {

    ArrayList<String> helpInfo = new ArrayList<>();

    public void displayHelpInfo();

} */

