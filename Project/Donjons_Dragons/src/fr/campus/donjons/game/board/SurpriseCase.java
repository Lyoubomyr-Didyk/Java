package fr.campus.donjons.game.board;

import fr.campus.donjons.equipement.Surprise;

public class SurpriseCase implements Case {

    private Surprise surprise;

    public Surprise getSurprise() {
        return surprise;
    }

    public void setSurprise(Surprise surprise) {
        this.surprise = surprise;
    }
}
