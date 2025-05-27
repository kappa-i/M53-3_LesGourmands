package main;

public class Inspect extends Command {
    private Player player;

    public Inspect(Player player) {
        super("inspect", "Inspecte les objets de l'inventaire");
        this.player = player;
    }

    @Override
    public void execute(String[] args) {
        player.inspectInventory(); // <- méthode plus complète

    }
}

