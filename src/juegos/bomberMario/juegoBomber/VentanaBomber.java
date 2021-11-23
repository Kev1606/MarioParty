package juegos.bomberMario.juegoBomber;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import juegos.Jugador;
import juegos.Tablero;
import juegos.iJuego;
import juegos.vtnFinal.VentanaFinal;

public class VentanaBomber extends javax.swing.JFrame implements iJuego{
    private Juego juego;
    private JLabel tesoro;
    private JLabel casillas[][];
    private Jugador jugadorActual;
    private Tablero tablero;
    private int matrizLogica[][];
    
    
    private Random random = new Random();
    private int tesoroEncontrado = 0;
    private int totalBombas = 7;
    private int dimension;

    public VentanaBomber(Jugador jugadorActual, Tablero tablero) {
        initComponents();
        this.juego = new Juego();
        this.jugadorActual = jugadorActual;
        this.tablero = tablero;
        setDimension();
        llenaMatrizLogica();
        creaCasillas();
        lblBombas.setText(this.totalBombas+"");
        logicaJuego();
        
        this.setTitle(jugadorActual.getNombreCompleto());
        this.tablero.setTxaInfoMomento(this.tablero.getTxaInfoMomento()+"\n"+jugadorActual.getNombreCompleto()+" está jugado BomberMario\n");
        
    }
    
    @Override
    public void ejecutar(Jugador jugadorActual){
        this.setVisible(true);
    }

    
    private void llenaMatrizLogica(){
        
        matrizLogica = new int[dimension][dimension];
        for (int i = 0; i < dimension; i++) {
            for (int j = 0; j < dimension; j++) {
                matrizLogica[i][j] = 0;
            }
        }
    }

    
    
    private void creaCasillas(){
        int contadorImagen = 0;
        tesoro = new JLabel();
        
        if (juego.getDimension() == 1){
            casillas = new JLabel[dimension][dimension];
            for (int i = 0; i < dimension; i++) {
                for (int j = 0; j < dimension; j++) {
                    if (random.nextInt(dimension) == 9 & contadorImagen != 1) {
                        tesoro.setBounds(295+(i*60), 155+(j*60), 60+60,60+60);
                        tesoro.setIcon(new ImageIcon("C:\\Users\\Hewlett Packard\\Documents\\NetBeansProjects\\MarioParty\\src\\juegos\\bomberMario\\imagen\\estrellita10x10.png"));
                        contadorImagen = 1;
                        try {
                            matrizLogica[i][j] = 1;
                            matrizLogica[i][j+1] = 1;
                            matrizLogica[i+1][j] = 1;
                            matrizLogica[i+1][j+1] = 1;
                        } catch (Exception e) {
                        }

                        //System.out.println("Entreeee al 1");
                    }
      
                    casillas[i][j] = new JLabel();
                    casillas[i][j].setBounds(295+(i*60), 155+(j*60), 60,60);
                    casillas[i][j].setIcon(new ImageIcon("C:\\Users\\Hewlett Packard\\Documents\\NetBeansProjects\\MarioParty\\src\\juegos\\bomberMario\\imagen\\icono10x10.png"));
                    casillas[i][j].setVisible(true);
                    pnlJuego.add(casillas[i][j],0); 
                    //DEBO PONER EL TESORO OCULTO CON LA SUMA DE ALTURA Y ANCHURA DE DOS CASILLAS EN LA DIMENSION 1
                    // SE PONDRIA EL OBJETO AL FONDO CON DIMENSION 120X120
                }
            }
        }
        
        if (juego.getDimension() == 2){
            casillas = new JLabel[dimension][dimension];
            for (int i = 0; i < dimension; i++) {
                for (int j = 0; j < dimension; j++) {
                    if (random.nextInt(dimension) == 9 & contadorImagen != 1) {
                        tesoro.setBounds(195+(i*55), 25+(j*55), 55+55,55+55);
                        tesoro.setIcon(new ImageIcon("C:\\Users\\Hewlett Packard\\Documents\\NetBeansProjects\\MarioParty\\src\\juegos\\bomberMario\\imagen\\estrellita15x15.png"));
                        contadorImagen = 1;
                        try {
                            matrizLogica[i][j] = 1;
                            matrizLogica[i][j+1] = 1;
                            matrizLogica[i+1][j] = 1;
                            matrizLogica[i+1][j+1] = 1;
                        } catch (Exception e) {
                        }

                        //System.out.println("Entreeee al 2");
                    }
                    
                    casillas[i][j] = new JLabel();
                    casillas[i][j].setBounds(195+(i*55), 25+(j*55), 55,55);
                    casillas[i][j].setIcon(new ImageIcon("C:\\Users\\Hewlett Packard\\Documents\\NetBeansProjects\\MarioParty\\src\\juegos\\bomberMario\\imagen\\icono15x15.png"));
                    casillas[i][j].setVisible(true);
                    pnlJuego.add(casillas[i][j],0);                    
                }
            }
        }
        
        if (juego.getDimension() == 3){
            casillas = new JLabel[dimension][dimension];
            for (int i = 0; i < dimension; i++) {
                for (int j = 0; j < dimension; j++) {
                    if (random.nextInt(dimension) == 9 & contadorImagen != 1) {
                        tesoro.setBounds(195+(i*40), 35+(j*40), 40+40,40+40);
                        tesoro.setIcon(new ImageIcon("C:\\Users\\Hewlett Packard\\Documents\\NetBeansProjects\\MarioParty\\src\\juegos\\bomberMario\\imagen\\estrellita20x20.png"));                        
                        contadorImagen = 1;
                        try {
                            matrizLogica[i][j] = 1;
                            matrizLogica[i][j+1] = 1;
                            matrizLogica[i+1][j] = 1;
                            matrizLogica[i+1][j+1] = 1;
                        } catch (Exception e) {
                        }

                        //System.out.println("Entreeee al 3");
                    }
                    
                    casillas[i][j] = new JLabel();
                    casillas[i][j].setBounds(195+(i*40), 35+(j*40), 40,40);
                    casillas[i][j].setIcon(new ImageIcon("C:\\Users\\Hewlett Packard\\Documents\\NetBeansProjects\\MarioParty\\src\\juegos\\bomberMario\\imagen\\icono.png"));
                    casillas[i][j].setVisible(true);
                    pnlJuego.add(casillas[i][j],0);                    
                }
            }
        }
        tesoro.setVisible(true);
        pnlJuego.add(tesoro);
    }
    
