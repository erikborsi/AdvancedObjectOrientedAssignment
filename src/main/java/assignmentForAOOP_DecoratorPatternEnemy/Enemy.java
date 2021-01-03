package assignmentForAOOP_DecoratorPatternEnemy;

import assignmentForAOOP_StrategyPattern.*;
import java.util.Random;

/**
 *
 * @author Erik Borsi
 */
public abstract class Enemy {

    BehaviourMove behaviourMove;
    BehaviourAttack behaviourAttack;
    BehaviourBribe behaviourBribe;
    BehaviourDodge behaviourDodge;

    String typeOfCharacter = "Unknown";

    public Enemy() {

    }

    public void setBehaviourMove(BehaviourMove bM) {
        this.behaviourMove = bM;
    }

    public void setBehaviourAttack(BehaviourAttack bA) {
        this.behaviourAttack = bA;
    }

    public void setBehaviourBribe(BehaviourBribe bB) {
        this.behaviourBribe = bB;
    }

    public void setBehaviourDodge(BehaviourDodge bD) {
        this.behaviourDodge = bD;
    }

    public void performMove() {
        behaviourMove.move();
    }

    public void performAttack(double damage, double points) {
        behaviourAttack.attack(damage, points);
    }

    public void performBribe() {
        behaviourBribe.bribe();
    }

    public void performDodge() {
        behaviourDodge.dodge();
    }

    public String getTypeOfCharacterOfEnemy() {
        return typeOfCharacter;
    }

    public abstract double getHealthPointsOfEnemy();

    public abstract double getWeaponDamagePointsOfEnemy();

    public abstract double getArmourPointsOfEnemy();

    public abstract double getWeightOfPlayerOfEnemy();

}
