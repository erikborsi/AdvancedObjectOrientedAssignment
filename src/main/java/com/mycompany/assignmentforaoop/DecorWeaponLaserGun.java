package com.mycompany.assignmentforaoop;

/**
 *
 * @author Erik Borsi
 */
public class DecorWeaponLaserGun extends PlayerDecorator {

    Player player;

    public DecorWeaponLaserGun(Player player) {
        this.player = player;
    }

    @Override
    public String getTypeOfCharacter() {
        return player.getTypeOfCharacter() + " with a lasergun,";

    }

    @Override
    public double getHealthPoints() {
        return player.getHealthPoints();

    }

    @Override
    public double getWeaponDamagePoints() {
        return player.getWeaponDamagePoints() + 50;

    }

    @Override
    public double getArmourPoints() {
        return player.getArmourPoints();

    }

    @Override
    public double getWeightOfPlayer() {
        return player.getWeightOfPlayer() + 10;  
    }
}
