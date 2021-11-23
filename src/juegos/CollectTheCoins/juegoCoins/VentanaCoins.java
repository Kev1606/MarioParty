package juegos.CollectTheCoins.juegoCoins;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import juegos.Jugador;
import juegos.Tablero;
import juegos.iJuego;

public class VentanaCoins extends javax.swing.JFrame implements iJuego {
    private JuegoCoins juego;
    private JLabel matrizIconos[][];
    private Jugador jugadorActual;
    private Tablero tablero;

    private int matrizValoresMonedas[][];
    
    private int contadorPuntos;
    private int contadorMonedas;
    private int clicksMonedas;

    public VentanaCoins(Jugador jugadorActual, Tablero tablero) {
        initComponents();
        this.jugadorActual = jugadorActual;
        this.tablero = tablero;
        juego = new JuegoCoins();
        matrizIconos = new JLabel[JuegoCoins.DIMENSION_X_Y][JuegoCoins.DIMENSION_X_Y];
        matrizValoresMonedas = new int[JuegoCoins.DIMENSION_X_Y][JuegoCoins.DIMENSION_X_Y];
        
        matrizValoresMonedas = juego.getMatrizValoresMonedas();
        creaCasillas();
        relojDelInicio();
        logicaJuego();
        this.setTitle(jugadorActual.getNombreCompleto());
        this.tablero.setTxaInfoMomento(this.tablero.getTxaInfoMomento()+"\n"+jugadorActual.getNombreCompleto()+" está jugado Collect The Coins\n");
        
    }    
    
    @Override
    public void ejecutar(Jugador jugadorActual){
        this.setVisible(true);
    }
    

    private void tiempoEstimado(){
        //TEMPORIZADOR
        ThreadClockCoins reloj = new ThreadClockCoins(this.lblTiempo,this,jugadorActual) ;
        reloj.start();
    }
    
    private void relojDelInicio(){
        int indicadorReloj = (int) (Math.random()*3+1);
        switch (indicadorReloj){
            //Caso 1 va a ser 30s
            case 1:
                this.lblTiempo.setText("00:30");
                break;
            case 2:
                //Caso 2 va a ser 45s
                this.lblTiempo.setText("00:45");
                break;
            case 3:
                //Caso 3 va a ser 60s
                this.lblTiempo.setText("01:00");
                break;
        }
        
    }

    private void creaCasillas(){
        for (int i = 0; i < JuegoCoins.DIMENSION_X_Y; i++) {
            for (int j = 0; j < JuegoCoins.DIMENSION_X_Y; j++) {
                matrizIconos[i][j] = new JLabel();
                matrizIconos[i][j].setBounds(10+(i*26), 15+(j*35), 22,24);
                matrizIconos[i][j].setIcon(new ImageIcon("C:\\Users\\Hewlett Packard\\Documents\\NetBeansProjects\\MarioParty\\src\\juegos\\CollectTheCoins\\imagenesCoins\\index.png"));
                matrizIconos[i][j].setVisible(true);
                pnlMonedas.add(matrizIconos[i][j],0);
            }  
        }
    }
    
    private void logicaJuego(){
        clicksMonedas = 0;
        for (int i = 0; i < JuegoCoins.DIMENSION_X_Y; i++) {
            for (int j = 0; j < JuegoCoins.DIMENSION_X_Y; j++) {
                matrizIconos[i][j].addMouseListener(new MouseAdapter(){
                    @Override
                    public void mousePressed(MouseEvent evt){
                        if (clicksMonedas == 0) {
                            tiempoEstimado();
                        }    
                        for (int k = 0; k < JuegoCoins.DIMENSION_X_Y; k++) {
                            for (int l = 0; l < JuegoCoins.DIMENSION_X_Y; l++) {
                                if (evt.getSource() == matrizIconos[k][l]) {
                                    contadorPuntos += matrizValoresMonedas[k][l];
                                    lblContadorPuntos.setText(contadorPuntos+"");
                                    matrizIconos[k][l].setIcon(new ImageIcon("imagenes\\"));
                                    matrizValoresMonedas[k][l] = 0;
                                    clicksMonedas++;
                                    lblContadorMonedas1.setText(clicksMonedas+"");    
                                    
                                }

                            }
                        }
                }});
            }
        }
    }
    
    public int getPuntos(){
        return this.contadorPuntos;
    }
    
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlMonedas = new javax.swing.JPanel();
        lblMonedaEscrito = new javax.swing.JLabel();
        monedita = new javax.swing.JLabel();
        lblContadorPuntos = new javax.swing.JLabel();
        lblPuntosEscrito = new javax.swing.JLabel();
        lblContadorMonedas1 = new javax.swing.JLabel();
        lblTiempoEscrito = new javax.swing.JLabel();
        lblTiempo = new javax.swing.JLabel();
        lazito = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        pnlMonedas.setBackground(new java.awt.Color(255, 255, 255));
        pnlMonedas.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout pnlMonedasLayout = new javax.swing.GroupLayout(pnlMonedas);
        pnlMonedas.setLayout(pnlMonedasLayout);
        pnlMonedasLayout.setHorizontalGroup(
            pnlMonedasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 682, Short.MAX_VALUE)
        );
        pnlMonedasLayout.setVerticalGroup(
            pnlMonedasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 854, Short.MAX_VALUE)
        );

        lblMonedaEscrito.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblMonedaEscrito.setText("Monedas:");

        monedita.setIcon(new javax.swing.ImageIcon(getClass().getResource("/juegos/CollectTheCoins/imagenesCoins/monedaImagen.png"))); // NOI18N

        lblContadorPuntos.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lblContadorPuntos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblContadorPuntos.setText("0");

        lblPuntosEscrito.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblPuntosEscrito.setText("Puntos:");

        lblContadorMonedas1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lblContadorMonedas1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblContadorMonedas1.setText("0");

        lblTiempoEscrito.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblTiempoEscrito.setText("Tiempo:");

        lblTiempo.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lblTiempo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTiempo.setText("00:00");

        lazito.setIcon(new javax.swing.ImageIcon(getClass().getResource("/juegos/CollectTheCoins/imagenesCoins/pngtree-vector-award-icon-png-image_313191.png"))); // NOI18N

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/juegos/CollectTheCoins/imagenesCoins/mario-luigi2222.gif"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlMonedas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addComponent(monedita, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblContadorMonedas1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblMonedaEscrito, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblPuntosEscrito, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblTiempoEscrito, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(lazito, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(lblContadorPuntos, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(lblTiempo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addContainerGap())))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlMonedas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(lblMonedaEscrito, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(lblContadorMonedas1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(monedita, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(93, 93, 93)
                .addComponent(lblPuntosEscrito, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(lazito, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(lblContadorPuntos, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(93, 93, 93)
                .addComponent(lblTiempoEscrito, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblTiempo, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
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
//            java.util.logging.Logger.getLogger(VentanaCoins.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(VentanaCoins.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(VentanaCoins.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(VentanaCoins.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new VentanaCoins().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lazito;
    private javax.swing.JLabel lblContadorMonedas1;
    private javax.swing.JLabel lblContadorPuntos;
    private javax.swing.JLabel lblMonedaEscrito;
    private javax.swing.JLabel lblPuntosEscrito;
    private javax.swing.JLabel lblTiempo;
    private javax.swing.JLabel lblTiempoEscrito;
    private javax.swing.JLabel monedita;
    private javax.swing.JPanel pnlMonedas;
    // End of variables declaration//GEN-END:variables
}
