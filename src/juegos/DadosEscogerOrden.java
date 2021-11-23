package juegos;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.TimerTask;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.util.Timer;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Joctan Esquivel
 */
public class DadosEscogerOrden extends javax.swing.JFrame {

    /**
     * Creates new form Tablero
     */
    Jugador jugadores[];
    ImageIcon[] arrayImages = new ImageIcon[6];
    private int numeroFinal;
    private int contadorJugadores;
    private int [] numerosFinalesJugador;
    
    
    public DadosEscogerOrden(Jugador jugadores[], int contador, int numerosDados[]) {
        this.contadorJugadores = contador;
        this.jugadores = jugadores;
        this.numerosFinalesJugador = numerosDados;
        initComponents();
        setImages();
        this.lblDado1.setIcon(arrayImages[0]);
        this.lblDado2.setIcon(arrayImages[1]);
        this.lblSubtitulo.setText("¡SUERTE  "+this.jugadores[contadorJugadores].getNombreCompleto().toUpperCase()+"!");
    }
    
    public int getResultadoFinal(String dado1, String dado2){
        int resultado = 0;
        for (int i = 0; i < arrayImages.length; i++) {
            if (dado1 == arrayImages[i].toString()) {
                resultado = i;
                break;
            }
        }
        for (int j = 0; j < arrayImages.length; j++) {
            if (dado2 == arrayImages[j].toString()) {
                resultado += j;
                break;
            }
        }
        return resultado+2;
        
    }
    

    public int getNumeroFinal() {
        return numeroFinal;
    }

    public void setNumeroFinal(int numeroFinal) {
        this.numeroFinal = numeroFinal;
    }
    
