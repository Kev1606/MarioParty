package juegos.SopaLetras.juegoSopa;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Random;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import juegos.Jugador;
import juegos.Tablero;
import juegos.iJuego;
import juegos.vtnFinal.VentanaFinal;


public class VentanaSopaLetras extends javax.swing.JFrame implements iJuego{
    private static int CONVERTION_BASE_CHAR_VALUE = 64;
    
    private JuegoSopa juego;
    private ThreadClockSopa reloj;
    private Jugador jugadorActual;
    private Tablero tablero;
    
    private JButton[][] letras;
    private String[] arrayPalabras;
    private int [][] clicks;
    private String palabrasEncontradas = "";
    private int inicioJuego = 0;
    
    
    private int dimensionSopa;
    private int numDimension;

    
    public VentanaSopaLetras(Jugador jugadorActual, Tablero tablero) {
        initComponents();
        this.juego = new JuegoSopa();
        this.jugadorActual = jugadorActual;
        this.tablero = tablero;
        this.dimensionSopa = juego.getDimensiones();
        reloj = new ThreadClockSopa(this.lblTiempo,this,jugadorActual) ;
        letras = new JButton[dimensionSopa][dimensionSopa];
        clicks = new int[dimensionSopa][dimensionSopa];
        arrayPalabras = juego.getPalabras();
        setPalabras();
        creaSopa();
        llenaEspacios();  
        colocaPalabras();
        juegoContinuo();
        tiempoEstimado();
        
        this.setTitle(jugadorActual.getNombreCompleto());
        this.tablero.setTxaInfoMomento(this.tablero.getTxaInfoMomento()+"\n"+jugadorActual.getNombreCompleto()+" está jugado Sopa de Letras\n");
    }
    
    @Override
    public void ejecutar(Jugador jugadorActual){
        this.setVisible(true);
    }
    
    private void setPalabras(){
        JLabel[] palabrasLabel = {lblPalabra1,lblPalabra2,lblPalabra3,lblPalabra4};
        for (int i = 0; i < palabrasLabel.length; i++) {
           palabrasLabel[i].setText(arrayPalabras[i].toUpperCase());
        }
    }
    
    private void creaSopa(){
        numDimension = juego.getNumDimension();
        if (numDimension == 1){
            for (int i = 0; i < 10; i++) {
                for (int j = 0; j < 10; j++) {
                    letras[i][j] = new JButton();
                    letras[i][j].setName("");
                    letras[i][j].setBackground(Color.WHITE);
                    letras[i][j].setBounds(85+(i*60), 85+(j*60), 60,60);
                    letras[i][j].setFont(new java.awt.Font("Tahoma",1,14));
                    letras[i][j].setVisible(true);
                    pnlSopa.add(letras[i][j],0); 
                }
            }
        }
        if (numDimension == 2) {
            for (int i = 0; i < 15; i++) {
                for (int j = 0; j < 15; j++) {
                    letras[i][j] = new JButton();
                    letras[i][j].setName("");
                    letras[i][j].setBackground(Color.WHITE);
                    letras[i][j].setBounds(100+(i*50), 15+(j*50), 50,50);
                    letras[i][j].setFont(new java.awt.Font("Tahoma",1,14));
                    letras[i][j].setVisible(true);
                    pnlSopa.add(letras[i][j],0); 
                }
            }
        }
        if (numDimension == 3) {
            for (int i = 0; i < 20; i++) {
                for (int j = 0; j < 20; j++) {
                    letras[i][j] = new JButton();
                    letras[i][j].setName("");
                    letras[i][j].setBackground(Color.WHITE);
                    letras[i][j].setBounds(65+(i*40), 5+(j*40), 40,40);
                    letras[i][j].setFont(new java.awt.Font("Tahoma",1,9));
                    letras[i][j].setVisible(true);
                    pnlSopa.add(letras[i][j],0); 
                }
            }            
        }
    }
    
