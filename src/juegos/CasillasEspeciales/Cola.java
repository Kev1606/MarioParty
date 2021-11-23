package juegos.CasillasEspeciales;

import java.awt.Point;
import juegos.Jugador;
import juegos.Tablero;
import juegos.iJuego;
import juegos.vtnFinal.VentanaFinal;

/**
 *
 * @author Joctan Esquivel
 */
public class Cola extends javax.swing.JFrame implements iJuego {
    private Jugador jugadorActual;
    private Tablero tablero;
    
    private int contador;
    private int avance;
    
    public Cola(Jugador jugador, Tablero tablero) {
        initComponents();
        this.jugadorActual = jugador;
        this.tablero = tablero;
        this.contador = jugador.getCasillaActual();
        setNumerosBotones();
        
        this.setTitle(jugadorActual.getNombreCompleto());
        this.tablero.setTxaInfoMomento(this.tablero.getTxaInfoMomento()+"\n"+jugadorActual.getNombreCompleto()+" ha caido en la casilla Cola\n");
        
        if (jugadorActual.getCasillaActual() == 26) {
            new VentanaFinal(jugadorActual.getNombreCompleto()).setVisible(true);
        }
    
    }
    
    @Override
    public void ejecutar(Jugador jugador) {
        this.setVisible(true);
    }
    
    
    private void avanzar(int casilla){
        Point ptoCasilla = tablero.getLabelsArray()[casilla-1].getLocation();
        jugadorActual.getRefButton().setLocation(ptoCasilla.x, ptoCasilla.y + jugadorActual.getIndex() * 20);
    }
    

    private void setNumerosBotones(){
        if(this.contador==1){
            this.lblRetroceder.setVisible(false);
            this.btnRetroceder1.setVisible(false);
            this.btnRetroceder2.setVisible(false);
            this.btnRetroceder3.setVisible(false);
            
            this.btnAvanzar1.setText(contador+1+"");
            this.btnAvanzar2.setText(contador+2+"");
            this.btnAvanzar3.setText(contador+3+"");
        }else if(this.contador==2){
            this.btnRetroceder1.setText(contador-1+"");
            this.btnRetroceder2.setVisible(false);
            this.btnRetroceder3.setVisible(false);
            
            this.btnAvanzar1.setText(contador+1+"");
            this.btnAvanzar2.setText(contador+2+"");
            this.btnAvanzar3.setText(contador+3+"");
        }else if(this.contador==3){
            this.btnRetroceder1.setText(contador-1+"");
            this.btnRetroceder2.setText(contador-2+"");
            this.btnRetroceder3.setVisible(false);
            
            this.btnAvanzar1.setText(contador+1+"");
            this.btnAvanzar2.setText(contador+2+"");
            this.btnAvanzar3.setText(contador+3+"");
        }else if(this.contador==26){
            this.lblAvanzar.setVisible(false);
            this.btnRetroceder1.setText(contador-1+"");
            this.btnRetroceder2.setText(contador-2+"");
            this.btnRetroceder3.setText(contador-3+"");
            
            this.btnAvanzar1.setVisible(false);
            this.btnAvanzar2.setVisible(false);
            this.btnAvanzar3.setVisible(false);
        }else if(this.contador==25){
            this.btnRetroceder1.setText(contador-1+"");
            this.btnRetroceder2.setText(contador-2+"");
            this.btnRetroceder3.setText(contador-3+"");
            
            this.btnAvanzar1.setText(contador+1+"");
            this.btnAvanzar2.setVisible(false);
            this.btnAvanzar3.setVisible(false);
        }else if(this.contador==24){
            this.btnRetroceder1.setText(contador-1+"");
            this.btnRetroceder2.setText(contador-2+"");
            this.btnRetroceder3.setText(contador-3+"");
            
            this.btnAvanzar1.setText(contador+1+"");
            this.btnAvanzar2.setText(contador+2+"");
            this.btnAvanzar3.setVisible(false);
        }else{
            this.btnRetroceder1.setText(contador-1+"");
            this.btnRetroceder2.setText(contador-2+"");
            this.btnRetroceder3.setText(contador-3+"");
            
            this.btnAvanzar1.setText(contador+1+"");
            this.btnAvanzar2.setText(contador+2+"");
            this.btnAvanzar3.setText(contador+3+"");
        }
        
    }
    
