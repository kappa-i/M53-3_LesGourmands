package main;

public class Letter extends Item {
    public Letter(String name, String description) {
        super(name, description);
    }

    @Override
    public String inspect() {
        return description;
    }
}


