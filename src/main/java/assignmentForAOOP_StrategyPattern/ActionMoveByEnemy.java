package assignmentForAOOP_StrategyPattern;

/**
 *
 * @author Erik Borsi
 */
public class ActionMoveByEnemy implements BehaviourMove {

    @Override
    public void move() {
        System.out.println("The enemy moved");
    }

}
