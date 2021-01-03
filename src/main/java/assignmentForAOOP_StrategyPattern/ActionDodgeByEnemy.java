package assignmentForAOOP_StrategyPattern;

/**
 *
 * @author Erik Borsi
 */
public class ActionDodgeByEnemy implements BehaviourDodge {

    @Override
    public void dodge() {
        System.out.println("The enemy dodged YOUR attack");
    }

}
