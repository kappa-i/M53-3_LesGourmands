package main;

public class Teleport extends Command {
    private Player player;
    private WorldMap worldMap;

    public Teleport(Player player, WorldMap map) {
        super("teleport", "Utilise un téléporteur pour se déplacer vers une zone");
        this.player = player;
        this.worldMap = map;
    }

    @Override
    public void execute(String[] args) {
        if (args.length < 2) {
            System.out.println("Usage: teleport <nom_de_la_zone>");
            return;
        }

        String destinationName = args[1];
        Location destination = worldMap.getLocationByName(destinationName);

        if (destination == null) {
            System.out.println("Zone inconnue.");
            return;
        }

        // Vérifie si le joueur a un téléporteur correspondant
        for (Item item : player.getInventory()) {
            if (item instanceof Teleporter) {
                Teleporter tp = (Teleporter) item;
                if (tp.getTargetLocationName().equalsIgnoreCase(destinationName)) {
                    worldMap.teleportTo(destination);
                    System.out.println("Vous vous êtes téléporté à " + destinationName);
                    return;
                }
            }
        }

        System.out.println("Vous n'avez pas de téléporteur pour cette destination.");
    }
}
