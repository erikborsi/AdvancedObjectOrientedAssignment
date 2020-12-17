package com.mycompany.assignmentforaoop;

/**
 *
 * @author Erik Borsi
 * Pick up weapon type one from the "PLACE IT HAS BEEN FOUND - UNDER CONSTRUCITON"
 * Giving different damage points
 * 
 */
public class PickUpWeapon01 extends PlayerDecorator {

    Player player;

    public PickUpWeapon01(Player player) {
        this.player = player;
    }

    @Override
    public String getTypeOfCharacter() {
        return player.getTypeOfCharacter() + " with weapon,";

    }

    @Override
    public double getHealthPoints() {
        return 0 + player.getHealthPoints();

    }

    @Override
    public double getWeaponDamagePoints() {
        return 100 + player.getWeaponDamagePoints();

    }

    @Override
    public double getArmourPoints() {
        return 0 + player.getArmourPoints();

    }

    @Override
    public double getWeightOfPlayer() {
        return 0 + player.getWeightOfPlayer();    
    }
}
