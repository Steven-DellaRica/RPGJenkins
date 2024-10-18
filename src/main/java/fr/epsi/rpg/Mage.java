package fr.epsi.rpg;

public class Mage extends Character {

    private int health;

    public Mage(String name) {
        super(name, "Mage");
        this.health = 80;
    }

    @Override
    public void useSpecialAbility() {
        System.out.println(name + " utilise une attaque spéciale, EXPLOSION !");
    }

    @Override
    public String toString() {
        return super.toString() + ", Vie: " + health;
    }
}
