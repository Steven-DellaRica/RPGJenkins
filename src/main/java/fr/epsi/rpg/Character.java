package fr.epsi.rpg;

public class Character {
    String name;
    String classType;
    int level;
    int experience;

    public Character(String name, String classType) {
        this.name = name;
        this.classType = classType;
        this.level = 1;
        this.experience = 0;
    }

    public void levelUp() {
        this.level ++;
        System.out.println(name + " monte au niveau " + this.level + " !");
    }

    public void completeQuest(Quest quest) {
        System.out.println(name + " a terminé la quête : " + quest.getQuestName());
        experience += quest.getReward();
        System.out.println("Gagne " + quest.getReward() + " points d'expérience. Expérience totale : " + experience);

        if (experience >= 100) {
            levelUp();
            experience -= 100;
        }
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

    public int getExperience() {
        return experience;
    }

    @Override
    public String toString() {
        return "Nom: " + name + ", Classe: " + classType + ", Niveau: " + level;
    }

    public void useSpecialAbility(){

    }
}
