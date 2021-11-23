package juegos.SopaLetras.juegoSopa;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import juegos.Jugador;

/**
 *
 * @author Joctan Esquivel
 */
public class ThreadClockSopa extends Thread{
        JLabel relojPantalla;
        VentanaSopaLetras juego;
        Jugador jugadorActual;
        int segundos;
        int minutos;
        public ThreadClockSopa(JLabel  reloj, VentanaSopaLetras pantalla, Jugador jugador){
            this.relojPantalla = reloj;
            this.juego = pantalla;
            this.jugadorActual = jugador;
            
            
            //System.out.println(reloj.getText());
            String min = reloj.getText().substring(0, 2);
            this.minutos = Integer.parseInt(min);
            //System.out.println(minutos);
            String seg = reloj.getText().substring(3);
            this.segundos = Integer.parseInt(seg);
            //System.out.println(segundos);
        }
        
        @Override
        public void run(){
            
            while (true){
                if(segundos==0){
                    this.segundos=59;
                    this.minutos-=1;
                }else{
                    segundos--;
                }
                
                if((segundos == 0 && minutos == 0)){
                    JOptionPane.showMessageDialog(juego, "LO SIENTO "+jugadorActual.getNombreCompleto().toUpperCase()+", NO HAS PODIDO COMPLETARLO :( ", "ATENCION", 1);
                    jugadorActual.setPuedoAvanzar(false);
                    juego.dispose();
                    break;
                }
            
                if(segundos>9){
                    this.relojPantalla.setText("0"+minutos+":"+segundos);
                    
                } else{
                    this.relojPantalla.setText("0"+minutos+":"+"0"+segundos);
                    
                }
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                }
               
            }
            
        }
}
