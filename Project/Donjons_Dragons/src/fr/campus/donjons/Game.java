package fr.campus.donjons;

import java.util.Scanner;


public class Game {

    //public String input;
    public Figure playerA;



    // --------------  methode -----------------------------------------
    public void createFigure(String type){

        this.playerA = new Figure();
        playerA.setType(type);
        String typePlayer = playerA.getType();
        System.out.println(playerA.getType());

        if(typePlayer.equals("warrior")){
            playerA.setAttackPower(10);
            playerA.setLifeLevel(10);
        }else{
            playerA.setAttackPower(15);
            playerA.setLifeLevel(6);
        }
        System.out.println(playerA);

    }






    //if(!input.equals("warrior") && !input.equals("magician")){
    //
    //        }


//        Figure newFigure = new Figure();
//        newFigure.setType(input.nextLine());
//        newFigure.setName(input.nextLine());
//
//
//        System.out.println(newFigure.getType());
}





