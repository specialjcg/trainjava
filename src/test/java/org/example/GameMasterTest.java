package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GameMasterTest {

    @Test
    void describe() {
        Character character = new Character();
        character.setLevel(5);
        character.setCharacterClass("Wizard");
        character.setHitPoints(10);
        String description = GameMaster.describe(character);
        assertEquals("You're a level 5 Wizard with 10 hit points.", description);
    }

    @Test
    void testDescribe() {
        Destination destination = new Destination();
        destination.setName("Tol Honeth");
        destination.setInhabitants(41);
        String description = GameMaster.describe(destination);

        assertEquals("You've arrived at Tol Honeth, which has 41" + " inhabitants.", description);
    }

    @Test
    void testDescribe1() {
        assertEquals("You're traveling to your destination by walking.", GameMaster.describe(TravelMethod.WALKING));
    }

    @Test
    void testDescribe2() {
        Character character = new Character();
        character.setCharacterClass("Warrior");
        character.setLevel(1);
        character.setHitPoints(30);
        Destination destination = new Destination();
        destination.setName("Vo Mimbre");
        destination.setInhabitants(332);
        assertEquals("You're a level 1 Warrior with 30 hit points. You've arrived at Vo Mimbre, which has 332 inhabitants.", GameMaster.describe(character, destination));
    }
    @Test
    @Tag("task:4")
    @DisplayName("Describe a character traveling to a destination")
    void testDescribe3() {
        Character character = new Character();
        character.setCharacterClass("Wizard");
        character.setLevel(20);
        character.setHitPoints(120);
        Destination destination = new Destination();
        destination.setName("Camaar");
        destination.setInhabitants(999);
        assertEquals("You're a level 20 Wizard with 120 hit points. You're traveling to your destination on horseback. You've arrived at Camaar, which has 999 inhabitants.", GameMaster.describe(character, destination, TravelMethod.HORSEBACK));
    }
    @Test
    @Tag("task:5")
    @DisplayName("Combined description should handle character and destination with default travel method")
    public void describeCharacterTravelingToDestinationWithoutExplicitTravelMethod() {
        Character character = new Character();
        character.setCharacterClass("Warrior");
        character.setLevel(1);
        character.setHitPoints(30);
        Destination destination = new Destination();
        destination.setName("Vo Mimbre");
        destination.setInhabitants(332);
        assertEquals("You're a level 1 Warrior with 30 hit points. You're traveling to your destination by walking. You've" + " arrived at Vo Mimbre, which has 332 inhabitants.", GameMaster.describe(character, destination));
    }
}