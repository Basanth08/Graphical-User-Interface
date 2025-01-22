package unit04.practicum;

public abstract class Fighter {

    private int health;
    
    public Fighter(int health) {
        this.health = health;
    }
    
    public int getHealth() {
        return health;
    }
    
    public void takeDamage(int damage) {
        health -= damage; 
        if(health < 0) {
            health = 0; 
        }
    }
    public abstract int attack(); 
}

