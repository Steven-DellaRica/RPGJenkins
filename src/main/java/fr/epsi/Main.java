package fr.epsi;

public class Main {
    public static void main(String[] args) {
        Character gandalfChar = new Character("Gandalf", "Mage");
        Character legolasChar = new Character("Legolas", "Archer");

        System.out.println("Nom du " + gandalfChar.getClassType() + " : " + gandalfChar.getName() + " Niveau du " + gandalfChar.getClassType() + " : " + gandalfChar.getLevel());
        System.out.println("Nom de l'" + legolasChar.getClassType() + " : " + legolasChar.getName() + " Niveau du " + legolasChar.getClassType() + " : " + gandalfChar.getLevel());

        legolasChar.levelUp();
        System.out.println("Nom du " + gandalfChar.getClassType() + " : " + gandalfChar.getName() + " Niveau du " + gandalfChar.getClassType() + " : " + gandalfChar.getLevel());
        System.out.println("Nom de l'" + legolasChar.getClassType() + " : " + legolasChar.getName() + " Niveau du " + legolasChar.getClassType() + " : " + legolasChar.getLevel());
    }
}