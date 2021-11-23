/*
 * JuegoGato.java
 *
 * Created on 2 de diciembre de 2008, 06:36 PM
 */

package juegos.Gato;

import java.awt.Color;
import java.awt.LayoutManager;
import java.awt.event.MouseAdapter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.LayoutStyle;
import juegos.Jugador;
import juegos.Tablero;
import juegos.iJuego;
import juegos.vtnFinal.VentanaFinal;

/**
 *
 * @author  Alejandro
 */

public class JuegoGato extends javax.swing.JFrame implements iJuego {
    private Jugador jugadorActual;
    private Jugador contrincante;
    private Tablero tablero;
    private ArrayList<Jugador> jugadoresOriginal = new ArrayList<>();
    private ArrayList<Jugador> jugadoresPrueba = new ArrayList<>();
    
    
    public JuegoGato(Jugador jugador, Tablero tablero) {
        initComponents();
        this.jugadorActual = jugador;
        jLabel1.setText("Turno del Jugador " + jugadorActual.getNombreCompleto());
        this.tablero = tablero;
        this.jugadoresOriginal = tablero.getPlayerArray();
        
        jPanel1.setLayout(null);
        llenaArrayFalso();
        setContrincante();
        generarTablero();
        this.setTitle(jugadorActual.getNombreCompleto());
        this.tablero.setTxaInfoMomento(this.tablero.getTxaInfoMomento()+"\n"+jugadorActual.getNombreCompleto()+" está jugado Gato\n"
                                        + "Contrincante: "+this.contrincante.getNombreCompleto()+"\n");
        
    }
    
    
    // cambiar este valor para dimensiones
    public static int DIMENSIONES = 3;
    // Tablero con objetos JButton
    private JButton[][] tableroLabels = new JButton[DIMENSIONES][DIMENSIONES];
    // tablero logico, indica el status del boton, si disparado o no
    private int[][] tableroLogico = new int[DIMENSIONES][DIMENSIONES];
    // crea imagen blanco
    private ImageIcon iconoVacio = new ImageIcon(getClass().getResource("cvacio.GIF"));
    // crea imagen X
    private ImageIcon iconoEquiz = new ImageIcon(getClass().getResource("cequiz.GIF"));
    // crea la imagen circulo
    private ImageIcon iconoCirculo = new ImageIcon(getClass().getResource("ccirculo.GIF"));
    
    private int turnoJugador = 1;
    //numero de jugador 1 o 2
    private int numeroJugador = 1;
    
    @Override
    public void ejecutar(Jugador jugador){
        this.setVisible(true);
    }

    
    private void llenaArrayFalso(){
        for (int i = 0; i < jugadoresOriginal.size(); i++) {
            if (!jugadoresOriginal.get(i).equals(jugadorActual)) {
                jugadoresPrueba.add(jugadoresOriginal.get(i));  
            }     
        }      
    }
    
    private void setContrincante(){
        Random random = new Random();
        System.out.println("TAMANO "+jugadoresPrueba.size());
        int azar = random.nextInt(jugadoresPrueba.size());
        System.out.println(azar);
        
        this.contrincante = jugadoresPrueba.get(azar);
    }

    
    
