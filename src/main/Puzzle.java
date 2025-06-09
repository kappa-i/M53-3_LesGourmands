package main;

import java.util.Scanner;

public class Puzzle extends Item {
    private String question;
    private String answer;
    private boolean resolved = false;
    private Key reward;
    private Player player; 


    public Puzzle(String name, String description, String question, String answer, Key reward, Player player) {
    super(name, description);
    this.question = question;
    this.answer = answer.toLowerCase();
    this.reward = reward;
    this.player = player;
}


    @Override
    public boolean canBeInspected() {
        return !resolved;
    }

    @Override
    public String inspect() {
        if (resolved) {
            return "Puzzle déjà résolu.";
        }
        return "Utiliser la commande <solve> pour résoudre cette énigme";
    }

    public void solve() {
        if (resolved) {
            System.out.println("Cette énigme est déjà résolu.");
            return;
        }

        System.out.println("Énigme : " + question);
        Scanner scanner = new Scanner(System.in);
        System.out.print("Votre réponse : ");
        String input = scanner.nextLine().toLowerCase();

        if (input.equals(answer)) {
            resolved = true;
            System.out.println("Bonne réponse ! Énigme résolue !");
            player.addItem(reward);
            System.out.println("Vous avez reçu une clé !");
            player.removeItem(this.name);
        } else {
            System.out.println("Mauvaise réponse.");
        }
    }

    @Override
    public void addToInventory() {
        System.out.println(name + " ajouté à l'inventaire.");
    }

    @Override
    public void drop() {
        System.out.println(name + " retiré de l'inventaire.");
    }

    public boolean isResolved() {
        return resolved;
    }
}
