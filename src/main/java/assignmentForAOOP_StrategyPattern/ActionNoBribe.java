package assignmentForAOOP_StrategyPattern;

/**
 *
 * @author Erik Borsi
 */
public class ActionNoBribe implements BehaviourBribe {

    @Override
    public void bribe() {
        System.out.println("Cannot bribe");
    }

}
