package juegos;

import java.awt.Color;
import javax.swing.JButton;

public class Jugador {
    public static final int BUTTON_SIZE = 120;
    
    private String nombreCompleto;
    private int index;
    private JButton refButton;
    private int casillaActual;
    private Color color;
    private boolean puedoAvanzar;
    private int castigos;

    public Jugador(Color colorJugador, String nombreCompleto, int index, JButton refButton) {
        this.nombreCompleto = nombreCompleto;
        this.color = colorJugador;
        this.index = index;
        this.casillaActual = 0;
        this.refButton = refButton;
        this.puedoAvanzar = true;
        this.castigos = 0;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public boolean isPuedoAvanzar() {
        return puedoAvanzar;
    }

    public void setPuedoAvanzar(boolean puedoAvanzar) {
        this.puedoAvanzar = puedoAvanzar;
    }

    public int getCastigos() {
        return castigos;
    }

    public void setCastigos(int castigos) {
        this.castigos = castigos;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public JButton getRefButton() {
        return this.refButton;
    }

    public void setRefButton(JButton refButton) {
        this.refButton = refButton;
    }

    public int getCasillaActual() {
        return casillaActual;
    }

    public void setCasillaActual(int casillaActual) {
        this.casillaActual = casillaActual;
    }
    
    public void avanzarCasillaActual(int avance) {
        this.casillaActual += avance;
    }
    
}
