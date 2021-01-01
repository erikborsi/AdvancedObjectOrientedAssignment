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
public class DecorStarterHealthBeer extends PlayerDecorator {

    Player player;

    public DecorStarterHealthBeer(Player player) {
        this.player = player;
    }

    @Override
    public String getTypeOfCharacter() {
        return player.getTypeOfCharacter() + " drinked a beer,";
        
    }

    @Override
    public double getHealthPoints() {
        return player.getHealthPoints() + 10;
        
    }

    @Override
    public double getWeaponDamagePoints() {
        return player.getWeaponDamagePoints() - 5;
        
    }

    @Override
    public double getArmourPoints() {
        return player.getArmourPoints();
        
    }

    @Override
    public double getWeightOfPlayer() {
        return player.getWeightOfPlayer() + 5;
    }

}
