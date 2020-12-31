package com.mycompany.assignmentforaoop;

/**
 *
 * @author Erik Borsi 
 * Pick up armour type one from the locker from locker room
 * Giving different points 
 * Damage point minus as the armour is heavy so its is harder to move and attack 
 * Armour points to maximum 
 * NAME OF OBJECT TO PICK: UNDER CONSTRUCTION
 */
public class PickUpArmour02 extends PlayerDecorator {

    Player player;

    public PickUpArmour02(Player player) {
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

    @Override
    public double getWeightOfPlayer() {
        return 100 + player.getWeightOfPlayer();
    }

}
