package fr.campus.donjons;

import java.util.Scanner;

public class Menu {
    private String choice = null;



    // -----------  method --------------------------------------------------------
    public void userChoice() {

        Scanner input = new Scanner(System.in);
        System.out.println("Do you want to create a new figure or quit the game?");

        while(choice == null || (!choice.equals("yes") && !choice.equals("no"))) {
            System.out.println("Enter please yes or no:");
            this.choice = input.nextLine().toLowerCase();
        }

        if (choice.equals("yes")) {
            Game myGame = new Game();
            String type = getType();
            myGame.createFigure(type);
//                System.out.println(myGame.playerA);
//                System.out.println(myGame.playerA.getType());
        }

        if (choice.equals("no")) {
            exitGame();
        }
    }


    public void exitGame(){
        System.out.println("See you later.");
        return;
    }


    public String getType(){

        String input = null;
        Scanner console = new Scanner(System.in);
        System.out.println("Please enter figure type \"warrior\" or \"magician\"");

        while(input == null || (!input.equals("warrior") && !input.equals("magician"))) {
            System.out.println("Enter please type to figure:");
            input = console.nextLine().toLowerCase();
        }
        return input;
    }




}
