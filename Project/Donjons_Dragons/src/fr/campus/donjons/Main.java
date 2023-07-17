package fr.campus.donjons;

import fr.campus.donjons.Figure;
import fr.campus.donjons.Menu;


public class Main {
    public static void main(String[] args) {

        Menu choice = new Menu();
        Game game = new Game(choice);
        game.communication();

    }
}