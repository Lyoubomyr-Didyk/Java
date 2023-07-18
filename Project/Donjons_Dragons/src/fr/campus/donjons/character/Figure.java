package fr.campus.donjons.character;

import fr.campus.donjons.equipement.defensive.DefensiveEquipment;
import fr.campus.donjons.equipement.offensive.OffensiveEquipment;

// -----------   my class Figure -----------------------------------

public abstract class Figure {

    private String name;
    private int lifeLevel;
    private int attackPower;
    private DefensiveEquipment defensiveEquipment;
    private OffensiveEquipment offensiveEquipment;

    @Override
    public String toString() {
        return "Figure{" +
                "\nname='" + name + '\'' +
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


//  -------------   setters & getters -------------------------------

    public String getName() {                   // recupere la valeur
        return name;
    }

    public void setName(String name) {         // modifier la valeur
        this.name = name;
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
