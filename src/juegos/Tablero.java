package juegos;

import java.awt.Color;
import java.awt.Font;
import java.awt.Point;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;


public class Tablero extends javax.swing.JFrame {
    public static final int BUTTON_SIZE = 120;
    public static final int BOARD_SIZE = 26;
    public static final int CANTIDAD_JUEGOS = 15;
    public static final int DADOS = 6;
    
    
    private JLabel labelsArray[] = new JLabel[BOARD_SIZE];
    private JLabel puntoPartida;

    private int turno = 1;
    
    private Color colorArray[];
    private Jugador jugadores[];
    
    private ImageIcon[] arrayImages = new ImageIcon[DADOS];
    private ImageIcon[] imagesJuegos = new ImageIcon[CANTIDAD_JUEGOS];
    
    private ArrayList<Jugador> playerArray = new ArrayList<Jugador>();
    private ArrayList<Integer> arrayLogico = new ArrayList<Integer>();
    private int[] arrayAux = {0,0,1,1,3,3,2,2,4,5,5,6,7,8,9,9,10,10,10,12,12,11,11,13,13,14};


    public Tablero(Jugador jugadores[]) {
        
        this.jugadores = jugadores;
        setImages();
        direccionJuegos();
        llenaArrayManual();
        
        initComponents();
        lblDado1.setIcon(arrayImages[0]);
        lblDado2.setIcon(arrayImages[1]);
        
        initPlayers();
        initBoard();
        casillasJuego();
        muestraOrden();
        
        
        lblTurno.setText(("Turno " + playerArray.get(turno-1).getNombreCompleto()).toUpperCase());
    }

    public JLabel[] getLabelsArray() {
        return labelsArray;
    }

    public void setLabelsArray(JLabel[] labelsArray) {
        this.labelsArray = labelsArray;
    }

    public ArrayList<Jugador> getPlayerArray() {
        return playerArray;
    }

    public void setPlayerArray(ArrayList<Jugador> playerArray) {
        this.playerArray = playerArray;
    }

    public JLabel getPuntoPartida() {
        return puntoPartida;
    }
 
    
    private void llenaArrayManual(){
        for (int i = 0; i < arrayAux.length; i++) {
            arrayLogico.add(arrayAux[i]);
        }
    }
    
    private void muestraOrden(){
        setTxaInfoMomento("Orden de los jugadores:   \n");
        for (int i = 0; i < playerArray.size(); i++) {
            setTxaInfoMomento(getTxaInfoMomento()+(i+1)+".  "+playerArray.get(i).getNombreCompleto().toUpperCase()+"\n");  
        }
    }
    
    
    
    private void casillasJuego(){
       Random random = new Random();
       
        System.out.println("CASILLAS DE JUEGO   "+labelsArray.length);
        System.out.println("IMAGENES DE JUEGO   "+imagesJuegos.length);
        System.out.println("ARRAY LOGICO DE JUEGO   "+arrayLogico.size());
       
       int contadorTubos = 1;
        for (int i = 0; i < BOARD_SIZE; i++) {
            int numeroAzar = random.nextInt(arrayLogico.size());
            if (arrayLogico.get(numeroAzar) == 10){
                labelsArray[i].setName(""+contadorTubos);
                contadorTubos++;
            } else {
                labelsArray[i].setName("0");
            }
            labelsArray[i].setIcon(imagesJuegos[arrayLogico.get(numeroAzar)]);
            arrayLogico.remove(numeroAzar);
        }     
    }
    
    
    private void direccionJuegos(){
        for (int i = 0; i < CANTIDAD_JUEGOS; i++) {
            imagesJuegos[i] = new ImageIcon("C:\\Users\\Hewlett Packard\\Documents\\NetBeansProjects\\MarioParty\\src\\juegos\\imagenesJuegos\\"+i+".png");
        }
    }   
    
    
    public void initPlayers(){
        for (int i = 0; i < this.jugadores.length; i++) {
            jPanel1.add(jugadores[i].getRefButton());
        }
        for (int i = 0; i < this.jugadores.length; i++) {
            playerArray.add(jugadores[i]);
        }
    }
    
