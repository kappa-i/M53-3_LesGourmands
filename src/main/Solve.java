package main;


public class Solve extends Command {
    private Player player;

    public Solve(Player player) {
        super("solve", "Résout un puzzle dans l'inventaire");
        this.player = player;
    }

    @Override
    public void execute(String[] args) {
        boolean found = false;

        for (Item item : player.getInventory()) {
            if (item instanceof Puzzle) {
                ((Puzzle) item).solve();
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Aucun puzzle à résoudre dans l'inventaire.");
        }
    }
}