    private void colocaPalabras(){
        Random random = new Random();
        int numeroAzar = random.nextInt(3)+1;

        //TRES TIPOS DE SETEO DE PALABRAS
        if (numeroAzar == 1){           
            //DIAGONAL
            int contador2 = 0;
            for (int j = 0; j < arrayPalabras[0].length(); j++) {
                letras[j][j].setText(arrayPalabras[0].substring(j,j+1).toUpperCase());
                letras[j][j].setName("1");
            }
            
            //DIAGONAL
            contador2 = 0;
            int enX = 5;
            for (int j = 5; contador2 < arrayPalabras[1].length(); j--) {
                letras[enX][j].setText(arrayPalabras[1].substring(contador2,contador2+1).toUpperCase());
                letras[enX][j].setName("1");
                contador2++;
                enX++;
            }       

            //VERTICAL
            contador2 = 0;
            for (int j = 4; contador2 < arrayPalabras[2].length(); j++) {
                letras[2][j].setText(arrayPalabras[2].substring(contador2,contador2+1).toUpperCase());
                letras[2][j].setName("1");
                contador2++;
            }
            
            //HORIZONTAL
            contador2 = 0;
            for (int j = 5; contador2 < arrayPalabras[3].length(); j++) {
                letras[j][9].setText(arrayPalabras[3].substring(contador2,contador2+1).toUpperCase());
                letras[j][9].setName("1");
                contador2++;
            }  
        }
        if (numeroAzar == 2){
            //DIAGONAL
            int contador2 = 0;
            for (int j = 7; contador2 < arrayPalabras[0].length(); j--) {
                letras[contador2][j].setText(arrayPalabras[0].substring(contador2,contador2+1).toUpperCase());
                letras[contador2][j].setName("1");
                contador2++;
            }
            
            //DIAGONAL
            contador2 = 0;
            for (int j = 9; contador2 < arrayPalabras[1].length(); j--) {
                letras[contador2][j].setText(arrayPalabras[1].substring(contador2,contador2+1).toUpperCase());
                letras[contador2][j].setName("1");
                contador2++;
            }       

            //HORIZONTAL
            contador2 = 0;
            for (int j = 0; contador2 < arrayPalabras[2].length(); j++) {
                letras[0][j].setText(arrayPalabras[2].substring(contador2,contador2+1).toUpperCase());
                letras[0][j].setName("1");
                contador2++;
            }
            
            //VERTICAL
            contador2 = 0;
            for (int j = 3; contador2 < arrayPalabras[3].length(); j++) {
                letras[j][9].setText(arrayPalabras[3].substring(contador2,contador2+1).toUpperCase());
                letras[j][9].setName("1");
                contador2++;
            }  
        }
        if (numeroAzar == 3) {
            //DIAGONAL
            int contador2 = 0;
            for (int j = 7; contador2 < arrayPalabras[0].length(); j--) {
                letras[contador2][j].setText(arrayPalabras[0].substring(contador2,contador2+1).toUpperCase());
                letras[contador2][j].setName("1");
                contador2++;
            }
            
            //DIAGONAL
            contador2 = 0;
            for (int j = 9; contador2 < arrayPalabras[1].length(); j--) {
                letras[contador2][j].setText(arrayPalabras[1].substring(contador2,contador2+1).toUpperCase());
                letras[contador2][j].setName("1");
                contador2++;
            }       

            //HORIZONTAL
            contador2 = 0;
            for (int j = 0; contador2 < arrayPalabras[2].length(); j++) {
                letras[j][2].setText(arrayPalabras[2].substring(contador2,contador2+1).toUpperCase());
                letras[j][2].setName("1");
                contador2++;
            }
            
            //VERTICAL
            contador2 = 0;
            for (int j = 3; contador2 < arrayPalabras[3].length(); j++) {
                letras[9][j].setText(arrayPalabras[3].substring(contador2,contador2+1).toUpperCase());
                letras[9][j].setName("1");
                contador2++;
            }              
        }      
    }
    
    private void tiempoEstimado(){
        //TEMPORIZADOR
        reloj.start();
    }  
    
    
    private void juegoContinuo(){
        for (int i = 0; i < dimensionSopa; i++) {
            for (int j = 0; j < dimensionSopa; j++) {
                letras[i][j].addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent evt){
//                        if (inicioJuego == 0) {
//                            tiempoEstimado();
//                        }
                        for (int k = 0; k < dimensionSopa; k++) {
                            for (int l = 0; l < dimensionSopa; l++) {
                                if (evt.getSource() == letras[k][l]) {
                                    inicioJuego++;
                                    clicks[k][l]++;
                                    compruebaPalabras(evt,k,l);
                                }
                            }
                        }
                    } 
                });
            } 
        }
    }
    
