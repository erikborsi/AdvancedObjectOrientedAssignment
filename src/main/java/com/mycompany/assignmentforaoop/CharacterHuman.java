package com.mycompany.assignmentforaoop;

/**
 *
 * @author Erik Borsi, CAN BRIBE FROM START AS HUMAN
 */
public class CharacterHuman extends Player {

    public CharacterHuman() {
        typeOfCharacter = "You are a human named:" + " nameInputFromUser,";
        behaviourMove = new ActionMove();
        behaviourMove = new ActionNoMove();
        behaviourAttack = new ActionAttack();
        behaviourAttack = new ActionNoAttack();
        behaviourBribe = new ActionBribe();
        behaviourBribe = new ActionNoBribe();
        behaviourDodge = new ActionDodge();
        behaviourDodge = new ActionNoDodge();
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
