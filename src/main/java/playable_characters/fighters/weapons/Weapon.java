package playable_characters.fighters.weapons;

public abstract class Weapon {

    private String name;
    private int damageLevel;

    public Weapon(String name, int damageLevel){
        this.name = name;
        this.damageLevel = damageLevel;
    }

    public String getName() {
        return name;
    }

    public int getDamageLevel() {
        return damageLevel;
    }
    
    

}
