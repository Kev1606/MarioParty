package juegos.Cartas.juegoCartas;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import juegos.Jugador;
import juegos.Tablero;

import juegos.iJuego;
import juegos.vtnFinal.VentanaFinal;

public class VentanaCartas extends javax.swing.JFrame implements iJuego{
    private JLabel[][] cartas;
    private ArrayList<Jugador> jugadoresOriginal = new ArrayList<>();
    private ArrayList<Jugador> jugadoresPrueba = new ArrayList<>();
    
    
    private Tablero tablero;
    private Jugador jugadorActual;
    private Jugador contrincante;
    
    
    private int click = 1;
    private String cartaSeleccionada;
    private String cartaOponente;
    
    
    public VentanaCartas(Jugador jugadorActual, Tablero tablero) {
        initComponents();
        this.tablero = tablero;
        this.jugadoresOriginal = tablero.getPlayerArray();
        this.jugadorActual = jugadorActual;
        
        llenaArrayFalso();
        setContrincante();
             
        cartaSeleccionada = JuegoCartas.escogeCarta();
        cartaOponente = JuegoCartas.escogeCarta();
        
        poneCartas();
        checkeaCartas();
        this.setTitle(jugadorActual.getNombreCompleto());
        
        this.tablero.setTxaInfoMomento(this.tablero.getTxaInfoMomento()+"\n"+jugadorActual.getNombreCompleto()+" está jugando Mario Cards\n"
                                        + "Contrincante: "+this.contrincante.getNombreCompleto()+"\n");
    }
    
    @Override
    public void ejecutar(Jugador jugadorActual) {
        this.setVisible(true);
    }
    
    private void llenaArrayFalso(){
        for (int i = 0; i < jugadoresOriginal.size(); i++) {
            if (!jugadoresOriginal.get(i).equals(jugadorActual)) {
                this.jugadoresPrueba.add(jugadoresOriginal.get(i));  
            }     
        }      
    } 
    
    private void setContrincante(){
        Random random = new Random();
        for (int i = 0; i < this.jugadoresPrueba.size(); i++) {
            System.out.println("Revisando Cartas > "+this.jugadoresPrueba.get(i).getNombreCompleto());
        }
        
        
        int azar = random.nextInt(this.jugadoresPrueba.size());
        System.out.println(azar);
        
        this.contrincante = jugadoresPrueba.get(azar);
    }
    
    private void poneCartas(){
        cartas = new JLabel[4][13];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 13; j++) {
                cartas[i][j] = new JLabel();
                cartas[i][j].setBounds(12+(j*105), 10+(i*145), 96, 126);
                cartas[i][j].setIcon(new ImageIcon("C:\\Users\\Hewlett Packard\\Documents\\NetBeansProjects\\MarioParty\\src\\juegos\\Cartas\\carta\\carta.png"));
                cartas[i][j].setVisible(true);
                jPanel1.add(cartas[i][j],0); 
            }
        }
    }
    
    private void checkeaCartas(){
        lblActual.setText(this.jugadorActual.getNombreCompleto());
        lblContrincante.setText(this.contrincante.getNombreCompleto());
                
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 13; j++) {
                cartas[i][j].addMouseListener(new MouseAdapter(){
                    @Override
                    public void mousePressed(MouseEvent evt){
                        if (click <= 2) { 
                            for (int k = 0; k < 4; k++) {
                                for (int l = 0; l < 13; l++) {
                                    if (evt.getSource() == cartas[k][l]) {
                                        if (click == 1) {
                                            click++;
                                            lblImagenActual.setIcon(new ImageIcon("C:\\Users\\Hewlett Packard\\Documents\\NetBeansProjects\\MarioParty\\src\\juegos\\Cartas\\imagenesCartas\\"+cartaSeleccionada+".png"));               
                                            mensajeSiguiente();
                                            
                                        } else {
                                            lblImagenContrincante.setIcon(new ImageIcon("C:\\Users\\Hewlett Packard\\Documents\\NetBeansProjects\\MarioParty\\src\\juegos\\Cartas\\imagenesCartas\\"+cartaOponente+".png"));               
                                            escogeMayor();
                                        }
                                                       
                                    }
                                }
                            }
                        }
                    }
                });
            }            
        }
    }
    
    private void mensajeSiguiente(){
        JOptionPane.showMessageDialog(this, "Es turno de "+contrincante.getNombreCompleto(), "Atención", 1);
    }
    
    
    private void escogeMayor(){
        
        if (cartaSeleccionada.compareTo(cartaOponente) < 0) {
            JOptionPane.showMessageDialog(this, "FELICIDADES "+jugadorActual.getNombreCompleto().toUpperCase()+", HAS GANADO", "ATENCION", 1);
            jugadorActual.setPuedoAvanzar(true);
        } else if (cartaSeleccionada.compareTo(cartaOponente) > 0) {
            JOptionPane.showMessageDialog(this, "LO SENTIMOS "+jugadorActual.getNombreCompleto().toUpperCase()+", NO HAS LOGRADO GANAR", "ATENCION", 1);   
            jugadorActual.setPuedoAvanzar(false);
        }
        
        if (jugadorActual.getCasillaActual() == 26 & jugadorActual.isPuedoAvanzar()){
            new VentanaFinal(jugadorActual.getNombreCompleto()).setVisible(true);
        }
        
        
        this.dispose();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        pnlResultados = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblImagenContrincante = new javax.swing.JLabel();
        lblImagenActual = new javax.swing.JLabel();
        lblContrincante = new javax.swing.JLabel();
        lblActual = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 51, 51));

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setPreferredSize(new java.awt.Dimension(1385, 602));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1383, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        pnlResultados.setBackground(new java.awt.Color(51, 51, 51));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CARTA");

        lblContrincante.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblContrincante.setForeground(new java.awt.Color(255, 255, 255));
        lblContrincante.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        lblActual.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblActual.setForeground(new java.awt.Color(255, 255, 255));
        lblActual.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout pnlResultadosLayout = new javax.swing.GroupLayout(pnlResultados);
        pnlResultados.setLayout(pnlResultadosLayout);
        pnlResultadosLayout.setHorizontalGroup(
            pnlResultadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlResultadosLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(pnlResultadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblImagenContrincante, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblImagenActual, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(24, Short.MAX_VALUE))
            .addComponent(lblActual, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lblContrincante, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnlResultadosLayout.setVerticalGroup(
            pnlResultadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlResultadosLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(lblActual, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblImagenActual, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 77, Short.MAX_VALUE)
                .addComponent(lblContrincante, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblImagenContrincante, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(pnlResultados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnlResultados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
//            java.util.logging.Logger.getLogger(VentanaCartas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(VentanaCartas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(VentanaCartas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(VentanaCartas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new VentanaCartas().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblActual;
    private javax.swing.JLabel lblContrincante;
    private javax.swing.JLabel lblImagenActual;
    private javax.swing.JLabel lblImagenContrincante;
    private javax.swing.JPanel pnlResultados;
    // End of variables declaration//GEN-END:variables


}
