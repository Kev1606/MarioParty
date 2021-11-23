package juegos;

import javax.swing.JOptionPane;

/**
 *
 * @author Joctan Esquivel
 */
public class EscogerOrdenPorNumero extends javax.swing.JFrame {
    Jugador[] jugadores;
    private int [] numerosFinalesJugador;
    private int contadorJugador;
    private int numeroAleatorio;

    public EscogerOrdenPorNumero(Jugador[] jugadores, int [] numerosFinales, int contador, int numeroAleatorio) {
        initComponents();
        this.jugadores = jugadores;
        this.numerosFinalesJugador = numerosFinales;
        this.numeroAleatorio = numeroAleatorio;
        this.contadorJugador = contador;
        this.lblSuerte.setText("¡SUERTE "+jugadores[contadorJugador].getNombreCompleto().toUpperCase()+"!");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblEncabezado = new javax.swing.JLabel();
        lblSubtitulo = new javax.swing.JLabel();
        lblSuerte = new javax.swing.JLabel();
        lblCuerpo = new javax.swing.JLabel();
        txfNumero = new javax.swing.JTextField();
        btnConfirmar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 51));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblEncabezado.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblEncabezado.setForeground(new java.awt.Color(0, 0, 0));
        lblEncabezado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblEncabezado.setText("Debe escoger un numero entre 0 y 1000");

        lblSubtitulo.setForeground(new java.awt.Color(0, 0, 0));
        lblSubtitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSubtitulo.setText("El usuario con el numero más cercano será el primero en jugar");

        lblSuerte.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblSuerte.setForeground(new java.awt.Color(0, 0, 0));
        lblSuerte.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSuerte.setText("¡SUERTE ");

        lblCuerpo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblCuerpo.setForeground(new java.awt.Color(0, 0, 0));
        lblCuerpo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCuerpo.setText("Escriba su número abajo");

        txfNumero.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txfNumero.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txfNumero.setToolTipText("Valor entre");

        btnConfirmar.setBackground(new java.awt.Color(0, 0, 0));
        btnConfirmar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnConfirmar.setForeground(new java.awt.Color(255, 255, 255));
        btnConfirmar.setText("Confirmar");
        btnConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmarActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/juegos/MemoryPath/imagenFondo/index.png"))); // NOI18N

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/juegos/MemoryPath/imagenFondo/index.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblSubtitulo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 366, Short.MAX_VALUE)
                            .addComponent(lblEncabezado, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(130, 130, 130)
                                .addComponent(txfNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblSuerte, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(104, 104, 104))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(lblCuerpo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(67, 67, 67))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblEncabezado, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblSubtitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblSuerte, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(lblCuerpo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txfNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmarActionPerformed
        try {
            Integer numero = Integer.parseInt(this.txfNumero.getText());
            if(!(numero < 1000 && numero >0)){
                JOptionPane.showMessageDialog(this, "El número debe ser mayor a 0 y menor que 1000", "Error", 3);
            }else{
                
                if (jugadores.length >= contadorJugador) {
                numerosFinalesJugador[contadorJugador] = Math.abs(numeroAleatorio-Integer.parseInt(txfNumero.getText()));
                contadorJugador+=1;
                    if (jugadores.length == contadorJugador){
                        //ordenar
                        ordenaJugadores(jugadores,numerosFinalesJugador);                       
                    } else {
                        EscogerOrdenPorNumero dados = new EscogerOrdenPorNumero(jugadores,numerosFinalesJugador,contadorJugador,numeroAleatorio);
                        dados.setVisible(true);
                        this.dispose();
                    }
                }             
            }    
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Solo puede ingresar numeros", "Error", 3);
        }
    }//GEN-LAST:event_btnConfirmarActionPerformed

    private int indiceDiferencia(int array[]){
        int menor = 1000;
        int indice = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < menor){
                menor = array[i];
                indice = i;
            }
        }
        return indice;
    }
    
    private void ordenaJugadores(Jugador jugadores[], int arrayDados[]){
        Jugador[] arrayJugadores = new Jugador[jugadores.length];
        for (int i = 0; i < arrayDados.length; i++) {
            arrayJugadores[i] = jugadores[indiceDiferencia(arrayDados)];
            arrayDados[indiceDiferencia(arrayDados)] = 20000;        
        }
        Tablero juegoTablero = new Tablero(arrayJugadores); 
        juegoTablero.setVisible(true);    
        this.dispose();      
    }
    
    
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
//            java.util.logging.Logger.getLogger(EscogerOrdenPorNumero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(EscogerOrdenPorNumero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(EscogerOrdenPorNumero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(EscogerOrdenPorNumero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new EscogerOrdenPorNumero().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConfirmar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblCuerpo;
    private javax.swing.JLabel lblEncabezado;
    private javax.swing.JLabel lblSubtitulo;
    private javax.swing.JLabel lblSuerte;
    private javax.swing.JTextField txfNumero;
    // End of variables declaration//GEN-END:variables
}
