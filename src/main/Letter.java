package main;

public class Letter extends Item {
    private String solution;

    public Letter(String name, String solution) {
        this.name = name;
        this.solution = solution;
    }

    @Override
    public boolean canBeInspected() {
        return true;
    }

    @Override
    public String inspect() {
        return "This is a letter: " + solution;
    }

    @Override
    public void addToInventory() {
        System.out.println(name + " added to inventory.");
    }

    @Override
    public void drop() {
        System.out.println(name + " dropped.");
    }

    public String getSolution() {
        return solution;
    }
}

/* 
public class Letter extends Item {
     public Letter (String name) {
        super(name);
    }
 */   