    private void setImages(){
        arrayImages[0] = new ImageIcon("C:\\Users\\Hewlett Packard\\Documents\\NetBeansProjects\\MarioParty\\src\\juegos\\fotos\\dado1.png");
        arrayImages[1] = new ImageIcon("C:\\Users\\Hewlett Packard\\Documents\\NetBeansProjects\\MarioParty\\src\\juegos\\fotos\\dado2.png");
        arrayImages[2] = new ImageIcon("C:\\Users\\Hewlett Packard\\Documents\\NetBeansProjects\\MarioParty\\src\\juegos\\fotos\\dado3.png");
        arrayImages[3] = new ImageIcon("C:\\Users\\Hewlett Packard\\Documents\\NetBeansProjects\\MarioParty\\src\\juegos\\fotos\\dado4.png");
        arrayImages[4] = new ImageIcon("C:\\Users\\Hewlett Packard\\Documents\\NetBeansProjects\\MarioParty\\src\\juegos\\fotos\\dado5.png");
        arrayImages[5] = new ImageIcon("C:\\Users\\Hewlett Packard\\Documents\\NetBeansProjects\\MarioParty\\src\\juegos\\fotos\\dado6.png");
    }   

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblTituloGenerico = new javax.swing.JLabel();
        lblSubtitulo = new javax.swing.JLabel();
        lblDado2 = new javax.swing.JLabel();
        btnLanzaDados = new javax.swing.JButton();
        lblDado1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 51));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblTituloGenerico.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblTituloGenerico.setForeground(new java.awt.Color(0, 0, 0));
        lblTituloGenerico.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTituloGenerico.setText("Lance los dados para escoger el orden en el cual jugarán");

        lblSubtitulo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblSubtitulo.setForeground(new java.awt.Color(0, 0, 0));
        lblSubtitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSubtitulo.setText("¡Suerte");

        lblDado2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, null, new java.awt.Color(0, 0, 0)));

        btnLanzaDados.setBackground(new java.awt.Color(0, 0, 0));
        btnLanzaDados.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnLanzaDados.setForeground(new java.awt.Color(255, 255, 255));
        btnLanzaDados.setText("Lanzar Dados");
        btnLanzaDados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLanzaDadosActionPerformed(evt);
            }
        });

        lblDado1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, null, new java.awt.Color(0, 0, 0)));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/juegos/MemoryPath/imagenFondo/png-clipart-super-mario-bros-3-super-mario-world-mario-heroes-super-mario-bros.png"))); // NOI18N

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/juegos/MemoryPath/imagenFondo/png-clipart-super-mario-bros-3-super-mario-world-mario-heroes-super-mario-bros-VOLTEADA.png"))); // NOI18N

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/juegos/MemoryPath/imagenFondo/index.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblTituloGenerico, javax.swing.GroupLayout.DEFAULT_SIZE, 514, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblSubtitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(62, 62, 62))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblDado1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblDado2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(76, 76, 76))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnLanzaDados, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(170, 170, 170))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblTituloGenerico, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblSubtitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblDado2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblDado1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(46, 46, 46)
                                .addComponent(btnLanzaDados, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(77, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(247, 247, 247)
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    private int giraDados(JLabel dado1,JLabel dado2, JFrame pantalla){
        
        Timer tiempo = new Timer();
        TimerTask girar = null;
        girar = new TimerTask() {
            int contador =0;
            @Override
            public void run() {
                int num1 = (int) (Math.random()*5+1);
                int num2 = (int) (Math.random()*5+1);
                
                if (contador==12){
                    cancel();
                    dado1.setIcon(arrayImages[num1]);
                    dado2.setIcon(arrayImages[num2]);
                    JOptionPane.showMessageDialog(pantalla,jugadores[contadorJugadores].getNombreCompleto().toUpperCase()+" has obtenido un "+((num1+1)+(num2+1)), "Puntos Obtenidos", 1); 
                    setNumeroFinal(getResultadoFinal(dado1.getIcon().toString(), dado2.getIcon().toString()));
                    
                    
                    if (jugadores.length >= contadorJugadores) {
                        numerosFinalesJugador[contadorJugadores] = getNumeroFinal();
                        System.out.println(numerosFinalesJugador[contadorJugadores]);
                        contadorJugadores+=1;
                        
                        if (jugadores.length == contadorJugadores){
                            //ordenar
                            ordenaJugadores(jugadores,numerosFinalesJugador);                       
                        } else {
                            //numerosFinalesJugador[contadorJugadores] = getNumeroFinal();
                            DadosEscogerOrden dados = new DadosEscogerOrden(jugadores,contadorJugadores,numerosFinalesJugador);
                            dados.setVisible(true);
                            pantalla.dispose();
                        }
                    }
                   
                    
                }  
               dado1.setIcon(arrayImages[num1]);
               dado2.setIcon(arrayImages[num2]);
               contador++;               
            }
        };
        
      
        tiempo.schedule(girar,0,250);
        int num1 = (int) (Math.random()*5+1);
        int num2 = (int) (Math.random()*5+1);
                        
        dado1.setIcon(arrayImages[num1]);
        dado2.setIcon(arrayImages[num2]);
        return num1+num2;
        
    }
    
    private int indiceMaximo(int array[]){
        int mayor = 0;
        int indice = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > mayor){
                mayor = array[i];
                indice = i;
            }
        }
        return indice;
    }
    
    private void ordenaJugadores(Jugador jugadores[], int arrayDados[]){
        Jugador[] arrayJugadores = new Jugador[jugadores.length];
        for (int i = 0; i < arrayDados.length; i++) {
            arrayJugadores[i] = jugadores[indiceMaximo(arrayDados)];
            arrayDados[indiceMaximo(arrayDados)] = 0;        
        }
        Tablero juegoTablero = new Tablero(arrayJugadores); 
        juegoTablero.setVisible(true);    
        this.dispose();      
    }
    
    
    private void btnLanzaDadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLanzaDadosActionPerformed
        
        // TODO add your handling code here:
        int numero = giraDados(this.lblDado1,lblDado2,this);
        SongThread cancion = new SongThread("sonidoDados.wav");
        cancion.start();
        lblDado1.getIcon();
        
        
        
        
//        try{  
//            Thread hilo = new Thread();
//            hilo.sleep(3500);
//            System.out.println(getResultadoFinal(lblDado1.getIcon().toString(), lblDado2.getIcon().toString()));
//            
//        } catch (InterruptedException ex) {
//            
//        }

    }//GEN-LAST:event_btnLanzaDadosActionPerformed

//    /**
//     * @param args the command line arguments
//     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(DadosEscogerOrden.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(DadosEscogerOrden.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(DadosEscogerOrden.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(DadosEscogerOrden.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//               new DadosEscogerOrden().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLanzaDados;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblDado1;
    private javax.swing.JLabel lblDado2;
    private javax.swing.JLabel lblSubtitulo;
    private javax.swing.JLabel lblTituloGenerico;
    // End of variables declaration//GEN-END:variables
}
