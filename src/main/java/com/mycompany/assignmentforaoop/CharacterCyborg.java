package com.mycompany.assignmentforaoop;

/**
 *
 * @author Erik Borsi
 */
public class CharacterCyborg extends Player {

    public CharacterCyborg() {
        typeOfCharacter = "You are a cyborg named:" + " nameInputFromUser,";
        behaviourMove = new ActionMove();
        behaviourAttack = new ActionAttack();
        behaviourBribe = new ActionBribe();
        behaviourDodge = new ActionDodge();
    }

    @Override
    public double getHealthPoints() {
        return 100;

    }

    @Override
    public double getWeaponDamagePoints() {
        return 0;

    }

    @Override
    public double getArmourPoints() {
        return 0;

    }

    @Override
    public double getWeightOfPlayer() {
        return 5;
    }

}
