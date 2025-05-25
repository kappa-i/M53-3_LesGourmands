package main;

public class Letter extends Item {
    private String solution;

    public Letter(String name, String solution) {
        super(name, true);
        this.solution = solution;
    }

    @Override
    public String inspect() {
        return "The letter says: " + solution;
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

