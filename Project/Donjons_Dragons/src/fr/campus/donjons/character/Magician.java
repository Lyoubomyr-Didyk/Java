package fr.campus.donjons.character;

import fr.campus.donjons.equipement.defensive.DefensiveEquipment;
import fr.campus.donjons.equipement.offensive.OffensiveEquipment;
import fr.campus.donjons.equipement.offensive.Spell;
import fr.campus.donjons.equipement.defensive.Potion;

public class Magician extends Figure{
    public Magician(String name){
        super(name);
        setAttackPower(15);
        setLifeLevel(6);

        setOffensiveEquipment(new Spell("fireball", 7));
        setDefensiveEquipment(new Potion("super_potion", 4));
    }
}
