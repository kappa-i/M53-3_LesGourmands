package main;

import java.util.HashMap;

public class CommandRegistry {
    private HashMap<String, Command> commands = new HashMap<>();

    public void registerCommand(Command cmd) {
        commands.put(cmd.name, cmd);
    }

    public void executeCommand(String input) {
        String[] parts = input.split(" ");
        String cmd = parts[0];

        if (commands.containsKey(cmd)) {
            commands.get(cmd).execute(input);
        } else {
            System.out.println("Unknown command.");
        }
    }
}
