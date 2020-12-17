package com.mycompany.assignmentforaoop;

/**
 *
 * @author Erik Borsi 
 * Pick up health type one from the fridge from canteen
 * Giving different points 
 * Damage point plus as the health is on the maximum
 * NAME OF OBJECT TO PICK: BEER 
 * Damage point minus as drinking beer is not healthy (TRAP)
 */
public class PickUpHealth01 extends PlayerDecorator {

    Player player;

    public PickUpHealth01(Player player) {
        this.player = player;
    }

    @Override
    public String getTypeOfCharacter() {
        return player.getTypeOfCharacter() + " with health,";

    }

    @Override
    public double getHealthPoints() {
        return 100;

    }

    @Override
    public double getWeaponDamagePoints() {
        return 0 + player.getWeaponDamagePoints();

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
