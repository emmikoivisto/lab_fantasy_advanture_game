package playable_characters.support.healingtools;

public abstract class HealingTool {

    private String name;
    private int healingLevel;

    public HealingTool(String name, int healingLevel){
        this.name = name;
        this.healingLevel = healingLevel;
    }

    public String getName() {
        return name;
    }

    public int getDamageLevel() {
        return healingLevel;
    }
}