//    private boolean compruebaPalabraCorrecta(String palabra){
//        //COMPROBAR QUE LAS LETARS SEAN LAS CORRECTAS DE LA PALABRA
//        //RECORRER LAS PALABRAS Y AVERIGUAR SI TIENEN LAS LETRAS EN CASO DE QUE EMPIECE A SELECCIONAR LAS 
//        //LETRAS DESDE EL CENTRO
//        for (int i = 0; i < palabrasEncontradas.length(); i++) {
//            if (!palabra.contains(palabrasEncontradas.substring(i, i+1))){
//                return false;
//            }
//        }
//        return true; 
//    }
    
    
    private void revisaPalabras(int enX, int enY){
        JLabel[] palabrasLabel = {lblPalabra1,lblPalabra2,lblPalabra3,lblPalabra4};
        if (letras[enX][enY].getName().equals("1") & clicks[enX][enY] <= 1){
            palabrasEncontradas += letras[enX][enY].getText();
        } else {
            palabrasEncontradas = "";
        }
        StringBuilder strb = new StringBuilder(palabrasEncontradas);
        //System.out.println(palabrasEncontradas);
        for (int i = 0; i < 4; i++) {
            //if (palabrasEncontradas.equals(arrayPalabras[i].toUpperCase()) & compruebaPalabraCorrecta(palabrasLabel[i].getText())) {
            if (palabrasEncontradas.equals(arrayPalabras[i].toUpperCase())) {
                palabrasLabel[i].setText("<html><body><s>"+palabrasLabel[i].getText()+"</s></body></html>");//tacha la palabra
                palabrasEncontradas = "";
            //} else if (strb.reverse().toString().equals(arrayPalabras[i].toUpperCase()) & compruebaPalabraCorrecta(palabrasLabel[i].getText())){
            } else if (strb.reverse().toString().equals(arrayPalabras[i].toUpperCase())){
                palabrasLabel[i].setText("<html><body><s>"+palabrasLabel[i].getText()+"</s></body></html>");//tacha la palabra
                palabrasEncontradas = "";
            }
//            } else if (compruebaPalabraCorrecta(palabrasLabel[i].getText())){
//                palabrasLabel[i].setText("<html><body><s>"+palabrasLabel[i].getText()+"</s></body></html>");//tacha la palabra
//                palabrasEncontradas = "";
//            }           
        }
        boolean aux = true;   //ayuda para saber si ya todas las palabras estan tachadas
        for (int i = 0; i < 4; i++)
        {
            if (!palabrasLabel[i].getText().substring(0, 1).equals("<")) 
            {
                aux=false;
                break;
            }
        }
        
        if (aux) {   
            reloj.stop();
            JOptionPane.showMessageDialog(this, "FELICIDADES  "+jugadorActual.getNombreCompleto().toUpperCase()+" HAS GANADO");
            jugadorActual.setPuedoAvanzar(true);
            if (jugadorActual.getCasillaActual() == 26 & jugadorActual.isPuedoAvanzar()) {
                new VentanaFinal(jugadorActual.getNombreCompleto()).setVisible(true);
            }
            
            this.dispose();
        }
    }

    
    private void compruebaPalabras(MouseEvent evt, int enX, int enY){
        if (evt.getComponent().getBackground().equals(Color.WHITE)) {
            evt.getComponent().setBackground(Color.BLUE);
            revisaPalabras(enX, enY);
        }else if(evt.getComponent().getName().equals("")){
            evt.getComponent().setBackground(Color.WHITE);
        }
    }
    
        
    
    private void llenaEspacios(){
        String abc[] = abecedario();
        Random random = new Random();
        for (int i = 0; i < dimensionSopa; i++) {
            for (int j = 0; j < dimensionSopa; j++) {
                if (letras[i][j].getText().equals("")) {
                    letras[i][j].setText(abc[(int)(random.nextDouble()*abc.length-1)]);
                }
            }
        }
    }
    
    
    private String[] abecedario(){
        String abc[] = new String[26];
        int numero = 1;
        for (int i = 0; i < abc.length; i++) {
            char letra = (char)(CONVERTION_BASE_CHAR_VALUE+numero);
            String StringLetra = String.valueOf(letra);
            abc[i] = StringLetra;          
            numero++;
        }
        
        return abc;
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlSopa = new javax.swing.JPanel();
        pnlPalabras = new javax.swing.JPanel();
        lblPalabra1 = new javax.swing.JLabel();
        lblPalabra2 = new javax.swing.JLabel();
        lblPalabra3 = new javax.swing.JLabel();
        lblPalabra4 = new javax.swing.JLabel();
        lblPalabrasNombre = new javax.swing.JLabel();
        lblTiempo = new javax.swing.JLabel();
        lblTiempoNombre = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        pnlSopa.setBackground(new java.awt.Color(102, 102, 102));
        pnlSopa.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout pnlSopaLayout = new javax.swing.GroupLayout(pnlSopa);
        pnlSopa.setLayout(pnlSopaLayout);
        pnlSopaLayout.setHorizontalGroup(
            pnlSopaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1024, Short.MAX_VALUE)
        );
        pnlSopaLayout.setVerticalGroup(
            pnlSopaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 849, Short.MAX_VALUE)
        );

        pnlPalabras.setBackground(new java.awt.Color(51, 51, 51));

        lblPalabra1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblPalabra1.setForeground(new java.awt.Color(255, 255, 255));
        lblPalabra1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPalabra1.setText("jLabel1");

        lblPalabra2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblPalabra2.setForeground(new java.awt.Color(255, 255, 255));
        lblPalabra2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPalabra2.setText("jLabel1");

        lblPalabra3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblPalabra3.setForeground(new java.awt.Color(255, 255, 255));
        lblPalabra3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPalabra3.setText("jLabel1");

        lblPalabra4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblPalabra4.setForeground(new java.awt.Color(255, 255, 255));
        lblPalabra4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPalabra4.setText("jLabel1");

        lblPalabrasNombre.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblPalabrasNombre.setForeground(new java.awt.Color(255, 255, 255));
        lblPalabrasNombre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPalabrasNombre.setText("PALABRAS");

        lblTiempo.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lblTiempo.setForeground(new java.awt.Color(255, 255, 255));
        lblTiempo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTiempo.setText("02:00");

        lblTiempoNombre.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblTiempoNombre.setForeground(new java.awt.Color(255, 255, 255));
        lblTiempoNombre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTiempoNombre.setText("RELOJ");

        javax.swing.GroupLayout pnlPalabrasLayout = new javax.swing.GroupLayout(pnlPalabras);
        pnlPalabras.setLayout(pnlPalabrasLayout);
        pnlPalabrasLayout.setHorizontalGroup(
            pnlPalabrasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPalabrasLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(pnlPalabrasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblPalabrasNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE)
                    .addComponent(lblPalabra1, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE)
                    .addComponent(lblPalabra2, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE)
                    .addComponent(lblPalabra3, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE)
                    .addComponent(lblPalabra4, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE)
                    .addComponent(lblTiempoNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE)
                    .addComponent(lblTiempo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(20, 20, 20))
        );
        pnlPalabrasLayout.setVerticalGroup(
            pnlPalabrasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPalabrasLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(lblPalabrasNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(116, 116, 116)
                .addComponent(lblPalabra1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addComponent(lblPalabra2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addComponent(lblPalabra3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addComponent(lblPalabra4, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblTiempoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(lblTiempo, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlSopa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(pnlPalabras, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlSopa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnlPalabras, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
//            java.util.logging.Logger.getLogger(VentanaSopaLetras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(VentanaSopaLetras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(VentanaSopaLetras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(VentanaSopaLetras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new VentanaSopaLetras().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblPalabra1;
    private javax.swing.JLabel lblPalabra2;
    private javax.swing.JLabel lblPalabra3;
    private javax.swing.JLabel lblPalabra4;
    private javax.swing.JLabel lblPalabrasNombre;
    private javax.swing.JLabel lblTiempo;
    private javax.swing.JLabel lblTiempoNombre;
    private javax.swing.JPanel pnlPalabras;
    private javax.swing.JPanel pnlSopa;
    // End of variables declaration//GEN-END:variables
}
