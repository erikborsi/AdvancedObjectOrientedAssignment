package com.mycompany.assignmentforaoop;

/**
 *
 * @author Erik Borsi
 */
public class PlayerTester {

    public static void main(String[] args) {
        
        Player numberOne = new CyborgCharacter();
        System.out.println(numberOne.getTypeOfCharacter()
                +  "\n your health points: " + numberOne.getHealthPoints()
                +  "\n your damage points: " + numberOne.getWeaponDamagePoints() 
                +  "\n your armour points: " + numberOne.getArmourPoints());
        numberOne = new PickUpHealthPotion(numberOne);
        numberOne = new PickUpArmour(numberOne);
        numberOne = new PickUpWeapon(numberOne);
        System.out.println(numberOne.getTypeOfCharacter() 
                +  "\n your health points: " + numberOne.getHealthPoints()
                +  "\n your damage points: " + numberOne.getWeaponDamagePoints() 
                +  "\n your armour points: " + numberOne.getArmourPoints());
        
    }

}
