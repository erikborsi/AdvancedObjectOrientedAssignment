package com.mycompany.assignmentforaoop;

/**
 *
 * @author Erik Borsi
 */
public class PickUpHealthPotion extends PlayerDecorator {

    Player player;

    public PickUpHealthPotion(Player player) {
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

}
