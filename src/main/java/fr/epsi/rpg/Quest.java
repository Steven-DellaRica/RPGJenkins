package fr.epsi.rpg;

public class Quest {
    private String questName;
    private String difficulty; // Par exemple : "Facile", "Moyenne", "Difficile"
    private int reward; // La récompense en points d'expérience

    // Constructeur
    public Quest(String questName, String difficulty, int reward) {
        this.questName = questName;
        this.difficulty = difficulty;
        this.reward = reward;
    }

    // Getters
    public String getQuestName() {
        return questName;
    }

    public String getDifficulty() {
        return difficulty;
    }

    public int getReward() {
        return reward;
    }

    @Override
    public String toString() {
        return "Quête: " + questName + ", Difficulté: " + difficulty + ", Récompense: " + reward + " XP";
    }
}
