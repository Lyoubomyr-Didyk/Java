package fr.campus.donjons;

import java.util.Scanner;

public class Menu {
    private String choice;
    Scanner console = new Scanner(System.in);







    // -----------  method --------------------------------------------------------
    public void userChoice() {

        //Scanner input = new Scanner(System.in);
        System.out.println("Welcome! We are glad to see you. Look our menu and enter your choice:\n\t1 - create the character;\n\t2 - show all the information of the character\n\t3 - quit the game");

        while(choice == null || (!choice.equals("1") && !choice.equals("2") && !choice.equals("3"))) {
            System.out.println("Enter please your choice!");
            this.choice = console.nextLine().toLowerCase();
        }

        if (choice.equals("1")) {
            Game myGame = new Game();
            String type = getType();
            String name = getName();
            myGame.createFigure(type, name);
//                System.out.println(myGame.playerA);
//                System.out.println(myGame.playerA.getType());

            // start game
        }

        if (choice.equals("3")) {
            exitGame();
        }
    }


    public void exitGame(){
        System.out.println("See you later.");
        return;
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
}
