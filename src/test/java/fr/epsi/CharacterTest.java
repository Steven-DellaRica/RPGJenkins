package fr.epsi;

import fr.epsi.rpg.Character;
import fr.epsi.rpg.Mage;
import fr.epsi.rpg.Quest;
import fr.epsi.rpg.Warrior;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CharacterTest {

    private Mage mage;
    private Warrior warrior;
    private Quest easyQuest;
    private Quest hardQuest;

    @BeforeEach
    public void setUp() {
        mage = new Mage("Gandalf");
        warrior = new Warrior("Aragorn");
        easyQuest = new Quest("Sauver les poules", "Facile", 50);
        hardQuest = new Quest("Affronter les poules", "Difficile", 150);
    }

    @Test
    public void testConstructorInitializesCorrectly() {
        Character character = new Character("Gandalf", "Mage");
        assertEquals(1, character.getLevel());
        assertEquals("Gandalf", character.getName());
        assertEquals("Mage", character.getClassType());
    }

    @Test
    public void testLevelUpIncreasesLevel() {
        Character character = new Character("Legolas", "Archer");
        character.levelUp();
        assertEquals(2, character.getLevel());
    }

    @Test
    public void testCompleteQuestIncreasesExperience() {
        warrior.completeQuest(easyQuest);
        assertEquals(50, warrior.getExperience());
        assertEquals(1, warrior.getLevel()); // Niveau doit rester à 1

        warrior.completeQuest(hardQuest);
        assertTrue(warrior.getExperience() >= 100);
        assertEquals(2, warrior.getLevel());
    }

    @Test
    public void testLevelUpAfterMultipleQuests() {
        mage.completeQuest(easyQuest);
        mage.completeQuest(easyQuest);

        assertEquals(2, mage.getLevel());
        assertEquals(0, mage.getExperience());

        mage.completeQuest(hardQuest);
        assertEquals(3, mage.getLevel());
        assertEquals(50, mage.getExperience());
    }
}