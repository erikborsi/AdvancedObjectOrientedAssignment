package com.mycompany.assignmentforaoop;

/**
 *
 * @author Erik Borsi
 */
public class CharacterAndroid extends Player {

    public CharacterAndroid() {
        typeOfCharacter = "You are an android named:" + " nameInputFromUser,";
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
        return 8;
    }

}
