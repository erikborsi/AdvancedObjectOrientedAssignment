package com.mycompany.assignmentforaoop;

/**
 *
 * @author Erik Borsi
 * Pick up health type one from the fridge from canteen
 * Giving different points 
 * Damage point plus as the health is on the maximum
 * NAME OF OBJECT TO PICK: PIZZA
 * Damage point plus as pizza is food and food is healthy
 */
public class PickUpHealth02 extends PlayerDecorator {

    Player player;

    public PickUpHealth02(Player player) {
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
