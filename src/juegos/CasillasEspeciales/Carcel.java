package juegos.CasillasEspeciales;

import juegos.Jugador;
import juegos.Tablero;
import juegos.iJuego;
import juegos.vtnFinal.VentanaFinal;

/**
 *
 * @author Hewlett Packard
 */
public class Carcel implements iJuego{
    private Jugador jugadorActual;
    private Tablero tablero;
    
    public Carcel (Jugador jugadorActual, Tablero tablero){
        this.jugadorActual = jugadorActual;
        this.tablero = tablero;
        //ejecutaCarcel();
    }
    
    private void ejecutaCarcel(){
        
        this.tablero.setTxaInfoMomento(this.tablero.getTxaInfoMomento()+"\n"+jugadorActual.getNombreCompleto()+" ha caido en la casilla Carcel\n");
        
        jugadorActual.setCastigos(jugadorActual.getCastigos()+2);
        if (jugadorActual.getCasillaActual() == 26) {
            new VentanaFinal(jugadorActual.getNombreCompleto()).setVisible(true);
        }
    }
    

    @Override
    public void ejecutar(Jugador jugador) {
        ejecutaCarcel();
    }
}
