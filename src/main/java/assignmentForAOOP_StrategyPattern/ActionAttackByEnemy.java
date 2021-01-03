package assignmentForAOOP_StrategyPattern;

import assignmentForAOOP_DecoratorPatternPlayer.*;

/**
 *
 * @author Erik Borsi
 */
public class ActionAttackByEnemy implements BehaviourAttack {

    @Override
    public void attack(double damage, double points) {
        System.out.println("The enemy attacked YOU, gave " + damage + " damage points");
        double result = points - damage;
        System.out.println("Your points: " + result);
        System.out.println("Enemy points: ");
    }

}
