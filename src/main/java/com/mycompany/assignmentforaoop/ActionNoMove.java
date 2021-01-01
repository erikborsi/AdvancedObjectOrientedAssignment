package com.mycompany.assignmentforaoop;

/**
 *
 * @author Erik Borsi
 */
public class ActionNoMove implements BehaviourMove {

    @Override
    public void move() {
        System.out.println("You cannot move");
    }

}
