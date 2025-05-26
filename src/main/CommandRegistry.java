package main;


import java.util.HashMap;

public class CommandRegistry {
    private HashMap<String, Command> commands = new HashMap<>();

    public void registerCommand(Command command) {
        commands.put(command.getName(), command);
    }

    public Command getCommand(String name) {
        return commands.get(name);
    }

    public void executeCommand(String inputLine) {
        String[] parts = inputLine.split(" ");
        Command command = getCommand(parts[0]);
        if (command != null) {
            command.execute(parts);
        } else {
            System.out.println("Commande inconnue.");
        }
    }

    public void printAllCommands() {
        for (Command c : commands.values()) {
            System.out.println("- " + c.getName() + ": " + c.getDescription());
        }
    }
}


