package org.example;


public class Mystic extends Player{
    private boolean vulnerable=true;

    @Override
    public String toString() {
        return "Archer is a Player ";
    }
    @Override
    public boolean isVulnerable() {
        return vulnerable;
    }
    @Override
    public int getDamagePoints(Player player) {
        if (isVulnerable()) {
            return 5;
        }
        return 15;
    }
    public void prepareSpell() {
    vulnerable = false;
    }
}