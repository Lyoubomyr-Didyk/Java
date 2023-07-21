package fr.campus.donjons.game;

import fr.campus.donjons.character.hero.Figure;
import fr.campus.donjons.character.hero.Magician;
import fr.campus.donjons.character.hero.Warrior;
import fr.campus.donjons.equipement.Surprise;
import fr.campus.donjons.exception.CharacterOffBoardException;
import fr.campus.donjons.game.board.Case;
import fr.campus.donjons.game.board.EmptyCase;
import fr.campus.donjons.game.board.EnemyCase;
import fr.campus.donjons.game.board.SurpriseCase;
import fr.campus.donjons.menu.Menu;

import java.util.ArrayList;
import java.util.Random;

public class Game {
    private Figure playerA;

    private Menu menu;

    private ArrayList<Case> gameBoard = new ArrayList<>();

   // private int[] gameBoard = new int[64];  //

    private int positionPlayer;


    // -----------  constructor --------------------------------------

    public Game(){
        generateBoard();
    }



    // ----------   getter & setter ----------------------------------

    public Figure getPlayerA() {
        return playerA;
    }

    public void setPlayerA(Figure playerA) {
        this.playerA = playerA;
    }
    // --------------  methode -----------------------------------------

    public void mainMenu(){
        this.menu = new Menu(this);
        menu.messageWelcome();
    }



    public void communication () {
        String choice = menu.userChoice();

        if(choice.equals("1")) {
            // create character
            String type = menu.getType();
            String name = menu.getName();
            createFigure(type, name);

        }
        else if(choice.equals("2")){
            // change the name
            menu.getName();

        }
        else if(choice.equals("3")){
            // show character
            menu.showCharacter();

        }
        else if(choice.equals("4")){
            // start game
            menu.startGame();
            try {
                board();
            } catch (CharacterOffBoardException e) {
                //e.printStackTrace();
                System.out.println(e.getMessage());
            }

            while (true){
                String input = menu.askUserAgain();

                if(input.equals("1")){
                    menu.startGame();
                    try {
                        board();
                    } catch (CharacterOffBoardException e) {
                        System.out.println(e.getMessage());
                    }
                }else{
                    menu.exitGame();
                    return;
                }
            }
        }
        else if(choice.equals("5")) {
            // quite game
            menu.exitGame();
            return;
        }
        communication();
    }




    public void createFigure(String type, String name) {

        if (type.equals("warrior")) {
            playerA = new Warrior(name);    // extends Figure

        } else {
            playerA = new Magician(name);   // extends Figure

        }
    }

    public void generateBoard(){
        EmptyCase empty = new EmptyCase();
        gameBoard.add(empty);
        EnemyCase enemy = new EnemyCase();
        gameBoard.add(enemy);
        SurpriseCase surprise = new SurpriseCase();
        gameBoard.add(surprise);

    }

// à modifier ---------------

    public void board() throws CharacterOffBoardException {  // throws указывается в определении (сигнатуре) функции и оно говорит о том, что функция может бросить такое исключение.


        this.positionPlayer = this.gameBoard.get(0);


        while (positionPlayer < gameBoard.length) {
            menu.rollDice(positionPlayer);
            positionPlayer += dice();
        }

        // exception
        if (positionPlayer > gameBoard.length){
            throw new CharacterOffBoardException();
        }

        System.out.println("***** You won! ******");
    }


    public int dice() {
        Random random = new Random();
        return random.nextInt(6) + 1;
    }


}


