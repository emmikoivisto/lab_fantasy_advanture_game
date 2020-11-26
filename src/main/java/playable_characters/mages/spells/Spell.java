package playable_characters.mages.spells;

public abstract class Spell {

    private String name;
    private int damageLevel;

    public Spell(String name, int damageLevel){
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
