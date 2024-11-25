package Adventure_Game.Player;

public class Attributes {
    
    private int health;
    private int speed;
    private int strength;
    private int intelligence;
    private int maxHealth;

    public Attributes(int health, int speed,  int strength, int intelligence) {
        this.health = health;
        this.speed = speed;
        this.strength = strength;
        this.intelligence = intelligence;
        this.maxHealth = health;
    }
    
    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = Math.min(health, maxHealth);
    }

    public void takeDamage(int damage) {
        health -= damage;
        if (health < 0) health = 0;
    }

    public int getSpeed() {
        return speed;
    }

    public int getStrength() {
        return strength;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void increaseSpeed() {
        speed++;
    }
    public void increaseStrength() {
        strength++;
    }

    public void increaseIntelligence() {
        intelligence++;

    }
}
