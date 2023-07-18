package fr.campus.donjons;


public class Main {
    public static void main(String[] args) {

        Menu choice = new Menu();
        Game game = new Game(choice);
        game.communication();

    }
}