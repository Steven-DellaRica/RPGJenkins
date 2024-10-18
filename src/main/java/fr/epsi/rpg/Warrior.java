package fr.epsi.rpg;

public class Warrior extends Character{

    private int health;

    public Warrior(String name) {
        super(name, "Warrior");
        this.health = 200;
    }

    @Override
    public void useSpecialAbility() {
        System.out.println(name + " utilise une attaque spéciale, tourbilol!");
    }

    @Override
    public String toString() {
        return super.toString() + ", Vie: " + health;
    }
}
