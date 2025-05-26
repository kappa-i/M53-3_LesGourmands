<<<<<<< Updated upstream
package main;

public abstract class Command {
    private String name;
    private String description;

    public void execute();
=======

public abstract class Command {
    protected String name;
    protected String description;

    public Command(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    // Méthode à implémenter dans les sous-classes
    public abstract void execute(String input);
>>>>>>> Stashed changes
}
