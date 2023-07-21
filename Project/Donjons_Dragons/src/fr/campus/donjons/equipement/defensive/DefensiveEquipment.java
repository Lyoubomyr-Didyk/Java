package fr.campus.donjons.equipement.defensive;

import fr.campus.donjons.equipement.Surprise;

public abstract class DefensiveEquipment extends Surprise {

    private int level;

    private String name;

    @Override
    public String toString() {
        return "DefensiveEquipment{" +
                ", level=" + level +
                ", name='" + name + '\'' +
                '}';
    }

    // ----------------- constructor -----------------------------
    public DefensiveEquipment(String name, int level){
        this.level = level;
        this.name = name;
    }
}

