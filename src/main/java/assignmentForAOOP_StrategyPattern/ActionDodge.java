package assignmentForAOOP_StrategyPattern;

/**
 *
 * @author Erik Borsi
 */
public class ActionDodge implements BehaviourDodge {

    @Override
    public void dodge() {
        System.out.println("Dodged");
    }

}
