package main;

public class Key extends Item {
    public Key(String name) {
        super(name, true); // une clé peut être inspectée
    }

    @Override
    public String inspect() {
        return "It's a key called: " + name;
    }
}


/* public class Key extends Item {
    
    public Key(String name) {
        super(name);
    }

}
 */