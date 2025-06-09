package main;

public class Solve extends Command {
    private Player player;

    public Solve(Player player) {
        super("solve", "Résout un puzzle dans l'inventaire");
        this.player = player;
    }

    @Override
    public void execute(String[] args) {
        if (args.length < 2) {
            System.out.println("Utilisation : solve <nom_de_l'énigme>");
            return;
        }

        String puzzleName = args[1].toLowerCase();

        for (Item item : player.getInventory()) {
            if (item instanceof Puzzle && item.getName().toLowerCase().equals(puzzleName)) {
                ((Puzzle) item).solve();
                return;
            }
        }

        System.out.println("Énigme '" + puzzleName + "' non trouvé dans l'inventaire.");
    }
}
