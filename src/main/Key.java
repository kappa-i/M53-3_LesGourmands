package main;
public class Key extends Item {

    public Key(String name, String description) {
        super(name, description);
    }

    @Override
    public boolean canBeInspected() {
        return false;
    }

    @Override
    public String inspect() {
        return "This is a key.";
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