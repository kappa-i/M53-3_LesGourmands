package main;

public class Inspect extends Command {
    private Player player;

    public Inspect(Player player) {
        this.name = "inspect";
        this.player = player;
    }

    public void inspectObject() {
        player.interactWithItems();
    }

    @Override
    public void execute(String input) {
        inspectObject();
    }
}


/* public class Inspect extends Command {
    
    public void inspectObject();
} */

