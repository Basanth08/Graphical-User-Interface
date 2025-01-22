package unit04.practicum;

public class arena {
    private Fighter fighter1;
    private Fighter fighter2;


    public arena(Fighter f1, Fighter f2 ){
        fighter1 = f1;
        fighter2 = f2;
    }
    public void battle() {
        while(fighter1.getHealth() > 0 && fighter2.getHealth() > 0) {
            fighter2.takeDamage(fighter1.attack());
            fighter1.takeDamage(fighter2.attack());
            System.out.println(fighter1 + " has " + fighter1.getHealth());
            System.out.println(fighter2 + " has " + fighter2.getHealth());
        }
        if(fighter1.getHealth() > fighter2.getHealth()) {
            System.out.println(fighter1 + " wins!");
        } else if(fighter2.getHealth() > fighter1.getHealth()) {
            System.out.println(fighter2 + " wins!");
        } else {
            System.out.println("Its a draw!");
        }
    }
    public static void main(String[] args) {
        Manio manio = new Manio();
        SamosA samos = new SamosA();
        arena arena = new arena(manio, samos);
        arena.battle();
    }
}

