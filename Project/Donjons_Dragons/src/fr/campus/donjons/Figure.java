package fr.campus.donjons;

import fr.campus.donjons.equipement.DefensiveEquipment;
import fr.campus.donjons.equipement.OffensiveEquipment;

// -----------   my class Figure -----------------------------------

public class Figure {

    private String name;
    private String type;
    private int lifeLevel;
    private int attackPower;
    private DefensiveEquipment defensiveEquipment;
    private OffensiveEquipment offensiveEquipment;

    @Override
    public String toString() {
        return "Figure{" +
                "\nname='" + name + '\'' +
                ", \ntype='" + type + '\'' +
                ", \nlifeLevel=" + lifeLevel +
                ", \nattackPower=" + attackPower +
                ", \ndefensiveEquipment=" + defensiveEquipment +
                ", \noffensiveEquipment=" + offensiveEquipment +
                '}';
    }

// --------------  methode -----------------------------------------


// --------------  constructor --------------------------------------

    public Figure (){
    }

    public Figure (String name){

        this.name = name;
    }

    public Figure (String name, String type){
        this.name = name;
        this.type = type;
    }


//  -------------   setters & getters -------------------------------

    public String getName() {                   // recupere la valeur
        return name;
    }

    public void setName(String name) {         // modifier la valeur
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getLifeLevel() {
        return lifeLevel;
    }

    public void setLifeLevel(int lifeLevel) {
        this.lifeLevel = lifeLevel;
    }

    public int getAttackPower() {
        return attackPower;
    }

    public void setAttackPower(int attackPower) {
        this.attackPower = attackPower;
    }

    public DefensiveEquipment getDefensiveEquipment() {
        return defensiveEquipment;
    }

    public void setDefensiveEquipment(DefensiveEquipment defensiveEquipment) {
        this.defensiveEquipment = defensiveEquipment;
    }

    public OffensiveEquipment getOffensiveEquipment() {
        return offensiveEquipment;
    }

    public void setOffensiveEquipment(OffensiveEquipment offensiveEquipment) {
        this.offensiveEquipment = offensiveEquipment;
    }

}
