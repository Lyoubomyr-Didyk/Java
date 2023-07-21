package fr.campus.donjons.exception;

public class CharacterOffBoardException extends Exception{
    public CharacterOffBoardException() {
        super("You are out of the board");
    }
}
