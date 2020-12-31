package com.mycompany.assignmentforaoop;

/**
 *
 * @author Erik Borsi
 */
public class PlayerDecoratorAndStrategyTester {

    public static void main(String[] args) {

//        Player numberOne = new CyborgCharacter();
//        System.out.println(numberOne.getTypeOfCharacter()
//                + "\n your health points: " + numberOne.getHealthPoints()
//                + "\n your damage points: " + numberOne.getWeaponDamagePoints()
//                + "\n your armour points: " + numberOne.getArmourPoints()
//                + "\n your weight is: " + numberOne.getWeightOfPlayer());
//
//        numberOne = new PickUpHealth01(numberOne);
//        numberOne = new PickUpArmour01(numberOne);
//        numberOne = new PickUpWeapon01(numberOne);
//        numberOne = new PickUpHealth02(numberOne);
//        numberOne = new PickUpArmour02(numberOne);
//        numberOne = new PickUpWeapon02(numberOne);
//
//        System.out.println(numberOne.getTypeOfCharacter()
//                + "\n your health points: " + numberOne.getHealthPoints()
//                + "\n your damage points: " + numberOne.getWeaponDamagePoints()
//                + "\n your armour points: " + numberOne.getArmourPoints()
//                + "\n your weight is: " + numberOne.getWeightOfPlayer());
//        
//        numberOne.performMove();
//        numberOne.performAttack();
//        numberOne.performBribe();
//        numberOne.performDodge();
//        numberOne = new PickUpHealth01(numberOne);
//        System.out.println(numberOne.getHealthPoints());
//        numberOne = new PickUpWeapon01(numberOne);
//        System.out.println(numberOne.getWeaponDamagePoints());
//        System.out.println(numberOne.getTypeOfCharacter());
//        numberOne = new PickUpArmour01(numberOne);
//        System.out.println(numberOne.getArmourPoints());
//        System.out.println(numberOne.getTypeOfCharacter());
//        numberOne.performAttack();
//
//        numberOne = new PickUpArmour01(numberOne);
//        System.out.println(numberOne.getArmourPoints());
//        
//        numberOne.performAttack();
//
//        AlienCharacter numberOne = new AlienCharacter();
//        
//        numberOne.performAttack();
//        
//        System.out.println(numberOne.getTypeOfCharacter());
//        
//        numberOne = new PickUpWeapon01(numberOne);
//        
//        Player numberTwo = new AlienCharacter();
//        numberTwo = new PickUpArmour01(numberTwo);
//        numberTwo.performAttack();
        
        
        Player numberOne = new AlienCharacter();
        numberOne = new PickUpArmour01(numberOne);
        numberOne.performAttack();

    }

}
