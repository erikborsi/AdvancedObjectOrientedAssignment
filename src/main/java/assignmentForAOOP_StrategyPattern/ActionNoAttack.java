package assignmentForAOOP_StrategyPattern;

/**
 *
 * @author Erik Borsi
 */
public class ActionNoAttack implements BehaviourAttack {


    @Override
    public void attack(double damage, double points) {
        System.out.println("Cannot attack");
        double result = points - damage;
        System.out.println("Your points: " + result);
        System.out.println("Enemy points: ");
    }
    
}
