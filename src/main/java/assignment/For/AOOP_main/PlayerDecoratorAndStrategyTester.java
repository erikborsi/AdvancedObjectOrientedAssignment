package assignment.For.AOOP_main;

import java.util.Random;

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
//
//        Player alien = new CharacterAlien();
//        System.out.println(alien.getTypeOfCharacter());
//        alien.setBehaviourAttack(new ActionAttack());
//        alien.performAttack();
//
//        alien.setBehaviourAttack(new ActionNoAttack());
//        alien.performAttack();
//
//        alien = new DecorArmourLight(alien);
//        alien.setBehaviourAttack(new ActionAttack());
//        alien.performAttack();
//
//        System.out.println(" ");
//
//        Player android = new CharacterAndroid();
//        System.out.println(android.getTypeOfCharacter());
//        android.setBehaviourAttack(new ActionAttack());
//        android.performAttack();
//
//        android.setBehaviourAttack(new ActionNoAttack());
//        android.performAttack();
//
//        android = new DecorArmourLight(android);
//        android.setBehaviourAttack(new ActionAttack());
//        android.performAttack();
//
//        System.out.println(" ");
//
//        Player cyborg = new CharacterCyborg();
//        System.out.println(cyborg.getTypeOfCharacter());
//        cyborg.setBehaviourAttack(new ActionAttack());
//        cyborg.performAttack();
//
//        cyborg.setBehaviourAttack(new ActionNoAttack());
//        cyborg.performAttack();
//
//        cyborg = new DecorArmourLight(cyborg);
//        cyborg.setBehaviourAttack(new ActionAttack());
//        cyborg.performAttack();
//
//        System.out.println(" ");
//
//        Player human = new CharacterHuman();
//        System.out.println(human.getTypeOfCharacter());
//        human.setBehaviourAttack(new ActionAttack());
//        human.performAttack();
//
//        human.setBehaviourAttack(new ActionNoAttack());
//        human.performAttack();
//
//        human = new DecorArmourLight(human);
//        human.setBehaviourAttack(new ActionAttack());
//        human.performAttack();
//
//        System.out.println(" ");
//        Player human = new CharacterHuman();
//        human = new DecorArmourHeavy(human);
//        human = new DecorStarterHealthBeer(human);
//        human = new DecorWeaponLaserGun(human);
//        human.setBehaviourAttack(new ActionAttack());
//        double playerHP = human.getHealthPointsOfPlayer();
//        Double parsedPlayerHP = new Double(playerHP);
//        System.out.println(playerHP);
//        
//        System.out.println(" ");
//        Enemy enemy = new CharacterEnemyHard();
//        enemy.setBehaviourAttack(new ActionAttackByEnemy());
//        enemy.performAttack(5);
//        
//
//        System.out.println(" ");
//        System.out.println(human.getHealthPointsOfPlayer());
//
//
//        Enemy easy = new CharacterEnemyEasy();
//        easy = new DecorArmourForEasyEnemy(easy);
//        easy = new DecorStarterHealthForEasyEnemy(easy);
//        easy = new DecorWeaponLaserGunForEnemy(easy);
//        System.out.println("Type of enemy: " + easy.getTypeOfCharacterOfEnemy());
//        System.out.println("Health points of enemy: " + easy.getHealthPointsOfEnemy());
//        System.out.println("Armour points of enemy: " + easy.getArmourPointsOfEnemy());
//        System.out.println("Damage points of enemy: " + easy.getWeaponDamagePointsOfEnemy());
//        System.out.println("Weight points of enemy: " + easy.getWeightOfPlayerOfEnemy());
//        System.out.println(" ");
//        easy.setBehaviourAttack(new ActionAttackByEnemy());
//        easy.performAttack(5, human.getHealthPointsOfPlayer());
//        
//        System.out.println(" ");
//        Enemy medium = new CharacterEnemyMedium();
//        medium = new DecorArmourForMediumEnemy(medium);
//        medium = new DecorStarterHealthForMediumEnemy(medium);
//        medium = new DecorWeaponLaserGunForEnemy(medium);
//        System.out.println("Type of enemy: " + medium.getTypeOfCharacterOfEnemy());
//        System.out.println("Health points of enemy: " + medium.getHealthPointsOfEnemy());
//        System.out.println("Armour points of enemy: " + medium.getArmourPointsOfEnemy());
//        System.out.println("Damage points of enemy: " + medium.getWeaponDamagePointsOfEnemy());
//        System.out.println("Weight points of enemy: " + medium.getWeightOfPlayerOfEnemy());
//        System.out.println(" ");
//        medium.setBehaviourAttack(new ActionAttackByEnemy());
//        medium.performAttack(10, human.getHealthPointsOfPlayer());
//        
//        
//        System.out.println(" ");
//        Enemy hard = new CharacterEnemyHard();
//        hard = new DecorArmourForHardEnemy(hard);
//        hard = new DecorStarterHealthForHardEnemy(hard);
//        hard = new DecorWeaponLightSaberForEnemy(hard);
//        System.out.println("Type of enemy: " + hard.getTypeOfCharacterOfEnemy());
//        System.out.println("Health points of enemy: " + hard.getHealthPointsOfEnemy());
//        System.out.println("Armour points of enemy: " + hard.getArmourPointsOfEnemy());
//        System.out.println("Damage points of enemy: " + hard.getWeaponDamagePointsOfEnemy());
//        System.out.println("Weight points of enemy: " + hard.getWeightOfPlayerOfEnemy());
//        System.out.println(" ");
//        hard.setBehaviourAttack(new ActionAttackByEnemy());
//        hard.performAttack(hard.getWeaponDamagePointsOfEnemy(), playerHP);
//        human.performAttack(human.getWeaponDamagePointsOfPlayer(), hard.getHealthPointsOfEnemy());
        
        
    }

}