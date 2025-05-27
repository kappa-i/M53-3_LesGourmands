package main;

public class Look extends Command {
    private WorldMap map;

    public Look(WorldMap map) {
        super("look", "Affiche les objets et la description de la zone");
        this.map = map;
    }

    @Override
    public void execute(String[] args) {
        Location current = map.getPlayerLocation();
        
        if (current.isLocked()) {
        System.out.println("Cette zone est verrouillée. Vous ne pouvez pas la regarder.");
        return;
    }
        System.out.println(current.getDescription());

        if (current.getItems().isEmpty()) {
            System.out.println("Il n'y a aucun objet ici.");
        } else {
            System.out.println("Objets dans cette zone :");
            for (Item item : current.getItems()) {
                System.out.println("- " + item.getName());
            }
        }
    }
}

