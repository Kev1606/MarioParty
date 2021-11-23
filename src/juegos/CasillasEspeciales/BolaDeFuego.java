package juegos.CasillasEspeciales;

import java.awt.Point;
import java.util.ArrayList;
import juegos.Jugador;
import juegos.Tablero;
import juegos.iJuego;
import juegos.vtnFinal.VentanaFinal;

/**
 *
 * @author Hewlett Packard
 */

public class BolaDeFuego extends javax.swing.JFrame implements iJuego {
    private Jugador jugadorActual;
    private ArrayList<Jugador> jugadoresOriginal = new ArrayList<>();
    private ArrayList<Jugador> jugadoresPrueba = new ArrayList<>();
    
    private Tablero tablero;
    
    public BolaDeFuego(Jugador jugador, Tablero tablero) {
        initComponents();
        this.jugadorActual = jugador;
        this.jugadoresOriginal = tablero.getPlayerArray();
        this.tablero = tablero;
        
        llenaArrayFalso();
        seteaComboBox();
        this.setTitle(jugadorActual.getNombreCompleto());
        
        this.tablero.setTxaInfoMomento(this.tablero.getTxaInfoMomento()+"\n"+jugadorActual.getNombreCompleto()+" ha caido en la casilla Flor de Fuego\n");
        
    }
    
    private void llenaArrayFalso(){
        for (int i = 0; i < jugadoresOriginal.size(); i++) {
            if (!jugadoresOriginal.get(i).equals(jugadorActual)) {
                jugadoresPrueba.add(jugadoresOriginal.get(i));  
            }     
        }      
    }
    
    private void seteaComboBox(){
        for (int i = 0; i < jugadoresPrueba.size(); i++) {
            cbxJugadores.addItem(jugadoresPrueba.get(i).getNombreCompleto());
        }    
    }
    
    
    @Override
    public void ejecutar(Jugador jugador) {
        this.setVisible(true);
    }
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlVentana = new javax.swing.JPanel();
        lblFuego = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        cbxJugadores = new javax.swing.JComboBox<>();
        btnAceptar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnlVentana.setBackground(new java.awt.Color(0, 0, 0));

        lblFuego.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblFuego.setIcon(new javax.swing.ImageIcon(getClass().getResource("/juegos/71544963-cartón-llamas-de-fuego-del-estilo.jpg"))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Seleccione al jugador que desea regresar al inicio del juego");

        cbxJugadores.setBackground(new java.awt.Color(0, 0, 0));
        cbxJugadores.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        cbxJugadores.setForeground(new java.awt.Color(255, 255, 255));
        cbxJugadores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cbxJugadoresMouseEntered(evt);
            }
        });

        btnAceptar.setBackground(new java.awt.Color(255, 255, 255));
        btnAceptar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnAceptar.setForeground(new java.awt.Color(0, 0, 0));
        btnAceptar.setText("Aceptar");
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlVentanaLayout = new javax.swing.GroupLayout(pnlVentana);
        pnlVentana.setLayout(pnlVentanaLayout);
        pnlVentanaLayout.setHorizontalGroup(
            pnlVentanaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pnlVentanaLayout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(cbxJugadores, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlVentanaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(124, 124, 124))
            .addComponent(lblFuego, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnlVentanaLayout.setVerticalGroup(
            pnlVentanaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlVentanaLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(cbxJugadores, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addComponent(btnAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblFuego, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlVentana, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlVentana, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cbxJugadoresMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbxJugadoresMouseEntered
        cbxJugadores.setPopupVisible(true);
    }//GEN-LAST:event_cbxJugadoresMouseEntered

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
    
        String actualCastigo = cbxJugadores.getItemAt(cbxJugadores.getSelectedIndex());
        
        for (int i = 0; i < jugadoresOriginal.size(); i++) {
            if (jugadoresOriginal.get(i).getNombreCompleto().equals(actualCastigo)) {
                jugadoresOriginal.get(i).setCasillaActual(0);
                jugadoresOriginal.get(i).setPuedoAvanzar(true);
                Point ptoCasilla = tablero.getPuntoPartida().getLocation();
                jugadoresOriginal.get(i).getRefButton().setLocation(ptoCasilla.x,ptoCasilla.y+jugadoresOriginal.get(i).getIndex()*20);
            }
        }
        
        if (jugadorActual.getCasillaActual() == 26) {
            new VentanaFinal(jugadorActual.getNombreCompleto()).setVisible(true);
        }
        
        
        this.dispose();
    }//GEN-LAST:event_btnAceptarActionPerformed

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
//            java.util.logging.Logger.getLogger(BolaDeFuego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(BolaDeFuego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(BolaDeFuego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(BolaDeFuego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new BolaDeFuego().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JComboBox<String> cbxJugadores;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblFuego;
    private javax.swing.JPanel pnlVentana;
    // End of variables declaration//GEN-END:variables


}
