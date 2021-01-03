package assignmentForAOOP_StrategyPattern;

/**
 *
 * @author Erik Borsi
 */
public class ActionBribeByEnemy implements BehaviourBribe {

    @Override
    public void bribe() {
        System.out.println("The enemy bribed YOU");
        
    }

}
