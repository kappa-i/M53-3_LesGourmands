package main;

public class Inspect extends Command {
    private Player player;

    public Inspect(Player player) {
        super("inspect", "Affiche la description d'un objet de l'inventaire");
        this.player = player;
    }

    @Override
    public void execute(String[] args) {
        if (args.length < 2) {
            System.out.println("Utilisation : inspect <nom_objet>");
            return;
        }

        String targetName = args[1];

        for (Item item : player.getInventory()) {
            if (item.getName().equalsIgnoreCase(targetName)) {
                System.out.println(item.inspect());
                return;
            }
        }

        System.out.println("Aucun objet nommé \"" + targetName + "\" trouvé dans l'inventaire.");
    }
}