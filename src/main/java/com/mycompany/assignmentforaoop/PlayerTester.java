package com.mycompany.assignmentforaoop;

/**
 *
 * @author Erik Borsi
 */
public class PlayerTester {

    public static void main(String[] args) {
        
        Player numberOne = new CyborgCharacter();
        System.out.println(numberOne.getTypeOfCharacter()
                + "\n your health points: " + numberOne.getHealthPoints()
                + "\n your damage points: " + numberOne.getWeaponDamagePoints() 
                + "\n your armour points: " + numberOne.getArmourPoints()
                + "\n your weight is: " + numberOne.getWeightOfPlayer());
                
        
        numberOne = new PickUpHealth01(numberOne);
        numberOne = new PickUpArmour01(numberOne);
        numberOne = new PickUpWeapon01(numberOne);
        numberOne = new PickUpHealth02(numberOne);
        numberOne = new PickUpArmour02(numberOne);
        numberOne = new PickUpWeapon02(numberOne);
        
        System.out.println(numberOne.getTypeOfCharacter() 
                + "\n your health points: " + numberOne.getHealthPoints()
                + "\n your damage points: " + numberOne.getWeaponDamagePoints() 
                + "\n your armour points: " + numberOne.getArmourPoints()
                + "\n your weight is: " + numberOne.getWeightOfPlayer());
        
        
        
        
    }

}
