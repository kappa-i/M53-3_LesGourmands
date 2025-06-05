package main;
public class Key extends Item {

    private String targetZoneName;  // Nom exact de la zone que la clé peut ouvrir


    public Key(String name, String description, String targetZoneName) {
        super(name, description);
        this.targetZoneName = targetZoneName;
    }

    public String getTargetZoneName() {
        return targetZoneName;
    }

    @Override
    public boolean canBeInspected() {
        return false;
    }

    @Override
    public String inspect() {
        return this.description;
    }

    @Override
    public void addToInventory() {
        System.out.println(name + " added to inventory.");
    }

    @Override
    public void drop() {
        System.out.println(name + " dropped.");
    }

}
/* public class Key extends Item {
    
    public Key(String name) {
        super(name);
    }

}
 */