package fr.epsi;

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
        this.level += 1;
    }

    public String getName() {
        return name;
    }
    public String getClassType() {
        return classType;
    }
    public int getLevel() {
        return level;
    }
}
