package assignmentForAOOP_StrategyPattern;

/**
 *
 * @author Erik Borsi
 */
public class ActionAttack implements BehaviourAttack {


    @Override
    public void attack(double damage, double points) {
        System.out.println("Attacked");
        double result = points - damage;
        System.out.println("Your points: " + result);
        System.out.println("Enemy points: ");
    }
    
}
