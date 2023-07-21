package fr.campus.donjons.game.board;

import fr.campus.donjons.character.enemy.Dragon;
import fr.campus.donjons.character.enemy.Enemy;
import fr.campus.donjons.character.enemy.Goblin;
import fr.campus.donjons.character.enemy.Wizard;

import java.util.Random;

public class EnemyCase implements Case{

    private Enemy enemy;

    @Override
    public String toString() {
        return "EnemyCase{" +
                "enemy=" + enemy +
                '}';
    }

    public EnemyCase(){
        Random rand = new Random();
        int random = rand.nextInt(3);
        if(random == 0){
            this.enemy = new Goblin();
        }else if(random == 1){
            this.enemy = new Dragon();
        }else{
            this.enemy = new Wizard();
        }
    }
}
