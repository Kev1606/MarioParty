package juegos;

import javax.swing.JButton;
import javax.swing.JLabel;
import juegos.Cartas.juegoCartas.VentanaCartas;
import juegos.CasillasEspeciales.BolaDeHielo;
import juegos.CasillasEspeciales.BolaDeFuego;
import juegos.CasillasEspeciales.Carcel;
import juegos.CasillasEspeciales.Cola;
import juegos.CasillasEspeciales.Estrella;
import juegos.CasillasEspeciales.Tubos;
import juegos.CatchTheCat.catchthecat.TableroGato;
import juegos.CollectTheCoins.juegoCoins.VentanaCoins;
import juegos.Gato.JuegoGato;
import juegos.GuessWho.juegoGW.ventanaGW;
import juegos.MemoryCard.juegoMemoryCard.VentanaJuego;
import juegos.MemoryPath.juegoMemory.VentanaMemoryP;
import juegos.SopaLetras.juegoSopa.VentanaSopaLetras;
import juegos.bomberMario.juegoBomber.VentanaBomber;

public abstract class Juegos {
    
    public static iJuego creaJuegos(Tablero tablero,JButton refButton,Jugador jugadorActual, String direccionJuego, JLabel[] casillasJuego, int ubicacionTubo){

        switch ("C:\\Users\\Hewlett Packard\\Documents\\NetBeansProjects\\MarioParty\\src\\juegos\\imagenesJuegos\\5.png")  {
            case "C:\\Users\\Hewlett Packard\\Documents\\NetBeansProjects\\MarioParty\\src\\juegos\\imagenesJuegos\\0.png":
                //Juegos.nombre("BomberMario");
                return new VentanaBomber(jugadorActual,tablero);              
            case "C:\\Users\\Hewlett Packard\\Documents\\NetBeansProjects\\MarioParty\\src\\juegos\\imagenesJuegos\\1.png":
                return new VentanaSopaLetras(jugadorActual,tablero);
            case "C:\\Users\\Hewlett Packard\\Documents\\NetBeansProjects\\MarioParty\\src\\juegos\\imagenesJuegos\\2.png":
                return new VentanaCartas(jugadorActual,tablero);
            case "C:\\Users\\Hewlett Packard\\Documents\\NetBeansProjects\\MarioParty\\src\\juegos\\imagenesJuegos\\3.png":
                return new VentanaCoins(jugadorActual,tablero);
            case "C:\\Users\\Hewlett Packard\\Documents\\NetBeansProjects\\MarioParty\\src\\juegos\\imagenesJuegos\\4.png":
                return new Cola(jugadorActual,tablero);
            case "C:\\Users\\Hewlett Packard\\Documents\\NetBeansProjects\\MarioParty\\src\\juegos\\imagenesJuegos\\5.png":
                return new TableroGato(jugadorActual,tablero);
            case "C:\\Users\\Hewlett Packard\\Documents\\NetBeansProjects\\MarioParty\\src\\juegos\\imagenesJuegos\\6.png":
                return new Estrella(jugadorActual);
            case "C:\\Users\\Hewlett Packard\\Documents\\NetBeansProjects\\MarioParty\\src\\juegos\\imagenesJuegos\\7.png":
                return new BolaDeFuego(jugadorActual,tablero);
            case "C:\\Users\\Hewlett Packard\\Documents\\NetBeansProjects\\MarioParty\\src\\juegos\\imagenesJuegos\\8.png":
                return new BolaDeHielo(jugadorActual,tablero);
            case "C:\\Users\\Hewlett Packard\\Documents\\NetBeansProjects\\MarioParty\\src\\juegos\\imagenesJuegos\\9.png":
                return new JuegoGato(jugadorActual,tablero);
            case "C:\\Users\\Hewlett Packard\\Documents\\NetBeansProjects\\MarioParty\\src\\juegos\\imagenesJuegos\\10.png":
                return new Tubos(jugadorActual,casillasJuego,ubicacionTubo,tablero);
            case "C:\\Users\\Hewlett Packard\\Documents\\NetBeansProjects\\MarioParty\\src\\juegos\\imagenesJuegos\\11.png":
                return new ventanaGW(jugadorActual,tablero);
            case "C:\\Users\\Hewlett Packard\\Documents\\NetBeansProjects\\MarioParty\\src\\juegos\\imagenesJuegos\\12.png":
                return new VentanaJuego(jugadorActual,tablero);
            case "C:\\Users\\Hewlett Packard\\Documents\\NetBeansProjects\\MarioParty\\src\\juegos\\imagenesJuegos\\13.png":
                return new VentanaMemoryP(jugadorActual,tablero);
            case "C:\\Users\\Hewlett Packard\\Documents\\NetBeansProjects\\MarioParty\\src\\juegos\\imagenesJuegos\\14.png":
                return new Carcel(jugadorActual,tablero);
  
        }
        //DEFAULT
        return new VentanaMemoryP(jugadorActual,tablero);  
    }
    
}
