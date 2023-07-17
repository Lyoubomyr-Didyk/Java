package fr.campus.donjons;

import fr.campus.donjons.equipement.DefensiveEquipment;
import fr.campus.donjons.equipement.OffensiveEquipment;
import org.w3c.dom.ls.LSOutput;

import java.awt.desktop.ScreenSleepEvent;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Game {

    //public String input;
    private Figure playerA;

    private Menu menu;


    public Game(Menu menu){
        this.menu = menu;
    }





    // --------------  methode -----------------------------------------

    public void communication () {
        String choice = menu.userChoice();

        if (choice.equals("1")) {
            String type = menu.getType();
            String name = menu.getName();

            // cree un perssonage
            createFigure(type, name);

            // start game
            menu.startGame();
            board();

            while (true){
                String input = menu.askUserAgain();

                if(input.equals("1")){
                    menu.startGame();
                    board();
                }else{
                    menu.exitGame();
                    break;
                }

            }

        }else if (choice.equals("2")){
            // methode pour afficher le perssonage
            System.out.println(playerA);


        }else if (choice.equals("3")) {
            menu.exitGame();
        }
    }


    public void createFigure(String type, String name) {

        this.playerA = new Figure(name, type);                // object playerA  / je transmet deux param.

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
    }


    public void board() {
        int[] gameBoard = new int[64];

        int position = gameBoard[0] + 1;

        while (position < gameBoard.length) {
            menu.rollDice(position);
            position += dice();
        }

        System.out.println("***** You won! ******");
    }



    public int dice() {
        Random random = new Random();
        return random.nextInt(6) + 1;
    }


}


