package main;

public class Puzzle extends Item {
    public Puzzle(String name) {
        super(name, true);
    }

    @Override
    public String inspect() {
        return "It's a puzzle named: " + name;
    }
}


/*public class Puzzle extends Item {

     public Puzzle (String name) {
        super(name);
    }
}*/
