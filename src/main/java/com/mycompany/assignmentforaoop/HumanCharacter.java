package com.mycompany.assignmentforaoop;

/**
 *
 * @author Erik Borsi
 */
public class HumanCharacter extends Player {

    public HumanCharacter() {
        typeOfCharacter = "You are a human named:" + " nameInputFromUser,";
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
