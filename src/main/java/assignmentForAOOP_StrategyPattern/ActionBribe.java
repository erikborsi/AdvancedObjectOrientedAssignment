package assignmentForAOOP_StrategyPattern;

/**
 *
 * @author Erik Borsi
 */
public class ActionBribe implements BehaviourBribe {

    @Override
    public void bribe() {
        System.out.println("Bribed");
    }

}
