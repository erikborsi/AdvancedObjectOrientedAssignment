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
//        
//        
//        Player numberOne = new AlienCharacter();
//        System.out.println("Basic alien character armour points: " + numberOne.getArmourPoints());
//        
//        numberOne = new PickUpArmour01(numberOne);
//        System.out.println("Created alien character picked up an armour, points: " + numberOne.getArmourPoints());
//        
//        numberOne.setAttackBehaviour(new Attacking());
//        System.out.println("Set attack behaviour: " + numberOne.getArmourPoints());
//        
//        numberOne.performAttack();
//        System.out.println("Points after attack performed: " + numberOne.getArmourPoints());
//        
//        numberOne.performAttack();
//        Player playerName = new CharacterAlien();
//
//        System.out.println("type of character: " + playerName.getTypeOfCharacter());
//        System.out.println("health points: " + playerName.getHealthPoints());
//        System.out.println("damage points: " + playerName.getWeaponDamagePoints());
//        System.out.println("armour points: " + playerName.getArmourPoints());
//        System.out.println("weight points: " + playerName.getWeightOfPlayer());
//
//        playerName = new DecorArmourHeavy(playerName);
//        playerName = new DecorStarterHealthBeer(playerName);
//        playerName = new DecorWeaponLaserGun(playerName);
//
//        System.out.println(" ");
//        System.out.println("type of character: " + playerName.getTypeOfCharacter());
//        System.out.println("health points: " + playerName.getHealthPoints());
//        System.out.println("damage points: " + playerName.getWeaponDamagePoints());
//        System.out.println("armour points: " + playerName.getArmourPoints());
//        System.out.println("weight points: " + playerName.getWeightOfPlayer());
//
//        playerName.setBehaviourMove(new ActionMove());
//        playerName.setBehaviourAttack(new ActionAttack());
//        playerName.setBehaviourBribe(new ActionNoBribe());
//        playerName.setBehaviourDodge(new ActionDodge());
//
//        System.out.println(" ");
//        playerName.performMove();
//        playerName.performAttack();
//        playerName.performBribe();
//        playerName.performDodge();
//
//        System.out.println(" ");
//        playerName.performMove();
//        playerName.performAttack();
//        playerName.performBribe();
//        playerName.performDodge();
//
//        playerName = new DecorArmourLight(playerName);
//        playerName = new DecorStarterHealthSmoothie(playerName);
//        playerName = new DecorWeaponLightSaber(playerName);
//
//        System.out.println(" ");
//        System.out.println("type of character: " + playerName.getTypeOfCharacter());
//        System.out.println("health points: " + playerName.getHealthPoints());
//        System.out.println("damage points: " + playerName.getWeaponDamagePoints());
//        System.out.println("armour points: " + playerName.getArmourPoints());
//        System.out.println("weight points: " + playerName.getWeightOfPlayer());
//
//        playerName.setBehaviourMove(new ActionMove());
//        playerName.setBehaviourAttack(new ActionAttack());
//        playerName.setBehaviourBribe(new ActionBribe());
//        playerName.setBehaviourDodge(new ActionDodge());
//
//        System.out.println(" ");
//        playerName.performMove();
//        playerName.performAttack();
//        playerName.performBribe();
//        playerName.performDodge();
//
//        System.out.println(" ");
//        playerName.performMove();
//        playerName.performAttack();
//        playerName.performBribe();
//        playerName.performDodge();
//
//        System.out.println(" ");
//        System.out.println("type of character: " + playerName.getTypeOfCharacter());
//        System.out.println("health points: " + playerName.getHealthPoints());
//        System.out.println("damage points: " + playerName.getWeaponDamagePoints());
//        System.out.println("armour points: " + playerName.getArmourPoints());
//        System.out.println("weight points: " + playerName.getWeightOfPlayer());
//
//        Player android = new AndroidCharacter();
//        Player cyborg = new CyborgCharacter();
//        Player human = new HumanCharacter();
//        System.out.println("health points: " + android.getHealthPoints());
//        System.out.println("health points: " + cyborg.getHealthPoints());
//        System.out.println("health points: " + human.getHealthPoints());
    }

}
