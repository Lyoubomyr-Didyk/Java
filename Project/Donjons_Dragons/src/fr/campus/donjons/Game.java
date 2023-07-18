package fr.campus.donjons;

import fr.campus.donjons.character.Figure;
import fr.campus.donjons.character.Magician;
import fr.campus.donjons.character.Warrior;
import fr.campus.donjons.equipement.defensive.DefensiveEquipment;
import fr.campus.donjons.equipement.offensive.OffensiveEquipment;

import java.util.Random;

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

        if (type.equals("warrior")) {
            playerA = new Warrior(name);    // extends Figure

        } else {
            playerA = new Magician(name);   // extends Figure

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


