package org.example;

public class Archer extends Player{
    @Override
    public String toString() {
        return "Archer is a Player";
    }
    @Override
    public boolean isVulnerable() {
        return false;
    }
    @Override
    public int getDamagePoints(Player player) {
        if (player.isVulnerable()) {
            return 8;
        }
        return 4;
    }
}
