package playable_characters;

public abstract class Player {

    private int healthPoint;
    private String name;

    public Player(String name, int healthPoint) {
        this.name = name;
        this.healthPoint = healthPoint;
    }

    public String getName() {
        return name;
    }

    public int getHealthPoint() {
        return healthPoint;
    }
    
}
