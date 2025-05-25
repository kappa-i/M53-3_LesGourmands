package main;

import java.util.ArrayList;

public class Help extends Command {
    private ArrayList<String> helpInfo;

    public Help() {
        super("help", "Displays help information.");
        helpInfo = new ArrayList<>();
        helpInfo.add("help - show commands");
        helpInfo.add("move - move to a location");
        helpInfo.add("inspect - inspect an object");
        helpInfo.add("take - take an object");
    }

    @Override
    public void execute(String input) {
        displayHelpInfo();
    }

    public void displayHelpInfo() {
        System.out.println("Available commands:");
        for (String info : helpInfo) {
            System.out.println(info);
        }
    }
}


/* import java.util.ArrayList;

public class Help extends Command {

    ArrayList<String> helpInfo = new ArrayList<>();

    public void displayHelpInfo();

} */

