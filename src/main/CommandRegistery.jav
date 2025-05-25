package main;

import java.util.HashMap;

public class CommandRegistry {
    private HashMap<String, Command> commands;

    public CommandRegistry() {
        commands = new HashMap<>();
    }

    public void registerCommand(Command command) {
        commands.put(command.name.toLowerCase(), command);
    }

    public void executeCommand(String verb, String input) {
        Command cmd = commands.get(verb.toLowerCase());
        if (cmd != null) {
            cmd.execute(input);
        } else {
            System.out.println("Unknown command: " + verb);
        }
    }
}
