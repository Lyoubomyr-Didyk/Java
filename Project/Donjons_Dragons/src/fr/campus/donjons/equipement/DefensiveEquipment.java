package fr.campus.donjons.equipement;

public class DefensiveEquipment {
    private String type;

    private int level;

    private String name;

    @Override
    public String toString() {
        return "DefensiveEquipment{" +
                "type='" + type + '\'' +
                ", level=" + level +
                ", name='" + name + '\'' +
                '}';
    }



    // ----------------- constructor -----------------------------
    public DefensiveEquipment(String type, int level, String name){
        this.type = type;
        this.level = level;
        this.name = name;
    }

}

