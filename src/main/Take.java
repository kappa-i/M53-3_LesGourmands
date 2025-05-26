package main;

public class Take extends Command {
    private Player player;
    private WorldMap map;

    public Take(Player player, WorldMap map) {
    super("take", "Ramasse un objet dans la pièce");
    this.player = player;
    this.map = map;
}


    @Override
    public void execute(String[] args) {
        Location currentLocation = map.getPlayerLocation();
        if (currentLocation.getItems().isEmpty()) {
            System.out.println("Il n'y a rien à prendre ici.");
        } else {
            Item item = currentLocation.getItems().get(0); // Prend le premier objet
            player.addItem(item);
            currentLocation.removeItem(item);
            System.out.println("Vous avez pris : " + item.getName());
        }
    }
}



/* public class Take {
    
    public void putObjectInInvenrory();

} */
