package main;

public class Inventory extends Command {
    private Player player;

    public Inventory(Player player) {
        super("inventory", "Montre les objets présents dans l'inventaire");
        this.player = player;
    }

    @Override
    public void execute(String[] args) {
        player.listInventoryItems(); 

    }
}

