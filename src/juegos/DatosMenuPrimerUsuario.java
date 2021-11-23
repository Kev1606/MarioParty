package juegos;

/**
 *
 * @author Joctan Esquivel
 */
public class DatosMenuPrimerUsuario {
    
    int numeroJugadores;
    String nombreJugador;
    
    public DatosMenuPrimerUsuario(int numero, String nombre){
        numeroJugadores = numero;
        nombreJugador = nombre;
    }

    public int getNumeroJugadores() {
        return numeroJugadores;
    }

    public String getNombreJugador() {
        return nombreJugador;
    }
 
    
    
    
}
