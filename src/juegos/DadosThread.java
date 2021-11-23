package juegos;

import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author Hewlett Packard
 */

public class DadosThread extends Thread{
    private ImageIcon[] arrayImages;
    private JLabel lblDado1;
    private JLabel lblDado2;
    private JTextField txfDados;
    private Tablero juego;
    private int dado1, dado2;
    
    
    public DadosThread(Tablero juego,ImageIcon[] arrayImages, int dado1, int dado2, JLabel lblDado1, JLabel lblDado2, JTextField txfDados){
        this.arrayImages = arrayImages;
        this.juego = juego;
        this.txfDados = txfDados;
        this.lblDado1 = lblDado1;
        this.lblDado2 = lblDado2;
        this.dado1 = dado1;
        this.dado2 = dado2;
        this.lblDado1.setIcon(arrayImages[0]);
        this.lblDado2.setIcon(arrayImages[1]);
        juego.setTxaInfoMomento(juego.getTxaInfoMomento()+"\n---------------------------------\n");
        
    }
    
    
    @Override
    public void run(){
        int contador = 0;
        while (contador < 11){          
            int num1 = (new Random()).nextInt(6)+1;
            int num2 = (new Random()).nextInt(6)+1;
            
            lblDado1.setIcon(arrayImages[num1-1]);
            lblDado2.setIcon(arrayImages[num2-1]);
            
            try {
                sleep(250);
                
            } catch (InterruptedException ex) {
                Logger.getLogger(DadosThread.class.getName()).log(Level.SEVERE, null, ex);
            }          
            contador++;           
        }
        
        lblDado1.setIcon(arrayImages[dado1-1]);
        lblDado2.setIcon(arrayImages[dado2-1]);
        
        Jugador actual = juego.getPlayerArray().get(juego.getTurno()-1);
        if (dado1 == 6 || dado2 == 6){
            actual.setCastigos(actual.getCastigos()+1);
            if (dado1 == 6 && dado2 == 6){             
                actual.setCastigos(actual.getCastigos()+1);
            }
            txfDados.setText("CASTIGO");
            juego.setTxaInfoMomento(juego.getTxaInfoMomento()+"\nJugador Actual: " + actual.getNombreCompleto()+"\n"
                    + "Sacó: Castigo\n");
        } else {
            int numeroDados = dado1+dado2;
            juego.setTxaInfoMomento(juego.getTxaInfoMomento()+"\nJugador Actual: " + actual.getNombreCompleto()+"\n"
                    + "Sacó "+numeroDados+"\n");
            txfDados.setText(dado1+dado2+"");
        }
        System.out.println("EN DADOS THREAD "+actual.getNombreCompleto()+"  "+actual.getCastigos());
        
        juego.moverFicha(dado1+dado2);
    }
}
