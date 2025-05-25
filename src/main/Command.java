package main;
public abstract class Command {
    protected String name;
    protected String description;

    public Command(String name, String description) {
        this.name = name;
        this.description = description;
    }

    // Méthode que chaque commande devra définir
    public abstract void execute(String[] args);

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }
}


/*
 public abstract class Command {
    protected String name;

    protected String description;

    public String getDescription() {
        return description;
    }

    public Command(String name) {
        this.name = name;
    }

    public void execute();
}
 */
