package com.mycompany.assignmentforaoop;

/**
 *
 * @author Erik Borsi, CANNOT BRIBE FROM START AS NOT HUMAN, CAN STUDY IT BY
 * READING A BOOK IN THE LIBRARY OF THE SPACESHIP
 */
public class CharacterAlien extends Player {

    public CharacterAlien() {
        typeOfCharacter = "You are an alien named:" + " nameInputFromUser,";
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
        return 7;
    }

}
