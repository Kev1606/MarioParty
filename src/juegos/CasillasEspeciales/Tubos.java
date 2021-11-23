package juegos.CasillasEspeciales;

import java.awt.Point;
import javax.swing.JButton;
import javax.swing.JLabel;
import juegos.Jugador;
import juegos.Tablero;
import juegos.iJuego;
import juegos.vtnFinal.VentanaFinal;

/**
 *
 * @author Hewlett Packard
 */

public class Tubos implements iJuego {
    private Jugador jugadorActual;
    private JLabel[] casillasJuego;
    private Tablero tablero;
    private int ubicacionActual;
    
    public Tubos (Jugador jugadorActual, JLabel[] casillasJuego, int ubicacion, Tablero tablero){
        this.jugadorActual = jugadorActual;
        this.casillasJuego = casillasJuego;
        this.ubicacionActual = ubicacion;
        this.tablero = tablero;
        seteaUbicacion();
    }
    
    private void seteaUbicacion(){       
        if (casillasJuego[ubicacionActual].getName().equals("1")) {
            for (int i = 0; i < casillasJuego.length; i++) {
                if (casillasJuego[i].getName().equals("2")) {
                    jugadorActual.setCasillaActual(i+1);
                    Point ptoCasilla = casillasJuego[i].getLocation();
                    jugadorActual.getRefButton().setLocation(ptoCasilla.x, ptoCasilla.y + jugadorActual.getIndex() * 20);
                    break;
                }   
            }
        } else
        if (casillasJuego[ubicacionActual].getName().equals("2")){
            for (int i = 0; i < casillasJuego.length; i++) {
                
                if (casillasJuego[i].getName().equals("3")) {
                    jugadorActual.setCasillaActual(i+1);
                    Point ptoCasilla = casillasJuego[i].getLocation();
                    jugadorActual.getRefButton().setLocation(ptoCasilla.x, ptoCasilla.y + jugadorActual.getIndex() * 20);
                    
                    if (jugadorActual.getCasillaActual() == 26){
                        new VentanaFinal(jugadorActual.getNombreCompleto()).setVisible(true);
                    }
                    
                    
                    break;
                }   
            }
        }else
        if (casillasJuego[ubicacionActual].getName().equals("3")) {
            if (jugadorActual.getCasillaActual() == 26){
                new VentanaFinal(jugadorActual.getNombreCompleto()).setVisible(true);
            }
            
            for (int i = 0; i < casillasJuego.length; i++) {
                if (casillasJuego[i].getName().equals("1")) {
                    jugadorActual.setCasillaActual(i+1);
                    Point ptoCasilla = casillasJuego[i].getLocation();
                    jugadorActual.getRefButton().setLocation(ptoCasilla.x, ptoCasilla.y + jugadorActual.getIndex() * 20);
                    break;
                }   
            }        
        }
        
        tablero.setTxaInfoMomento(tablero.getTxaInfoMomento()+" Mediante un tubo ");
    }

    @Override
    public void ejecutar(Jugador jugador) {
        //seteaUbicacion();
    }
}
