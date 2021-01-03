package assignmentForAOOP_StrategyPattern;

/**
 *
 * @author Erik Borsi
 */
public class ActionNoDodge implements BehaviourDodge {

    @Override
    public void dodge() {
        System.out.println("Cannot dodge");
    }

}
