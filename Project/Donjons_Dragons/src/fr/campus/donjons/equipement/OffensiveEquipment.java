package fr.campus.donjons.equipement;

public class OffensiveEquipment {

    private String type;

    private int level;

    private String name;


    @Override
    public String toString() {
        return "OffensiveEquipment{" +
                "type='" + type + '\'' +
                ", level=" + level +
                ", name='" + name + '\'' +
                '}';
    }

    // ----------------- constructor -----------------------------

    public OffensiveEquipment(String type, int level, String name){
        this.type = type;
        this.level = level;
        this.name = name;
    }


}
