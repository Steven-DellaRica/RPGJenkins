package fr.epsi.rpg;

public class Archer extends Character {

    private int health;

    public Archer(String name) {
        super(name, "Archer");
        this.health = 100;
    }

    @Override
    public void useSpecialAbility() {
        System.out.println(name + " utilise une attaque spéciale, pew pew !");
    }

    @Override
    public String toString() {
        return super.toString() + ", Vie: " + health;
    }
}
