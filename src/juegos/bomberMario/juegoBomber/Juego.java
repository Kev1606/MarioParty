package juegos.bomberMario.juegoBomber;

import java.util.Random;

public class Juego {
    private int dimension;
    private Random random = new Random();
    
    public Juego(){
        escogeDimension();
    }
    
    private void escogeDimension(){
        this.dimension = random.nextInt(3)+1;
    }
    
    public int getDimension(){
        return this.dimension;
    }
}
