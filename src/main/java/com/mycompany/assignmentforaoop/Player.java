package com.mycompany.assignmentforaoop;

/**
 *
 * @author Erik Borsi
 */
public abstract class Player {

    String typeOfCharacter = "Unknown";

    public String getTypeOfCharacter() {
        return typeOfCharacter;
    }

    public abstract double getHealthPoints();

    public abstract double getWeaponDamagePoints();

    public abstract double getArmourPoints();
    
    

}