    public int getAvance(){
        return this.avance; 
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        btnRetroceder1 = new javax.swing.JButton();
        btnRetroceder2 = new javax.swing.JButton();
        btnRetroceder3 = new javax.swing.JButton();
        btnAvanzar1 = new javax.swing.JButton();
        btnAvanzar2 = new javax.swing.JButton();
        btnAvanzar3 = new javax.swing.JButton();
        lblRetroceder = new javax.swing.JLabel();
        lblAvanzar = new javax.swing.JLabel();

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Seleccione la casilla a la cual se quiere mover");

        btnRetroceder1.setText(" ");
        btnRetroceder1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRetroceder1ActionPerformed(evt);
            }
        });

        btnRetroceder2.setText(" ");
        btnRetroceder2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRetroceder2ActionPerformed(evt);
            }
        });

        btnRetroceder3.setText(" ");
        btnRetroceder3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRetroceder3ActionPerformed(evt);
            }
        });

        btnAvanzar1.setText(" ");
        btnAvanzar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAvanzar1ActionPerformed(evt);
            }
        });

        btnAvanzar2.setText(" ");
        btnAvanzar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAvanzar2ActionPerformed(evt);
            }
        });

        btnAvanzar3.setText(" ");
        btnAvanzar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAvanzar3ActionPerformed(evt);
            }
        });

        lblRetroceder.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblRetroceder.setText("Retroceder");

        lblAvanzar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblAvanzar.setText("Avanzar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblRetroceder, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnRetroceder1, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                            .addComponent(btnRetroceder3, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                            .addComponent(btnRetroceder2, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(btnAvanzar1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnAvanzar2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnAvanzar3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblAvanzar, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 323, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRetroceder, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAvanzar, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRetroceder1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAvanzar1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRetroceder2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAvanzar2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRetroceder3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAvanzar3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnRetroceder1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRetroceder1ActionPerformed
        // TODO add your handling code here:
        this.avance=-1;
        System.out.println("-1");
        //tablero.moverFicha(avance);
        avanzar(contador-1);
        this.jugadorActual.setCasillaActual(contador-1);
        this.jugadorActual.setPuedoAvanzar(false);
        this.dispose();
    }//GEN-LAST:event_btnRetroceder1ActionPerformed

    private void btnRetroceder2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRetroceder2ActionPerformed
        // TODO add your handling code here:
        this.avance=-2;
        System.out.println("-2");
        //tablero.moverFicha(avance);
        avanzar(contador-2);
        this.jugadorActual.setCasillaActual(contador-2);
        this.jugadorActual.setPuedoAvanzar(false);
        this.dispose();
    }//GEN-LAST:event_btnRetroceder2ActionPerformed

    private void btnRetroceder3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRetroceder3ActionPerformed
        // TODO add your handling code here:
        this.avance=-3;
        System.out.println("-3");
        //tablero.moverFicha(avance);
        avanzar(contador-3);
        this.jugadorActual.setCasillaActual(contador-3);
        this.jugadorActual.setPuedoAvanzar(false);
        this.dispose();
    }//GEN-LAST:event_btnRetroceder3ActionPerformed

    private void btnAvanzar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAvanzar1ActionPerformed
        // TODO add your handling code here:
        this.avance=1;
        System.out.println("1");
        //tablero.moverFicha(avance);
        avanzar(contador+1);
        if (contador+1 == 26) {
            jugadorActual.setPuedoAvanzar(false);
        }
        
        this.jugadorActual.setCasillaActual(contador+1);
        this.jugadorActual.setPuedoAvanzar(false);
        this.dispose();
    }//GEN-LAST:event_btnAvanzar1ActionPerformed

    private void btnAvanzar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAvanzar2ActionPerformed
        // TODO add your handling code here:
        this.avance=2;
        System.out.println("2");
        //tablero.moverFicha(avance);
        avanzar(contador+2);
        
        if (contador+1 == 26) {
            jugadorActual.setPuedoAvanzar(false);
        }
        
        
        this.jugadorActual.setCasillaActual(contador+2);
        this.jugadorActual.setPuedoAvanzar(false);
        this.dispose();
    }//GEN-LAST:event_btnAvanzar2ActionPerformed

    private void btnAvanzar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAvanzar3ActionPerformed
        // TODO add your handling code here:
        this.avance=3;
        System.out.println("3");
        //tablero.moverFicha(avance);
        avanzar(contador+3);
        
        if (contador+1 == 26) {
            jugadorActual.setPuedoAvanzar(false);
        }
        
        this.jugadorActual.setCasillaActual(contador+3);
        this.jugadorActual.setPuedoAvanzar(false);
        this.dispose();
    }//GEN-LAST:event_btnAvanzar3ActionPerformed

    
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
//            java.util.logging.Logger.getLogger(Cola.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(Cola.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(Cola.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(Cola.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new Cola(26).setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAvanzar1;
    private javax.swing.JButton btnAvanzar2;
    private javax.swing.JButton btnAvanzar3;
    private javax.swing.JButton btnRetroceder1;
    private javax.swing.JButton btnRetroceder2;
    private javax.swing.JButton btnRetroceder3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JList<String> jList1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAvanzar;
    private javax.swing.JLabel lblRetroceder;
    // End of variables declaration//GEN-END:variables


}
