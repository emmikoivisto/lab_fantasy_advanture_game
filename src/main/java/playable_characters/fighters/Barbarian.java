package playable_characters.fighters;
import playable_characters.fighters.defencemechanisms.Armor;
import playable_characters.fighters.defencemechanisms.DefenceMechanism;
import playable_characters.fighters.weapons.Weapon;

public class Barbarian extends Fighter {


    public Barbarian(String name, Weapon activeWeapon, int healthPoints, DefenceMechanism defenceMechanism) {
        super(name, activeWeapon, healthPoints, defenceMechanism);
    }
}
