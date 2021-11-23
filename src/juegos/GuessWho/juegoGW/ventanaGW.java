package juegos.GuessWho.juegoGW;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import juegos.Jugador;
import juegos.Tablero;
import juegos.iJuego;
import juegos.vtnFinal.VentanaFinal;

public class ventanaGW extends javax.swing.JFrame implements iJuego{
    private JuegoGW juego;
    private Jugador jugadorActual;
    private Tablero tablero;
    
    private JLabel imagen;
    private JLabel matrizIconos[][];
    private int randomCasillas;
    private int clicks = 0;
    
    private String nombrePersonaje;
    
    private int arrayNumeroAleatorio[] = {4,5,6,7,8};
    private int matrizLogica[][];
            
    
    public ventanaGW(Jugador jugadorActual, Tablero tablero) {
        initComponents();
        this.juego = new JuegoGW();  
        this.imagen = new JLabel();
        this.jugadorActual = jugadorActual;
        this.tablero = tablero;
        imagenPersonaje();
        casillasOcultar();
        nombres();
        this.randomCasillas = new Random().nextInt(5)+4;
        //System.out.println(randomCasillas);
        quitaCuadros();
        this.setTitle(jugadorActual.getNombreCompleto());
        this.tablero.setTxaInfoMomento(this.tablero.getTxaInfoMomento()+"\n"+jugadorActual.getNombreCompleto()+" está jugado Guess Who?\n");
        
    }
    
