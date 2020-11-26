package playable_characters.fighters.defencemechanisms;

public abstract class DefenceMechanism {

    private String name;
    private int defenceLevel;

    public DefenceMechanism(String name, int defenceLevel) {
        this.name = name;
        this.defenceLevel = defenceLevel;
    }

    public String getName() {
        return name;
    }

    public int getDefenceLevel() {
        return defenceLevel;
    }

}
