package fr.campus.donjons.equipement.offensive;

import fr.campus.donjons.equipement.Surprise;

public abstract class OffensiveEquipment extends Surprise {
    private int level;

    private String name;


    @Override
    public String toString() {
        return "OffensiveEquipment{" +
                ", level=" + level +
                ", name='" + name + '\'' +
                '}';
    }

    // ----------------- constructor -----------------------------

    public OffensiveEquipment(String name, int level){
        this.level = level;
        this.name = name;
    }


}
