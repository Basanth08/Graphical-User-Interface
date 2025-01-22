package unit04.practicum;

class Manio extends Fighter {

    public Manio() {
        super(100);
    }
    
    @Override
    public int attack() {
        return (int)(Math.random() * 50) + 25; 
    }

    @Override
    public void takeDamage(int damage) {
        if(Math.random() < 0.25) {
            return; 
        }
        super.takeDamage(damage);
    }
    
}
