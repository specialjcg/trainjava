package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class PlayerTest {


    @Test
    @Tag("test:1")
    @DisplayName("The Archer class inherits from the Player class")
    void testArcherIsInstanceOfFighter() throws ClassNotFoundException {
        assertThat(Player.class).isAssignableFrom(Archer.class);
    }
    @Test
    @Tag("test:2")
    @DisplayName("The Archer class overrides the toString method")
    void testArcherOverridesToStringMethod() {
        Archer archer = new Archer();
        assertEquals("Archer is a Player", archer.toString());
   }
    @Test
    @Tag("test:3")
    @DisplayName("The Archer class overrides the isVulnerable method")
    void testArcherOverridesIsVulnerableMethod() {
        Archer archer = new Archer();
        assertFalse(archer.isVulnerable());
    }

    @Test
    @Tag("test:4")
    @DisplayName("A Archer deals 8 damage to a vulnerable target")
    void testArcherOverridesGetDamagePointsMethod() {
        Archer archer = new Archer();
        Player archerVulnerable = new Player();
        assertEquals(8, archer.getDamagePoints(archerVulnerable));

    }
    @Test
    @Tag("test:5")
    @DisplayName("A Archer deals 4 damage to an invulnerable target")
    void testWarriorsDamagePointsWhenTargetNotVulnerable() {
        Archer archer = new Archer();
        Archer archerInVulnerable = new Archer();
        assertEquals(4, archer.getDamagePoints(archerInVulnerable));

    }
    @Test
    @Tag("test:6")
    @DisplayName("A Mystic is vulnerable when not prepared with a spell")
    void testMysticVulnerableByDefault() {
        Mystic mystic = new Mystic();
        assertThat(mystic.isVulnerable()).isTrue();
    }
    @Test
    @Tag("task:7")
    @DisplayName("A Mystic is not vulnerable when prepared with a spell")
    void testWizardVulnerable() {
        Mystic mystic = new Mystic();
        mystic.prepareSpell();
        assertThat(mystic.isVulnerable()).isFalse();
    }
    @Test
    @Tag("test:8")
    @DisplayName("A Mystic deals 5 damage when no spell has been prepared")
    void testWizardsDamagePoints() {
        Mystic mystic = new Mystic();
        assertThat(mystic.getDamagePoints(new Mystic())).isEqualTo(5);
    }
    @Test
    @Tag("task:9")
    @DisplayName("A Mystic deals 15 damage after a spell has been prepared")
    void testWizardsDamagePointsAfterPreparingSpell() {
        Mystic mystic = new Mystic();
        mystic.prepareSpell();
        assertThat(mystic.getDamagePoints(new Mystic())).isEqualTo(15);
    }
}