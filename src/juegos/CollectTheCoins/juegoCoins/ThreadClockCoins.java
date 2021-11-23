package juegos.CollectTheCoins.juegoCoins;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import juegos.Jugador;
import juegos.vtnFinal.VentanaFinal;

/**
 *
 * @author Joctan Esquivel
 */
public class ThreadClockCoins extends Thread{
        private JLabel relojPantalla;
        private VentanaCoins juego;
        private Jugador jugadorActual;
        private int segundos;
        private int minutos;
        
        public ThreadClockCoins(JLabel  reloj, VentanaCoins pantalla, Jugador jugador){
            this.relojPantalla = reloj;
            this.juego = pantalla;
            this.jugadorActual = jugador;
            
            String min = reloj.getText().substring(0, 2);
            this.minutos = Integer.parseInt(min);
            String seg = reloj.getText().substring(3);
            this.segundos = Integer.parseInt(seg);
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
                 if((segundos!=0 && minutos!=0)){
                    break;
                }
            
                if(segundos>9){
                this.relojPantalla.setText("0"+minutos+":"+segundos);
                }else{
                    this.relojPantalla.setText("0"+minutos+":"+"0"+segundos);
                }
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                }
               
            }
            int puntosObtenidos = juego.getPuntos();
                     
            if ( puntosObtenidos > 0  ) {
                //gana
                JOptionPane.showMessageDialog(juego, "FELICIDADES "+jugadorActual.getNombreCompleto().toUpperCase()+", HAS GANADO :) ","ATENCION",1);
                jugadorActual.setPuedoAvanzar(true);
                
                if (jugadorActual.getCasillaActual() == 26 & jugadorActual.isPuedoAvanzar()){
                    new VentanaFinal(jugadorActual.getNombreCompleto()).setVisible(true);
                }
                
            } else {
                //perdedor
                JOptionPane.showMessageDialog(juego, "LO SIENTO "+jugadorActual.getNombreCompleto().toUpperCase()+", HAS PERDIDO :( ","ATENCION",1);  
                jugadorActual.setPuedoAvanzar(false);
            }
            juego.dispose();
            
        }
}