    private void generarTablero()
    {
        for(int i=0;i<DIMENSIONES;i++)
        {
            for(int j=0;j<DIMENSIONES;j++)
            {
                // coloca imagen a todos vacio
                tableroLabels[i][j] = new JButton(iconoVacio);
                //añade al panel el boton;
                jPanel1.add(tableroLabels[i][j]);
                // coloca dimensiones y localidad
                tableroLabels[i][j].setBounds(148+50*i, 148+50*j, 50, 50);
                // coloca el comand como i , j 
                tableroLabels[i][j].setActionCommand(i+","+j);//i+","+j
                
                //aclickSobreTablero(evt);ñade el listener al boton
                tableroLabels[i][j].addMouseListener(new MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                        
                    clickSobreTablero(evt);
                    
                }
                });
                // en logico indica estado en disponible
                tableroLogico[i][j]=0;
            }
        }
    }
    
    private void clickSobreTablero(java.awt.event.MouseEvent evt)
    {
        // obtiene el boton 
        JButton botonTemp = (JButton)evt.getComponent();
        // obtiene el i,j de action command del boton
        String identificadorBoton = botonTemp.getActionCommand();
        
        // separa el string del action comand para obtener columnas
        int columna = 
          Integer.parseInt(identificadorBoton.substring(0,identificadorBoton.indexOf(",")));
        int fila = 
          Integer.parseInt(identificadorBoton.substring(1+identificadorBoton.indexOf(",")));
        
        // si ya se disparo entonces nada
        if(tableroLogico[columna][fila]!=0)
            return;
        
        // si es mi turno continua, si no return
        if (numeroJugador != turnoJugador)
            return;
        
        
        // como es turno del cliente marca el logico con su numero
        tableroLogico[columna][fila] = turnoJugador;
        // si era el jugador 1 marca con x y cambia el turno a jugador 2
        if (numeroJugador == 1)
        {
            
            tableroLabels[columna][fila].setIcon(iconoEquiz);
            turnoJugador = 2;
            numeroJugador = 2;
        }
        else
        {
            // si era jugador 3, marca circulo y turno jugador 1
            tableroLabels[columna][fila].setIcon(iconoCirculo);
            turnoJugador = 1;
            numeroJugador = 1;
        }
        // muestra el turno del jugador
        if (turnoJugador == 1) {
            jLabel1.setText("Turno del Jugador " + jugadorActual.getNombreCompleto());
        } else {
            jLabel1.setText("Turno del Jugador " + contrincante.getNombreCompleto());
        }
            
         
        haGanado();     
    }
    
    
    private boolean haGanado()
    {
        //Ganó en las filas
        for(int i=0;i<3;i++) {
        if ((tableroLogico[i][0]==tableroLogico[i][1])
                &&(tableroLogico[i][1]==tableroLogico[i][2])
                && !(tableroLogico[i][0]==0)) {
            if (tableroLabels[i][0].getIcon().equals(iconoEquiz)) {
                JOptionPane.showMessageDialog(null, "HA GANADO EL JUGADOR "+jugadorActual.getNombreCompleto().toUpperCase()+"");
                jugadorActual.setPuedoAvanzar(true);
                this.dispose();
                if (jugadorActual.getCasillaActual() == 26 & jugadorActual.isPuedoAvanzar()) {
                    this.dispose();
                    new VentanaFinal(jugadorActual.getNombreCompleto()).setVisible(true);
                }
                
            } else {
                JOptionPane.showMessageDialog(null, "HA GANADO EL JUGADOR "+contrincante.getNombreCompleto().toUpperCase()+"");
                jugadorActual.setPuedoAvanzar(false);
                this.dispose();
            }
            return true;
        }
        }
        
        //Gano en las columnas
        for(int i=0;i<3;i++) {
        if ((tableroLogico[0][i]==tableroLogico[1][i])
                &&(tableroLogico[1][i]==tableroLogico[2][i])
                && !(tableroLogico[0][i]==0)) {
            if (tableroLabels[0][i].getIcon().equals(iconoEquiz)) {
                JOptionPane.showMessageDialog(null, "HA GANADO EL JUGADOR "+jugadorActual.getNombreCompleto().toUpperCase()+"");
                jugadorActual.setPuedoAvanzar(true);
                this.dispose();
                if (jugadorActual.getCasillaActual() == 26 & jugadorActual.isPuedoAvanzar()) {
                    this.dispose();
                    //DESPLIEGA LA VENTANA GANAR
                }
            } else {
                JOptionPane.showMessageDialog(null, "HA GANADO EL JUGADOR "+contrincante.getNombreCompleto().toUpperCase()+"");
                jugadorActual.setPuedoAvanzar(false);
                this.dispose();
            }
            return true;
        }
        }
        //Verificar diagonal 1
        if ((tableroLogico[0][0]==tableroLogico[1][1])
                &&(tableroLogico[1][1]==tableroLogico[2][2])
                && !(tableroLogico[0][0]==0)) {
            if (tableroLabels[0][0].getIcon().equals(iconoEquiz)) {
                JOptionPane.showMessageDialog(null, "HA GANADO EL JUGADOR "+jugadorActual.getNombreCompleto().toUpperCase()+"");
                jugadorActual.setPuedoAvanzar(true);
                this.dispose();
                if (jugadorActual.getCasillaActual() == 26 & jugadorActual.isPuedoAvanzar()) {
                    this.dispose();
                    //DESPLIEGA LA VENTANA GANAR
                }
            } else {
                JOptionPane.showMessageDialog(null, "HA GANADO EL JUGADOR "+contrincante.getNombreCompleto().toUpperCase()+"");
                jugadorActual.setPuedoAvanzar(false);
                this.dispose();
            }
            
            return true;
        }
        
        //Verificar diagonal 2
        if ((tableroLogico[2][0]==tableroLogico[1][1])
                &&(tableroLogico[1][1]==tableroLogico[0][2])
                && !(tableroLogico[2][0]==0)) {
            if (tableroLabels[2][0].getIcon().equals(iconoEquiz)) {
                JOptionPane.showMessageDialog(null, "HA GANADO EL JUGADOR "+jugadorActual.getNombreCompleto().toUpperCase()+"");
                jugadorActual.setPuedoAvanzar(true);
                this.dispose();
                if (jugadorActual.getCasillaActual() == 26 & jugadorActual.isPuedoAvanzar()) {
                    this.dispose();
                    //DESPLIEGA LA VENTANA GANAR
                }
            } else {
                JOptionPane.showMessageDialog(null, "HA GANADO EL JUGADOR "+contrincante.getNombreCompleto().toUpperCase()+"");
                jugadorActual.setPuedoAvanzar(false);
                this.dispose();
            }
            return true;
        }
        
        if (compruebaEmpate()){
            JOptionPane.showMessageDialog(null, "HAN EMPATADO XD, NO PUEDES AVANZAR "+jugadorActual.getNombreCompleto().toUpperCase());
            jugadorActual.setPuedoAvanzar(false);
            this.dispose();
        }
        return false;
    }
    
    private boolean compruebaEmpate(){     
        for (int i = 0; i < DIMENSIONES; i++) {
            for (int j = 0; j < DIMENSIONES; j++) {
                if (tableroLogico[i][j] == 0){
                    return false;
                }
            }     
        }
        return true;
    }
    
    
    
    

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblEnemigo = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Turno del Jugador: Jugador 1");

        lblEnemigo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblEnemigo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/juegos/MemoryPath/imagenFondo/index.png"))); // NOI18N

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/juegos/bomberMario/imagen/icono15x15.png"))); // NOI18N

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/juegos/CollectTheCoins/imagenesCoins/index.png"))); // NOI18N

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/juegos/CollectTheCoins/imagenesCoins/index.png"))); // NOI18N

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/juegos/CollectTheCoins/imagenesCoins/index.png"))); // NOI18N

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/juegos/CollectTheCoins/imagenesCoins/index.png"))); // NOI18N

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/juegos/MemoryPath/imagenFondo/png-clipart-super-mario-bros-3-super-mario-world-mario-heroes-super-mario-bros.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(lblEnemigo, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(0, 0, 0)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel7)))
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 92, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblEnemigo, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 300, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel6)
                        .addGap(39, 39, 39))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(1, 1, 1)
                                .addComponent(jLabel7)))
                        .addGap(21, 21, 21))))
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
    
//    /**
//     * @param args the command line arguments
//     */
//    public static void main(String args[]) {
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new JuegoGato().setVisible(true);
//            }
//        });
//    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblEnemigo;
    // End of variables declaration//GEN-END:variables
    
}
