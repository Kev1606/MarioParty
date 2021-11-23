package juegos.GuessWho.juegoGW;

import java.util.Random;

public class JuegoGW {
    private int imagen;
    private String nombresPersonajes[] = {"BOO", "BOWSER JR", "BOWSER", "DAISY", "FLY GREEN TURTLE", "FLY RED TURTLE", "GOOMBA",
                                            "KING BOO", "KOOPA", "LUIGI", "MARIO", "PEACH", "TOAD", "TOADETTE", "YOSHI"};
    private Random aleatorio;

    
    public JuegoGW(){
        aleatorio = new Random();
        escogeImagen();
    }
    
    private void escogeImagen(){
        imagen = aleatorio.nextInt(15);
    }
    
    public int getImagen(){
        return imagen;
    }
    
    public String getPersonaje(){
        return nombresPersonajes[imagen];
    }
}
