package com.mycompany.assignmentforaoop;

/**
 *
 * @author Erik Borsi
 */
public class AndroidCharacter extends Player {

    public AndroidCharacter() {
        typeOfCharacter = "You are an android named:" + " nameInputFromUser,";
        moveBehaviour = new Moving();
        attackBehaviour = new Attacking();
        bribeBehaviour = new Bribing();
        dodgeBehaviour = new Dodging();
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
        return 100;
    }

}
