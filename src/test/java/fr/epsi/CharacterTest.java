package fr.epsi;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CharacterTest {

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
}