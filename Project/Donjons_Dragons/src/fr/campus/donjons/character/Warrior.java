package fr.campus.donjons.character;

import fr.campus.donjons.equipement.defensive.Shield;
import fr.campus.donjons.equipement.offensive.Weapon;


public class Warrior extends Figure {
    public Warrior (String name){
        super(name);
        setAttackPower(10);
        setLifeLevel(10);
        setOffensiveEquipment(new Weapon("sword", 5));
        setDefensiveEquipment(new Shield("round", 3));
        }

}
