package com.mycompany.assignmentforaoop;

/**
 *
 * @author Erik Borsi, Pick up armour type one from the locker from locker room
 * Giving different points, Damage point minus as the armour is heavy so its is
 * harder to move and attack, Armour points to maximum
 *
 * CHANGED - player can put on more armour put getting heavier, if too heavy, no
 * move then die
 */
public class DecorArmourLight extends PlayerDecorator {

    Player player;

    public DecorArmourLight(Player player) {
        this.player = player;
    }

    @Override
    public String getTypeOfCharacter() {
        return player.getTypeOfCharacter() + " with a light armour,";

    }

    @Override
    public double getHealthPoints() {
        return player.getHealthPoints();

    }

    @Override
    public double getWeaponDamagePoints() {
        return player.getWeaponDamagePoints();

    }

    @Override
    public double getArmourPoints() {
        return player.getArmourPoints() + 50;

    }

    @Override
    public double getWeightOfPlayer() {
        return player.getWeightOfPlayer() + 5;
    }

}