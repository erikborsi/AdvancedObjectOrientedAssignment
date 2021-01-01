package com.mycompany.assignmentforaoop;

/**
 *
 * @author Erik Borsi
 */
public class ActionNoAttack implements BehaviourAttack {


    @Override
    public void attack() {
        System.out.println("You cannot attack");
    }
    
}
