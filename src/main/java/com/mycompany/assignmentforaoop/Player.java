package com.mycompany.assignmentforaoop;

/**
 *
 * @author Erik Borsi
 *
 *
 * ENERGY OF THE PLAYER, TAKE AND STORE DIFFERENT ARMOUR AND WEAPON AND PIZZA
 * AND BEER STORE THE STUFF IN A BAG ENERGY POINTS - EAT THE PIZZA FROM THE BAG
 * PLAYER CAN DIE IF HEALTH OR ENERGY IS LOW HUD ON THE SCREEN TO SEE THE PLAYER
 * STATS
 *
 */
public abstract class Player {

    MoveBehaviour moveBehaviour;
    AttackBehaviour attackBehaviour;
    BribeBehaviour bribeBehaviour;
    DodgeBehaviour dodgeBehaviour;

    String typeOfCharacter = "Unknown";

    public Player() {

    }

    public void setMoveBehaviour(MoveBehaviour mB) {
        this.moveBehaviour = mB;
    }

    public void setAttackBehaviour(AttackBehaviour aB) {
        this.attackBehaviour = aB;
    }

    public void setBribeBehaviour(BribeBehaviour bB) {
        this.bribeBehaviour = bB;
    }

    public void setDodgeBehaviour(DodgeBehaviour dB) {
        this.dodgeBehaviour = dB;
    }

    public void performMove() {
        moveBehaviour.move();
    }

    public void performAttack() {
        attackBehaviour.attack();
    }

    public void performBribe() {
        bribeBehaviour.bribe();
    }

    public void performDodge() {
        dodgeBehaviour.dodge();
    }

    public String getTypeOfCharacter() {
        return typeOfCharacter;
    }

    public abstract double getHealthPoints();

    public abstract double getWeaponDamagePoints();

    public abstract double getArmourPoints();

    public abstract double getWeightOfPlayer();

}
