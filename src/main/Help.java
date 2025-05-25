package main;


import java.util.ArrayList;

public class Help extends Command {
    private ArrayList<String> helpInfo;

    public Help() {
        this.name = "help";
        helpInfo = new ArrayList<>();
        helpInfo.add("help - Show available commands");
        helpInfo.add("move - Move to a new location");
        helpInfo.add("inspect - Inspect an item");
        helpInfo.add("take - Take an item");
    }

    public void displayHelpInfo() {
        for (String info : helpInfo) {
            System.out.println(info);
        }
    }

    @Override
    public void execute(String input) {
        displayHelpInfo();
    }
}

/* import java.util.ArrayList;

public class Help extends Command {

    ArrayList<String> helpInfo = new ArrayList<>();

    public void displayHelpInfo();

} */

