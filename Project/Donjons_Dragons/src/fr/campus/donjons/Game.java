package fr.campus.donjons;

import fr.campus.donjons.equipement.DefensiveEquipment;
import fr.campus.donjons.equipement.OffensiveEquipment;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Game {

    //public String input;
    public Figure playerA;

    int[] gameBoard = new int[64];


    @Override
    public String toString() {
        return "Game{" + "playerA=" + playerA + ", gameBoard=" + Arrays.toString(gameBoard) + '}';
    }

    // --------------  methode -----------------------------------------
    public void createFigure(String type, String name) {

        this.playerA = new Figure();                // object playerA
        playerA.setType(type);
        playerA.setName(name);
        String typePlayer = playerA.getType();

        if (typePlayer.equals("warrior")) {
            playerA.setAttackPower(10);
            playerA.setLifeLevel(10);
            playerA.setOffensiveEquipment(new OffensiveEquipment("weapon", 5, "sword"));
            playerA.setDefensiveEquipment(new DefensiveEquipment("protection", 3, "shield"));

        } else {
            playerA.setAttackPower(15);
            playerA.setLifeLevel(6);
            playerA.setOffensiveEquipment(new OffensiveEquipment("weapon", 7, "fireball"));
            playerA.setDefensiveEquipment(new DefensiveEquipment("protection", 4, "potion"));
        }

        System.out.println(playerA);
    }

    public void startGame() {
        System.out.println("your player in position"+position());


    }

    public int position() {
        int position = gameBoard[0];


        return position;
    }


    public int dice() {
        Random random = new Random();
        return random.nextInt(6) +1;
    }


}






