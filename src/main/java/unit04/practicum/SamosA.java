package unit04.practicum;

class SamosA extends Fighter {

    public SamosA() {
        super(200); 
    }
    
    @Override
    public int attack() {
        if(Math.random() < 0.75) {
            return 40; 
        } else {
            return 75;
        }
    }
}