    public void initBoard(){
        puntoPartida = new JLabel("SALIDA");
        jPanel1.add(puntoPartida);
        puntoPartida.setFont(new Font("Tahoma",1,12));
        puntoPartida.setHorizontalAlignment(SwingConstants.CENTER);
        puntoPartida.setVerticalAlignment(SwingConstants.CENTER);
        puntoPartida.setForeground(Color.BLACK);
        puntoPartida.setBackground(Color.WHITE);
        puntoPartida.setBounds(0, 0, BUTTON_SIZE, BUTTON_SIZE);
        
        
        for (int i = 0; i < labelsArray.length; i++) {
            labelsArray[i] = new JLabel();
            jPanel1.add(labelsArray[i]);
            labelsArray[i].setFont(new Font("Tahoma",1,12));
            labelsArray[i].setHorizontalAlignment(SwingConstants.CENTER);
            labelsArray[i].setVerticalAlignment(SwingConstants.CENTER);
            labelsArray[i].setForeground(Color.BLACK);
            labelsArray[i].setBackground(Color.WHITE);
            labelsArray[i].setBorder(BorderFactory.createLineBorder(Color.BLACK));
            labelsArray[i].setOpaque(true);
            
            if (i <= 7)
                labelsArray[i].setBounds((BUTTON_SIZE)+(i*BUTTON_SIZE), 0, BUTTON_SIZE, BUTTON_SIZE);
            else if (i >=8 && i <= 12)
                labelsArray[i].setBounds((BUTTON_SIZE)+840, (i-7) * BUTTON_SIZE, BUTTON_SIZE, BUTTON_SIZE);
            else if (i >=13 && i <= 20)
                labelsArray[i].setBounds((BUTTON_SIZE)+840-(i-13)* BUTTON_SIZE, 720 , BUTTON_SIZE, BUTTON_SIZE);
            else
                labelsArray[i].setBounds((BUTTON_SIZE)+0, 600-(i-21)* BUTTON_SIZE, BUTTON_SIZE, BUTTON_SIZE);   
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        lblPalabraDados = new javax.swing.JLabel();
        lblDado1 = new javax.swing.JLabel();
        lblDado2 = new javax.swing.JLabel();
        btnDados = new javax.swing.JButton();
        txfDados = new javax.swing.JTextField();
        lblTurno = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txaInfoMomento = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1078, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 945, Short.MAX_VALUE)
        );

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));

        lblPalabraDados.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lblPalabraDados.setForeground(new java.awt.Color(255, 255, 255));
        lblPalabraDados.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPalabraDados.setText("DADOS");

        lblDado1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblDado2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btnDados.setBackground(new java.awt.Color(255, 255, 51));
        btnDados.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnDados.setForeground(new java.awt.Color(0, 0, 0));
        btnDados.setText("Lanzar dados");
        btnDados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDadosActionPerformed(evt);
            }
        });

        txfDados.setBackground(new java.awt.Color(255, 255, 255));
        txfDados.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        txfDados.setForeground(new java.awt.Color(0, 0, 0));
        txfDados.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        lblTurno.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblTurno.setForeground(new java.awt.Color(255, 255, 255));
        lblTurno.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTurno.setText("Turno 1");

        txaInfoMomento.setBackground(new java.awt.Color(255, 255, 255));
        txaInfoMomento.setColumns(20);
        txaInfoMomento.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txaInfoMomento.setForeground(new java.awt.Color(0, 0, 0));
        txaInfoMomento.setRows(5);
        jScrollPane1.setViewportView(txaInfoMomento);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(lblPalabraDados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(lblDado1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(44, 44, 44)
                                    .addComponent(lblDado2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(91, 91, 91)
                                .addComponent(btnDados, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(48, 48, 48)
                                .addComponent(lblTurno, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(20, 20, 20))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(txfDados, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(100, 100, 100))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(lblPalabraDados, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDado1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDado2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(73, 73, 73)
                .addComponent(btnDados, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txfDados, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblTurno, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(74, 74, 74))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnDadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDadosActionPerformed
        SongThread cancion = new SongThread("sonidoDados.wav");
        cancion.start();
        this.lanzarDados();
    }//GEN-LAST:event_btnDadosActionPerformed

    private void setImages(){
        arrayImages[0] = new ImageIcon("C:\\Users\\Hewlett Packard\\Documents\\NetBeansProjects\\MarioParty\\src\\juegos\\fotos\\dado1.png");
        arrayImages[1] = new ImageIcon("C:\\Users\\Hewlett Packard\\Documents\\NetBeansProjects\\MarioParty\\src\\juegos\\fotos\\dado2.png");
        arrayImages[2] = new ImageIcon("C:\\Users\\Hewlett Packard\\Documents\\NetBeansProjects\\MarioParty\\src\\juegos\\fotos\\dado3.png");
        arrayImages[3] = new ImageIcon("C:\\Users\\Hewlett Packard\\Documents\\NetBeansProjects\\MarioParty\\src\\juegos\\fotos\\dado4.png");
        arrayImages[4] = new ImageIcon("C:\\Users\\Hewlett Packard\\Documents\\NetBeansProjects\\MarioParty\\src\\juegos\\fotos\\dado5.png");
        arrayImages[5] = new ImageIcon("C:\\Users\\Hewlett Packard\\Documents\\NetBeansProjects\\MarioParty\\src\\juegos\\fotos\\castigo.png");
    }   
   
    public void moverFicha(int avance){
        Jugador jugadorActual = playerArray.get(turno-1);
        
        
        //cuando gana preguntar if casillaActual es 26 and puedoAvanzar 
        //cerrar el juego ahi mismito y decir el ganador
        if (jugadorActual.getCastigos() == 0 && jugadorActual.isPuedoAvanzar()) {
            
            jugadorActual.avanzarCasillaActual(avance);
            
            JButton botonFicha = playerArray.get(turno-1).getRefButton();
            Point pto = botonFicha.getLocation();


            if(jugadorActual.getCasillaActual()>26){
                jugadorActual.setCasillaActual(26-(Math.abs((jugadorActual.getCasillaActual()+avance)-26)-avance));
            }

            //ubicacion de la casilla donde cayo. x,y
            Point ptoCasilla = labelsArray[jugadorActual.getCasillaActual()-1].getLocation();
            botonFicha.setLocation(ptoCasilla.x, ptoCasilla.y + jugadorActual.getIndex() * 20);
            
            
            if (labelsArray[jugadorActual.getCasillaActual()-1].getIcon().equals(imagesJuegos[6])){
                SongThread sonido = new SongThread("sonidoEstrella.wav");
                sonido.start();
                JOptionPane.showMessageDialog(this, "HAS CAIDO EN LA CASILLA ESTRELLA, PUEDES VOLVER A TIRAR LOS DADOS");
                turno--;
            }
            
            iJuego juego = Juegos.creaJuegos(this, playerArray.get(turno-1).getRefButton(), jugadorActual, labelsArray[jugadorActual.getCasillaActual()-1].getIcon().toString(), labelsArray, jugadorActual.getCasillaActual()-1);  
            juego.ejecutar(jugadorActual);
            setTxaInfoMomento(getTxaInfoMomento()+"He saltado a la casilla "+jugadorActual.getCasillaActual());
            
        } else if (!jugadorActual.isPuedoAvanzar() & jugadorActual.getCastigos() == 0) {
            //LLAMA A UN JUEGO
            setTxaInfoMomento(getTxaInfoMomento()+"Pero debe jugar nuevamente");
            iJuego juego = Juegos.creaJuegos(this, playerArray.get(turno-1).getRefButton(), jugadorActual, labelsArray[jugadorActual.getCasillaActual()-1].getIcon().toString(), labelsArray, jugadorActual.getCasillaActual()-1);  
            juego.ejecutar(jugadorActual); 
        }
        
        if (jugadorActual.getCastigos() > 0) {
            jugadorActual.setCastigos(jugadorActual.getCastigos()-1);
        }
        
        pintarTurno();     
    }
    
    private void setNextTurno(){
        
        turno++;
        //System.out.println(turno);
        if(turno > playerArray.size()){
            turno = 1;
            //System.out.println(turno);
        }
        
        if (playerArray.get(turno-1).getCastigos() > 0) {
            System.out.println(playerArray.get(turno-1).getNombreCompleto()+"    "+playerArray.get(turno-1).getCastigos());
            //EN ESTA PARTE SE PUEDE SETEAR EL TEXT AREA TAL JUGADOR PERDIO UN TURNO
            setTxaInfoMomento(getTxaInfoMomento()+"\n"+playerArray.get(turno-1).getNombreCompleto()+" perdio un turno ");
            playerArray.get(turno-1).setCastigos(playerArray.get(turno-1).getCastigos()-1);
            System.out.println(playerArray.get(turno-1).getNombreCompleto()+"    "+playerArray.get(turno-1).getCastigos());
            pintarTurno();
        }
    }

    public int getTurno() {
        return turno;
    }

    public void setTurno(int turno) {
        this.turno = turno;
    }

    public String getTxaInfoMomento() {
        return txaInfoMomento.getText();
    }

    public void setTxaInfoMomento(String txaInfoMomento) {
        this.txaInfoMomento.setText(txaInfoMomento);
    }
    
    
    
    private void lanzarDados(){
        int dado1 = (new Random()).nextInt(6)+1;
        int dado2 = (new Random()).nextInt(6)+1;
        
        DadosThread daditos = new DadosThread(this,arrayImages, dado1, dado2, lblDado1, lblDado2, txfDados);
        daditos.start();
    }
    
    public void pintarTurno(){
        setNextTurno();
        lblTurno.setText(("Turno " + playerArray.get(turno-1).getNombreCompleto()).toUpperCase());
    }
    
    
    /**
     * @param args the command line arguments
     */
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
//            java.util.logging.Logger.getLogger(Tablero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(Tablero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(Tablero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(Tablero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new Tablero().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDados;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblDado1;
    private javax.swing.JLabel lblDado2;
    private javax.swing.JLabel lblPalabraDados;
    private javax.swing.JLabel lblTurno;
    private javax.swing.JTextArea txaInfoMomento;
    private javax.swing.JTextField txfDados;
    // End of variables declaration//GEN-END:variables
}
