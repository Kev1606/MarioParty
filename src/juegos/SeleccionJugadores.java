
package juegos;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JOptionPane;

/**
 *
 * @author Hewlett Packard
 */
public class SeleccionJugadores extends javax.swing.JFrame {
    private String nombreJugador;
    
    private Jugador jugadores[];
    private Color coloresJugadores[];
    private int limiteJugadores;
    
    private Color color;
    
    private boolean avanzar = true;
    private int contadorJugadores;
    private int metodoInicio;
    private int numeroAleatorio;
    
    public SeleccionJugadores(Color coloresJugadores[],Jugador jugadores[], int limiteJugadores, int contador, 
                                int metodoInicio, int numeroAleatorio) {
        initComponents();
        this.metodoInicio = metodoInicio;
        this.numeroAleatorio = numeroAleatorio;
        this.coloresJugadores = coloresJugadores;
        this.jugadores = jugadores;
        this.limiteJugadores = limiteJugadores;
        this.contadorJugadores = contador; 
    }
    
    private JButton creaButonesJugadores(){
        JButton newButton = new JButton("" + (contadorJugadores));
        newButton.setBackground(color);
        newButton.setBounds(0, (contadorJugadores-1)*20, 40, 20);
        return newButton;
    }

    public String getNombreJugador() {
        return nombreJugador;
    }

    public Color getColor() {
        return color;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblNombreJugadores = new javax.swing.JLabel();
        txfNombre = new javax.swing.JTextField();
        lblColores = new javax.swing.JLabel();
        cbxColor = new javax.swing.JComboBox<>();
        btnAceptar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setFont(new java.awt.Font("Tahoma", 2, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("BIENVENIDO ");

        lblNombreJugadores.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblNombreJugadores.setForeground(new java.awt.Color(255, 255, 255));
        lblNombreJugadores.setText("Nombre:");

        txfNombre.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txfNombre.setForeground(new java.awt.Color(0, 0, 0));
        txfNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txfNombreActionPerformed(evt);
            }
        });
        txfNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txfNombreKeyReleased(evt);
            }
        });

        lblColores.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblColores.setForeground(new java.awt.Color(255, 255, 255));
        lblColores.setText("Seleccione color:");

        cbxColor.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cbxColor.setForeground(new java.awt.Color(255, 255, 255));
        cbxColor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Rojo", "Azul", "Amarillo", "Verde", "Rosado", "Turquesa", "Marron", "Naranja", "Celeste", "Morado" }));

        btnAceptar.setBackground(new java.awt.Color(255, 255, 255));
        btnAceptar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnAceptar.setForeground(new java.awt.Color(0, 0, 0));
        btnAceptar.setText("Aceptar");
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });

        btnLimpiar.setBackground(new java.awt.Color(255, 255, 255));
        btnLimpiar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnLimpiar.setForeground(new java.awt.Color(0, 0, 0));
        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/juegos/MemoryPath/imagenFondo/index.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(98, 98, 98)
                .addComponent(btnAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(75, 111, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(lblColores, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(cbxColor, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(lblNombreJugadores, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombreJugadores, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txfNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblColores, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbxColor, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45))
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

    private void txfNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txfNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txfNombreActionPerformed

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        nombreJugador = txfNombre.getText();
        if (nombreJugador.length() <= 2) {
            JOptionPane.showMessageDialog(this, "Debe digitar dos caracteres o más", "Advertencia", 2);
        } else {
            color = new Color(0);

            switch (cbxColor.getSelectedIndex()){
                case 0:
                    color = new Color(255, 0, 0);
                    break;
                case 1:
                    color = new Color(0, 0, 255);
                    break;
                case 2:
                    color = new Color(255, 255, 0);
                    break;
                case 3:
                    color = new Color(0, 255, 0);
                    break;
                case 4:
                    color = new Color(255, 130, 130);
                    break;
                case 5:
                    color = new Color(26, 255, 144);
                    break;
                case 6:
                    color = new Color(156, 76, 0);
                    break;
                case 7:
                    color = new Color(255, 112, 0);
                    break;
                case 8:
                    color = new Color(0, 201, 255);
                    break;
                case 9:
                    color = new Color(180,8,255);
                    break;            
            }

            for (int i = 0; i < coloresJugadores.length; i++) {
                if (color.equals(coloresJugadores[i]) & avanzar) {
                    avanzar = false;
                    JOptionPane.showMessageDialog(this, "El color ya ha sido seleccionado, escoja otro", "Atencion",1);
                    SeleccionJugadores playersDif = new SeleccionJugadores(coloresJugadores,jugadores,limiteJugadores,contadorJugadores,metodoInicio,numeroAleatorio);
                    playersDif.setVisible(true);
                    playersDif.txfNombre.setText(nombreJugador);
                    this.dispose();
                }          
            }

            coloresJugadores[contadorJugadores-1] = color;
            if (avanzar) {
                if (limiteJugadores >= contadorJugadores) {
                    jugadores[contadorJugadores-1] = new Jugador(color, nombreJugador, contadorJugadores-1, creaButonesJugadores());
                    contadorJugadores+=1;
                    if(limiteJugadores >= contadorJugadores){
                        SeleccionJugadores players = new SeleccionJugadores(coloresJugadores,jugadores,limiteJugadores,contadorJugadores,metodoInicio,numeroAleatorio);
                        players.setVisible(true);  
                    }else{
                        int arrayNums[] = new int[jugadores.length];
                        if (metodoInicio == 1) {
                            DadosEscogerOrden dadosFinales = new DadosEscogerOrden(jugadores,0,arrayNums);
                            dadosFinales.setVisible(true);
                        } else if (metodoInicio == 2){
                            EscogerOrdenPorNumero numOrden = new EscogerOrdenPorNumero(jugadores,arrayNums,0,numeroAleatorio);
                            numOrden.setVisible(true); 
                        }
                    }
                } else {
    //                    int dados[] = new int[jugadores.length];
    //                    DadosEscogerOrden dadosFinales = new DadosEscogerOrden(jugadores,0,dados);
    //                    dadosFinales.setVisible(true);     
                } 
            }
            this.dispose();
        }
    }//GEN-LAST:event_btnAceptarActionPerformed

    
    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        // TODO add your handling code here:
        this.txfNombre.setText("");
        this.cbxColor.setSelectedIndex(0);

    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void txfNombreKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfNombreKeyReleased
        String caracteres = this.txfNombre.getText();
        if (caracteres.length()>24){
            JOptionPane.showMessageDialog(this, "Máximo de caracteres alcanzado", "Advertencia", 2);
            this.txfNombre.setText(caracteres.substring(0, 24));
        }
    }//GEN-LAST:event_txfNombreKeyReleased

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
//            java.util.logging.Logger.getLogger(seleccionJugadores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(seleccionJugadores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(seleccionJugadores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(seleccionJugadores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new seleccionJugadores().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JComboBox<String> cbxColor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblColores;
    private javax.swing.JLabel lblNombreJugadores;
    private javax.swing.JTextField txfNombre;
    // End of variables declaration//GEN-END:variables
}
