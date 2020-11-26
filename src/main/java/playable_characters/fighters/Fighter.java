package playable_characters.fighters;

import playable_characters.Player;
import playable_characters.fighters.defencemechanisms.DefenceMechanism;
import playable_characters.fighters.weapons.Weapon;

import java.util.ArrayList;

public abstract class Fighter {
    private int healthPoints;
    private ArrayList <Weapon> weapons;
    private String name;
    private Weapon activeWeapon;
    private DefenceMechanism defenceMechanism;

    public Fighter(String name, Weapon activeWeapon, int healthPoints, DefenceMechanism defenceMechanism) {
        this.name = name;
        this.activeWeapon = activeWeapon;
        this.healthPoints = healthPoints;
        this.weapons = new ArrayList<Weapon>();
        this.defenceMechanism = defenceMechanism;
    }

    public String getName() {
        return name;
    }

    public int countWeapon() {
        return weapons.size();
    }

    public void addWeapon(Weapon weapon) {
        weapons.add(weapon);
    }

    public Weapon getActiveWeapon() {
        return activeWeapon;
    }

    public void setActiveWeapon(Weapon activeWeapon) {
        this.activeWeapon = activeWeapon;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public void setHealthPoints(int healthPoints) {
        this.healthPoints = healthPoints;
    }

    public void attack(Fighter enemy) {
        enemy.setHealthPoints(enemy.getHealthPoints() - activeWeapon.getDamageLevel());
    }

    public DefenceMechanism getDefenceMechanism() {
        return defenceMechanism;
    }

    // create defence method
//    public void defend(Fighter enemy) {
//        enemy.setHealthPoints(enemy.get)
//    }

//    public void changeToNextWeapon(Weapon currentWeapon) {
//        currentWeapon = 0;
//        nextWeapon = this.weapons += [1];
//
//    }
}
