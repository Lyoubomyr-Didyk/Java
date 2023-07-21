package fr.campus.donjons.menu;

import fr.campus.donjons.game.Game;

import java.util.Scanner;


public class Menu {
    Scanner console = new Scanner(System.in);

    Game game;


    // -----------  constructor ---------------------------

    public Menu(Game game){
        this.game = game;
    }



    // -----------  method ---------------------------

    //************  CREATE FIGURE  ******************

    public void messageWelcome(){
        System.out.println("\nWelcome! We are glad to see you.");
        game.communication();
    }

    public String userChoice() {

        String choice = null;
        System.out.println("\nLook our menu and enter your choice:\n\t1 - create the character;\n\t2 - change character name;\n\t3 - show character;\n\t4 - start game;\n\t5 - quit the game;");

        while(choice == null || (!choice.equals("1") && !choice.equals("2") && !choice.equals("3") && !choice.equals("4") && !choice.equals("5"))) {
            System.out.println("\nEnter please your choice!");
            choice = console.nextLine().toLowerCase();
        }
        return choice;
    }

    public String getType(){

        String input = null;
        System.out.println("Please enter figure type \"warrior\" or \"magician\"");

        while(input == null || (!input.equals("warrior") && !input.equals("magician"))) {
            System.out.println("Enter please type to figure:");
            input = console.nextLine().toLowerCase();
        }
        return input;
    }

    public String getName(){
        String name;
        System.out.println("Gives the name to your perssonage");
        name = console.nextLine();
        return name;
    }

    public void showCharacter(){
        System.out.println(game.getPlayerA());
    }




    //************  GAME  ******************

    // --------------- start game

    public void startGame(){
        System.out.println("\n\n\tPress enter to start the game!");
        console.nextLine();
//        Game myGame = new Game();
//        myGame.board();
    }


    // -------------- exit game

    public void exitGame(){
        System.out.println("See you later.");
        return;
    }

    //-------------- roll dice

    public void rollDice(int position){
        System.out.println("Your player in position: " + position + "/64. Press enter to roll the dice");
        console.nextLine();
    }

    // -------------- ask to replay

    public String askUserAgain(){
        System.out.println("Do you want replay press 1 quit the game press 2");
        return console.nextLine();
    }
}