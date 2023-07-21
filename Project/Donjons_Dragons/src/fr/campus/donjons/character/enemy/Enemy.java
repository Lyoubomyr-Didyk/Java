package fr.campus.donjons.character.enemy;

public abstract class Enemy {
    private int attack;
    private int  life;


    // ----------- getter & setter ---------------

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getLife() {
        return life;
    }

    public void setLife(int life) {
        this.life = life;
    }
}
