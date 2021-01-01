package com.mycompany.assignmentforaoop;

/**
 *
 * @author Erik Borsi
 */
public class CharacterHuman extends Player {

    public CharacterHuman() {
        typeOfCharacter = "You are a human named:" + " nameInputFromUser,";
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
