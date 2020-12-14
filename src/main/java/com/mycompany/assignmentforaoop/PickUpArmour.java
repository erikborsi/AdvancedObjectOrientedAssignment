package com.mycompany.assignmentforaoop;

/**
 *
 * @author Erik Borsi
 */
public class PickUpArmour extends PlayerDecorator {

    Player player;

    public PickUpArmour(Player player) {
        this.player = player;
    }

    @Override
    public String getTypeOfCharacter() {
        return player.getTypeOfCharacter() + " with armour,";

    }

    @Override
    public double getHealthPoints() {
        return 0 + player.getHealthPoints();

    }

    @Override
    public double getWeaponDamagePoints() {
        return 0 + player.getWeaponDamagePoints();

    }

    @Override
    public double getArmourPoints() {
        return 100 + player.getArmourPoints();

    }

}
