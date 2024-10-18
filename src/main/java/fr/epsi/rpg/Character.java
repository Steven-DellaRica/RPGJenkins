package fr.epsi.rpg;

public class Character {
    String name;
    String classType;
    int level;

    public Character(String name, String classType) {
        this.name = name;
        this.classType = classType;
        this.level = 1;
    }

    public void levelUp() {
        this.level ++;
        System.out.println(name + " monte au niveau " + this.level + " !");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClassType() {
        return classType;
    }

    public void setClassType(String classType) {
        this.classType = classType;
    }

    public int getLevel() {
        return level;
    }

    @Override
    public String toString() {
        return "Nom: " + name + ", Classe: " + classType + ", Niveau: " + level;
    }

    public void useSpecialAbility(){

    }
}
