package com.mycompany.assignmentforaoop;

/**
 *
 * @author Erik Borsi
 */
public class AndroidCharacter extends Player {

    public AndroidCharacter() {
        typeOfCharacter = "You are an android named:" + " nameInputFromUser,";
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

}
