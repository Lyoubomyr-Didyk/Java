package fr.campus.donjons.equipement.defensive;

public abstract class DefensiveEquipment {

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