    @Override
    public void ejecutar(Jugador jugadorActual){
        this.setVisible(true);
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlPersonaje = new javax.swing.JPanel();
        btnOpcion1 = new javax.swing.JButton();
        btnOpcion2 = new javax.swing.JButton();
        btnOpcion3 = new javax.swing.JButton();
        btnOpcion4 = new javax.swing.JButton();
        btnOpcion5 = new javax.swing.JButton();
        btnOpcion6 = new javax.swing.JButton();
        btnOpcion7 = new javax.swing.JButton();
        btnOpcion8 = new javax.swing.JButton();
        btnOpcion9 = new javax.swing.JButton();
        btnOpcion10 = new javax.swing.JButton();
        btnOpcion11 = new javax.swing.JButton();
        btnOpcion12 = new javax.swing.JButton();
        btnOpcion14 = new javax.swing.JButton();
        btnOpcion15 = new javax.swing.JButton();
        btnOpcion13 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        javax.swing.GroupLayout pnlPersonajeLayout = new javax.swing.GroupLayout(pnlPersonaje);
        pnlPersonaje.setLayout(pnlPersonajeLayout);
        pnlPersonajeLayout.setHorizontalGroup(
            pnlPersonajeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 916, Short.MAX_VALUE)
        );
        pnlPersonajeLayout.setVerticalGroup(
            pnlPersonajeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        btnOpcion1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnOpcion1.setText("KOOPA");

        btnOpcion2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnOpcion2.setText("MARIO");

        btnOpcion3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnOpcion3.setText("LUIGI");

        btnOpcion4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnOpcion4.setText("FLY RED TURTLE");

        btnOpcion5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnOpcion5.setText("FLY GREEN TURTLE");

        btnOpcion6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnOpcion6.setText("GOOMBA");

        btnOpcion7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnOpcion7.setText("BOWSER");

        btnOpcion8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnOpcion8.setText("BOO");

        btnOpcion9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnOpcion9.setText("KING BOO");

        btnOpcion10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnOpcion10.setText("BOWSER JR");

        btnOpcion11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnOpcion11.setText("TOAD");

        btnOpcion12.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnOpcion12.setText("TOADETTE");

        btnOpcion14.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnOpcion14.setText("YOSHI");

        btnOpcion15.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnOpcion15.setText("DAISY");

        btnOpcion13.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnOpcion13.setText("PEACH");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlPersonaje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnOpcion1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnOpcion14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnOpcion15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnOpcion2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnOpcion3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnOpcion4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnOpcion5, javax.swing.GroupLayout.DEFAULT_SIZE, 383, Short.MAX_VALUE)
                    .addComponent(btnOpcion6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnOpcion7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnOpcion8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnOpcion9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnOpcion10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnOpcion11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnOpcion12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnOpcion13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnOpcion1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnOpcion2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnOpcion3, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnOpcion4, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnOpcion5, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnOpcion6, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnOpcion7, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnOpcion8, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnOpcion9, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnOpcion10, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnOpcion11, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnOpcion15, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnOpcion12, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnOpcion13, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnOpcion14, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlPersonaje, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private int escogeCeldas(){
        Random numeros = new Random();
        int numCasillas = arrayNumeroAleatorio[numeros.nextInt(arrayNumeroAleatorio.length)];
        return numCasillas;
    }
    
    private void casillasOcultar(){
        matrizIconos = new JLabel[10][10];
        Random poneCubos = new Random();
        int contador = 0;
        int cantidadCasillasMostradas = escogeCeldas();
        
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                    matrizIconos[i][j] = new JLabel();
                    matrizIconos[i][j].setBounds(45+(i*85), 20+(j*68), 60,60);
                    matrizIconos[i][j].setIcon(new ImageIcon("C:\\Users\\Hewlett Packard\\Documents\\NetBeansProjects\\MarioParty\\src\\juegos\\GuessWho\\casillas\\icono.png"));
                    matrizIconos[i][j].setVisible(true);
                    pnlPersonaje.add(matrizIconos[i][j],0);            
            }   
        }
    }
    
    private void nombres(){
        JButton listaBotones[] = {btnOpcion1, btnOpcion10,btnOpcion11,btnOpcion12,btnOpcion13,btnOpcion14,btnOpcion15,btnOpcion2,
            btnOpcion3,btnOpcion4,btnOpcion5,btnOpcion6,btnOpcion7,btnOpcion8,btnOpcion9};
        
        
        for (int i = 0; i < listaBotones.length; i++) {
            listaBotones[i].addMouseListener(new MouseAdapter(){
                @Override
                public void mousePressed(MouseEvent evt){
                    for (int j = 0; j < listaBotones.length; j++) {
                        String nombreP;
                        nombreP = listaBotones[j].getText();
                        if (evt.getSource() == listaBotones[j]) {
                            if (listaBotones[j].getText().equals(juego.getPersonaje())) {
                                haGanado();                               
                            } else {
                                haPerdido();
                            }
                        }
                    }       
            }});
            
        }
    }
    
    private void quitaCuadros(){
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                matrizIconos[i][j].addMouseListener(new MouseAdapter(){
                    @Override
                    public void mousePressed(MouseEvent evt){
                        for (int k = 0; k < 10; k++) {
                            for (int l = 0; l < 10; l++) {
                                if (evt.getSource() == matrizIconos[k][l]) {
                                    System.out.println(clicks);
                                    if (randomCasillas > clicks) {
                                        clicks++;
                                        matrizIconos[k][l].setIcon(new ImageIcon("\\imagenes\\"));
                                    } else {
                                        escojaImagen();
                                    }
                                }
                            }    
                        }
                    }
                });
            }
        }
    }
    
    
    private void haPerdido(){
        JOptionPane.showMessageDialog(this, "LO SENTIMOS "+jugadorActual.getNombreCompleto().toUpperCase()+", HAS PERDIDO :( ");
        jugadorActual.setPuedoAvanzar(false);
        this.dispose();
    }
    
    private void escojaImagen(){
        JOptionPane.showMessageDialog(this, "ESCOJA UNA IMAGEN");  
    }
    
    
    private void haGanado(){
        JOptionPane.showMessageDialog(this, "FELICITACIONES "+jugadorActual.getNombreCompleto().toUpperCase()+", HAS GANADO :) ");
        jugadorActual.setPuedoAvanzar(true);
        
        if (jugadorActual.getCasillaActual() == 26 & jugadorActual.isPuedoAvanzar()){
            new VentanaFinal(jugadorActual.getNombreCompleto()).setVisible(true);
        }
        
        this.dispose();
    }
    
    
    private void imagenPersonaje(){
        imagen.setSize(this.getWidth(),this.getHeight());
        imagen.setLocation(0, 0);
        imagen.setIcon(new ImageIcon("C:\\Users\\Hewlett Packard\\Documents\\NetBeansProjects\\MarioParty\\src\\juegos\\GuessWho\\imagenesGw\\"+juego.getPersonaje()+".jpg"));
        imagen.setVisible(true);
        pnlPersonaje.add(imagen);
    }
    
    
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
//            java.util.logging.Logger.getLogger(ventanaGW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(ventanaGW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(ventanaGW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(ventanaGW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new ventanaGW().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnOpcion1;
    private javax.swing.JButton btnOpcion10;
    private javax.swing.JButton btnOpcion11;
    private javax.swing.JButton btnOpcion12;
    private javax.swing.JButton btnOpcion13;
    private javax.swing.JButton btnOpcion14;
    private javax.swing.JButton btnOpcion15;
    private javax.swing.JButton btnOpcion2;
    private javax.swing.JButton btnOpcion3;
    private javax.swing.JButton btnOpcion4;
    private javax.swing.JButton btnOpcion5;
    private javax.swing.JButton btnOpcion6;
    private javax.swing.JButton btnOpcion7;
    private javax.swing.JButton btnOpcion8;
    private javax.swing.JButton btnOpcion9;
    private javax.swing.JPanel pnlPersonaje;
    // End of variables declaration//GEN-END:variables
}