    private void logicaJuego(){
        int bomba;
        for (int i = 0; i < dimension; i++) {
            for (int j = 0; j < dimension; j++) {
                casillas[i][j].addMouseListener(new MouseAdapter(){
                    @Override
                    public void mousePressed(MouseEvent evt){
                        int bomba;
                        bomba = random.nextInt(4)+1;
                        System.out.println(bomba+"   bomba");
                        for (int k = 0; k < dimension; k++) {
                            for (int l = 0; l < dimension; l++) {
                                if (evt.getSource() == casillas[k][l]) {
                                    if (bomba == 1) {
                                        casillas[k][l].setIcon(new ImageIcon(""));
                                        if (matrizLogica[k][l] == 1) {
                                            tesoroEncontrado++;
                                            matrizLogica[k][l] = 0;
                                        }
                                    }
                                    if (bomba == 2) {
                                        casillas[k][l].setIcon(new ImageIcon(""));
                                        if (matrizLogica[k][l] == 1) {
                                            tesoroEncontrado++;
                                            matrizLogica[k][l] = 0;
                                        }                                        
                                        bombaDoble(k, l);
                                    }
                                    if (bomba == 3) {
                                        casillas[k][l].setIcon(new ImageIcon(""));
                                        if (matrizLogica[k][l] == 1) {
                                            tesoroEncontrado++;
                                            matrizLogica[k][l] = 0;
                                        }                                        
                                        bombaCruz(k,l);
                                    }
                                    if (bomba == 4) {
                                        casillas[k][l].setIcon(new ImageIcon(""));
                                        if (matrizLogica[k][l] == 1) {
                                            tesoroEncontrado++;
                                            matrizLogica[k][l] = 0;
                                        }                                        
                                        bombaLinea(k,l);
                                    }
                                    totalBombas--;
                                    lblBombas.setText(totalBombas+"");
                                    //pregunta constamente si el juego ya termino
                                    juegoTerminado();
                                    
                                }
                            }        
                        }
                    }                    
                });
            }
            
        }
    }
    
