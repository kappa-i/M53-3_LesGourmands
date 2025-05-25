package main;

public class Puzzle extends Item {

    public Puzzle(String name) {
        this.name = name;
    }

    @Override
    public boolean canBeInspected() {
        return true;
    }

    @Override
    public String inspect() {
        return "This is a puzzle. Solve it!";
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


/*public class Puzzle extends Item {

     public Puzzle (String name) {
        super(name);
    }
}*/
