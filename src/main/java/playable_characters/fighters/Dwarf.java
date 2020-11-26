package playable_characters.fighters;

import playable_characters.fighters.weapons.Weapon;

public class Dwarf extends Fighter {

    private int specialDamage;

    public Dwarf(String name, Weapon activeWeapon, int healthPoints, int specialDamage, DefenceMechanism defenceMechanism) {
        super(name, activeWeapon, healthPoints, defenceMechanism);
        this.specialDamage = specialDamage;
    }

    public void attack(Fighter enemy){
        int totalDamage = this.specialDamage + getActiveWeapon().getDamageLevel();
        enemy.setHealthPoints(enemy.getHealthPoints() - totalDamage);
    }
}
