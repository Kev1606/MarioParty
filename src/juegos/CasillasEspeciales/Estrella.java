package juegos.CasillasEspeciales;

import juegos.Jugador;
import juegos.Tablero;
import juegos.iJuego;
import juegos.vtnFinal.VentanaFinal;

/**
 *
 * @author Hewlett Packard
 */

public class Estrella implements iJuego{
    private Jugador jugadorActual;

    public Estrella (Jugador jugadorActual){
        this.jugadorActual = jugadorActual;
        if (jugadorActual.getCasillaActual() == 26) {
            new VentanaFinal(jugadorActual.getNombreCompleto()).setVisible(true);
        }
    }

    @Override
    public void ejecutar(Jugador jugador) {
    }
}
