package com.mycompany.assignmentforaoop;

/**
 *
 * @author Erik Borsi
 * Pick up weapon type one from the "PLACE IT HAS BEEN FOUND - UNDER CONSTRUCITON"
 * Giving different damage points
 * 
 */
public class DecorWeaponLightSaber extends PlayerDecorator {

    Player player;

    public DecorWeaponLightSaber(Player player) {
        this.player = player;
    }

    @Override
    public String getTypeOfCharacter() {
        return player.getTypeOfCharacter() + " with a lightsaber,";

    }

    @Override
    public double getHealthPoints() {
        return player.getHealthPoints();

    }

    @Override
    public double getWeaponDamagePoints() {
        return player.getWeaponDamagePoints() + 75;

    }

    @Override
    public double getArmourPoints() {
        return player.getArmourPoints() + 15;

    }

    @Override
    public double getWeightOfPlayer() {
        return player.getWeightOfPlayer() + 5;    
    }
}
