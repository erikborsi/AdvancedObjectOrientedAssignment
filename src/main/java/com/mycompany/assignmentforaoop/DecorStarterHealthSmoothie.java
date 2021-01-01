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
public class DecorStarterHealthSmoothie extends PlayerDecorator {

    Player player;

    public DecorStarterHealthSmoothie(Player player) {
        this.player = player;
    }

    @Override
    public String getTypeOfCharacter() {
        return player.getTypeOfCharacter() + " drinked a smoothie,";

    }

    @Override
    public double getHealthPoints() {
        return player.getHealthPoints() + 25;

    }

    @Override
    public double getWeaponDamagePoints() {
        return player.getWeaponDamagePoints() + 15;

    }

    @Override
    public double getArmourPoints() {
        return player.getArmourPoints();

    }

    @Override
    public double getWeightOfPlayer() {
        return player.getWeightOfPlayer() + 2;
    }

}
