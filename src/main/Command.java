package main;

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