    private void juegoTerminado(){
        //System.out.println(tesoroEncontrado+" el tesoro lleva");
        
        if (tesoroEncontrado == 4){
            JOptionPane.showMessageDialog(this, "FELICIDADES "+jugadorActual.getNombreCompleto().toUpperCase()+", HAS ENCONTRADO EL TESORO", "ATENCION", 1);
            jugadorActual.setPuedoAvanzar(true);
            if (jugadorActual.getCasillaActual() == 26 & jugadorActual.isPuedoAvanzar()) {
                new VentanaFinal(jugadorActual.getNombreCompleto()).setVisible(true);
            }
            this.dispose();
        }
        
        if (totalBombas == 0) {
            JOptionPane.showMessageDialog(this, "LO SENTIMOS "+jugadorActual.getNombreCompleto().toUpperCase()+", NO HAS ENCONTRADO EL TESORO", "ATENCION", 1);
            jugadorActual.setPuedoAvanzar(false);
            this.dispose();
        }
    }
    
    
    private void bombaLinea(int enX, int enY){
        int numero = random.nextInt(4)+1;
        if (numero == 1) {
            for (int i = 1; i <= 3; i++) {     
                try {
                    casillas[enX+i][enY].setIcon(new ImageIcon(""));
                    if (matrizLogica[enX+i][enY] == 1) {
                        tesoroEncontrado++;
                        matrizLogica[enX+i][enY] = 0;
                    }
                } catch (Exception e){
                    System.out.println("pinte afuera");
                }
            }
        }
        if (numero == 2){
            for (int i = 1; i <= 3; i++) {
                try {
                    casillas[enX-i][enY].setIcon(new ImageIcon(""));
                    if (matrizLogica[enX-i][enY] == 1) {
                        tesoroEncontrado++;
                        matrizLogica[enX-i][enY] = 0;
                    }
                } catch (Exception e){
                    System.out.println("pinte afuera");
                }
            }
        }
        if (numero == 3){
            for (int i = 1; i <= 3; i++) {
                try{
                    casillas[enX][enY+i].setIcon(new ImageIcon(""));
                    if (matrizLogica[enX][enY+i] == 1) {
                        tesoroEncontrado++;
                        matrizLogica[enX][enY+i] = 0;
                    }
                } catch (Exception e){
                    System.out.println("pinte afuera");
                }
            }
            
        }
        if (numero == 4){
            for (int i = 1; i <= 3; i++) {
                try {
                    casillas[enX][enY-i].setIcon(new ImageIcon(""));
                    if (matrizLogica[enX][enY-i] == 1) {
                        tesoroEncontrado++;
                        matrizLogica[enX][enY-i] = 0;
                    }
                } catch (Exception e){
                    System.out.println("pinte afuera");
                }                    
            } 
        }
    }
    
    private void bombaCruz(int enX, int enY){
        try {
            casillas[enX+1][enY].setIcon(new ImageIcon(""));
            if (matrizLogica[enX+1][enY] == 1){
                tesoroEncontrado++;
                matrizLogica[enX+1][enY] = 0;
            }
        } catch (Exception e){
        }
        try {
            casillas[enX-1][enY].setIcon(new ImageIcon(""));
            if (matrizLogica[enX-1][enY] == 1){
                tesoroEncontrado++;
                matrizLogica[enX-1][enY] = 0;
            }
        } catch (Exception e){

        }
        try {
            casillas[enX][enY+1].setIcon(new ImageIcon(""));      
            if (matrizLogica[enX][enY+1] == 1) {
                tesoroEncontrado++;
                matrizLogica[enX][enY+1] = 0;
            }
        } catch (Exception e){
        }
        try {
            casillas[enX][enY-1].setIcon(new ImageIcon(""));
            if (matrizLogica[enX][enY-1]== 1){
                tesoroEncontrado++;
                matrizLogica[enX][enY-1] = 0;
            }
            
        } catch (Exception e){
        }
        
        
        
        
        
//        if (matrizLogica[enX+1][enY] == 1 |
//                matrizLogica[enX-1][enY] == 1 |
//                        matrizLogica[enX][enY+1] == 1 |
//                                matrizLogica[enX][enY-1]== 1) {
//            tesoroEncontrado++;
//            matrizLogica[enX+1][enY] = 0;
//            matrizLogica[enX-1][enY] = 0;
//            matrizLogica[enX][enY+1] = 0;
//            matrizLogica[enX][enY-1] = 0;
//        }
    }
    
