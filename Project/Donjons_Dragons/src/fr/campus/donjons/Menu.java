package fr.campus.donjons;

import java.util.Scanner;


public class Menu {
    Scanner console = new Scanner(System.in);



    // -----------  method ---------------------------


    //************  CREATE FIGURE  ******************

    public String userChoice() {

        String choice = null;
        System.out.println("Welcome! We are glad to see you. Look our menu and enter your choice:\n\t1 - create the character;\n\t2 - show the information of the character\n\t3 - quit the game");

        while(choice == null || (!choice.equals("1") && !choice.equals("2") && !choice.equals("3"))) {
            System.out.println("Enter please your choice!");
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




    //************  GAME  ******************


    // --------------- start game

    public void startGame(){
        System.out.println("Press enter to start the game!");
        console.nextLine();
//        Game myGame = new Game();
//        myGame.board();
    }


    // -------------- exit game
    public void exitGame(){
        System.out.println("See you later.");
        return;
    }


    public void rollDice(int position){
        System.out.println("Your player in position: " + position + "/64. Press enter to roll the dice");
        console.nextLine();
    }

    public String askUserAgain(){
        System.out.println("Do you want replay press 1 quit the game press 2");
        String input = console.nextLine();
        return input;
    }
}