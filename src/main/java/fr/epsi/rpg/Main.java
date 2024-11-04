package fr.epsi.rpg;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    private static ArrayList<Character> characters = new ArrayList<>();
    private static ArrayList<Quest> quests = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        characters.add(new Archer("Legolas"));
        characters.add(new Mage("Gandalf"));

        quests.add(new Quest("Aller chercher les poulets perdus", "Facile", 50));
        quests.add(new Quest("Tuer un monstre", "Moyen", 75));
        quests.add(new Quest("Sauver le monde", "Difficile", 150));

        boolean running = true;
        while (running) {
            System.out.println("\nMenu:");
            System.out.println("1. Afficher les personnages");
            System.out.println("2. Ajouter un personnage");
            System.out.println("3. Modifier un personnage");
            System.out.println("4. Supprimer un personnage");
            System.out.println("5. Faire une quête");
            System.out.println("6. Quitter");

            int choice = getUserChoice();

            switch (choice) {
                case 1:
                    displayCharacter();
                    break;
                case 2:
                    addCharacter();
                    break;
                case 3:
                    modifyCharacter();
                    break;
                case 4:
                    deleteCharacter();
                    break;
                case 5:
                    characterCompleteQuest();
                    break;
                case 6:
                    running = false;
                    break;
                default:
                    System.out.println("Choix non valide.");
            }
        }
    }

    private static int getUserChoice() {
        int choice = -1;
        boolean validInput = false;

        while (!validInput) {
            try {
                System.out.println("Entrez votre choix : ");
                choice = scanner.nextInt();
                validInput = true;
            } catch (InputMismatchException e) {
                System.out.println("Entrée non valide. Veuillez entrer un chiffre.");
                scanner.next();
            }

        }

        return choice;
    }

    private static void displayCharacter() {
        for (int i = 0; i < characters.size(); i++) {
            System.out.println((i+1) + ". " + characters.get(i));
        }
    }

    private static void displayQuest() {
        for (int i = 0; i < quests.size(); i++) {
            System.out.println((i+1) + ". " + quests.get(i));
        }
    }

    private static void addCharacter() {
        System.out.println("Entrez le nom du personnage");
        String name = scanner.next();
        System.out.println("Choisissez une classe (1. Guerrier, 2. Mage, 3. Archer");
        int classe = scanner.nextInt();

        if(classe == 1) {
            characters.add(new Warrior(name));
        } else if(classe == 2) {
            characters.add(new Mage(name));
        } else if(classe == 3) {
            characters.add(new Archer(name));
        } else {
            System.out.println("Choisissez une classe valide.");
        }
    }

    private static void modifyCharacter() {
        displayCharacter();
        System.out.println("Choisissez un personnage à modifier (par numéro) :");
        int index = scanner.nextInt() - 1;
        if(index >= 0 && index < characters.size()) {
            System.out.println("Entrez le nouveau nom du personnage :");
            String newName = scanner.next();
            characters.get(index).setName(newName);
        } else {
            System.out.println("Personnage non trouvé.");
        }
    }

    private static void deleteCharacter() {
        displayCharacter();
        System.out.println("Choisissez un personnage à supprimer (par numéro) :");
        int index = scanner.nextInt() - 1;
        if(index >= 0 && index < characters.size()) {
            characters.remove(index);
            System.out.println("Personnage supprimé");
        } else {
            System.out.println("Personnage non trouvé");
        }
    }

    private static void characterCompleteQuest() {
        displayCharacter();
        System.out.println("Choisissez un personnage à envoyer faire une quête (par numéro) :");
        int index = scanner.nextInt() - 1;
        if(index >= 0 && index < characters.size()) {
            displayQuest();
            System.out.println("Quel quête voulez vous effectuer ?");
            int index2 = scanner.nextInt() - 1;
            if(index2 >= 0 && index < quests.size())
            {
                characters.get(index).completeQuest(quests.get(index2));
            }

        } else {
            System.out.println("Personnage non trouvé.");
        }
    }
}