    private void bombaDoble(int enX, int enY){
        int numero = random.nextInt(4)+1;
        if (numero == 1) {
            try {
                casillas[enX+1][enY].setIcon(new ImageIcon(""));
                if (matrizLogica[enX+1][enY] == 1) {
                        tesoroEncontrado++;
                        matrizLogica[enX+1][enY] = 0;
                }
            } catch (Exception e){
                    System.out.println("pinte afuera");
            }     
                
        }           
        if (numero == 2){
            try {
                casillas[enX-1][enY].setIcon(new ImageIcon(""));
                if (matrizLogica[enX-1][enY] == 1) {
                        tesoroEncontrado++;
                        matrizLogica[enX-1][enY] = 0;
                }
            } catch (Exception e){
                    System.out.println("pinte afuera");
            }     
        }
        if (numero == 3){
            try {
                casillas[enX][enY+1].setIcon(new ImageIcon(""));
                if (matrizLogica[enX][enY+1] == 1) {
                        tesoroEncontrado++;
                        matrizLogica[enX][enY+1] = 0;
                }    
            } catch (Exception e){
                System.out.println("pinte afuera");
            }                     
        }
        if (numero == 4){
            try {
                casillas[enX][enY-1].setIcon(new ImageIcon(""));
                if (matrizLogica[enX][enY-1] == 1) {
                        tesoroEncontrado++;
                        matrizLogica[enX][enY-1] = 0;
                }  
            } catch (Exception e){
                System.out.println("pinte afuera");
            }                              
        }
    }
    
    
    private void setDimension(){
        int dimensiones = juego.getDimension();
        if (dimensiones == 1){
            dimension = 10;
        }
        if (dimensiones == 2){
            dimension = 15;
        }
        if (dimensiones == 3){
            dimension = 20;
        }
    }
    
//    private void numeroBombas(){
//        for (int i = 0; i < bombas.length; i++) {
//            this.totalBombas += bombas[i];
//        }
//    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlJuego = new javax.swing.JPanel();
        pnlInfo = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblBombas = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnlJuego.setBackground(new java.awt.Color(153, 153, 153));
        pnlJuego.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout pnlJuegoLayout = new javax.swing.GroupLayout(pnlJuego);
        pnlJuego.setLayout(pnlJuegoLayout);
        pnlJuegoLayout.setHorizontalGroup(
            pnlJuegoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1225, Short.MAX_VALUE)
        );
        pnlJuegoLayout.setVerticalGroup(
            pnlJuegoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 864, Short.MAX_VALUE)
        );

        pnlInfo.setBackground(new java.awt.Color(51, 51, 51));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("BOMBAS");

        lblBombas.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        lblBombas.setForeground(new java.awt.Color(255, 255, 255));
        lblBombas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBombas.setText("0");

        javax.swing.GroupLayout pnlInfoLayout = new javax.swing.GroupLayout(pnlInfo);
        pnlInfo.setLayout(pnlInfoLayout);
        pnlInfoLayout.setHorizontalGroup(
            pnlInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlInfoLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(pnlInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)
                    .addComponent(lblBombas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(24, 24, 24))
        );
        pnlInfoLayout.setVerticalGroup(
            pnlInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlInfoLayout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(67, 67, 67)
                .addComponent(lblBombas, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlJuego, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlJuego, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
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
//            java.util.logging.Logger.getLogger(VentanaJuego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(VentanaJuego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(VentanaJuego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(VentanaJuego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new VentanaJuego().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblBombas;
    private javax.swing.JPanel pnlInfo;
    private javax.swing.JPanel pnlJuego;
    // End of variables declaration//GEN-END:variables
}
