package juegos.MemoryCard.juegoMemoryCard;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.*;
import juegos.Jugador;
import juegos.Tablero;
import juegos.vtnFinal.VentanaFinal;

public class JuegoMemory {
    
    private VentanaJuego vtn;
    private JPanel panelJuego;
    private JLabel fondoJuego;
    private JLabel lblNombre;
    private Timer TiempoEspera;
    private Timer TiempoEspera1;
    private Random aleatorio;
    private JLabel matriz[][];
    private Jugador jugadorActual;
    private Jugador contrincante;
    private Tablero tablero;
    private ArrayList<Jugador> jugadoresOriginal = new ArrayList<>();
    private ArrayList<Jugador> jugadoresPrueba = new ArrayList<>();
    public static int DIMENSION_X = 3;
    public static int DIMENSION_Y = 6;
    
    private int matrizInt[][];
    private int matrizAux[][];
    
    private int contador;
    
    private boolean flag;
    private boolean secondFlag;
    
    private int counterSeconds;
    
    private int antiguoNumeroCarta;
    private int antiguaPosX;
    private int antiguaPosY;
    
    private int actualNumeroCarta;
    private int actualPosX;
    private int actualPosY;
    
    private int turnoJugador = 1;
    //numero de jugador 1 o 2
    private int numeroJugador = 1;
    
    private int aciertosActual = 0;
    private int aciertosContrincante = 0;
    
    

    //public JuegoMemory(VentanaJuego vtn, Jugador jugador, Tablero tablero){
    public JuegoMemory(VentanaJuego vtn, Jugador jugador, Tablero tablero){
        this.vtn = vtn;
        this.jugadorActual = jugador;
        this.tablero = tablero;
        this.jugadoresOriginal = tablero.getPlayerArray();

        
        //Juego
        panelJuego = new JPanel();
        panelJuego.setSize(vtn.getWidth(),vtn.getHeight());
        panelJuego.setLocation(0, 0);
        panelJuego.setLayout(null);
        panelJuego.setVisible(true);
        
       
        
        //fondo juego
        fondoJuego = new JLabel();
        fondoJuego.setSize(vtn.getWidth(),vtn.getHeight());
        fondoJuego.setLocation(0, 0);
        fondoJuego.setIcon(new ImageIcon("C:\\Users\\Hewlett Packard\\Documents\\NetBeansProjects\\MarioParty\\src\\juegos\\MemoryCard\\fondoMemoryCard\\60027.jpg"));
        fondoJuego.setVisible(true);
        panelJuego.add(fondoJuego);
        
        //Nombres
        lblNombre = new JLabel();
        lblNombre.setSize(253, 39);
        lblNombre.setLocation(20, 500);
        lblNombre.setFont(new Font("Tahoma",1,18));
        lblNombre.setText("Turno del Jugador: "+jugadorActual.getNombreCompleto());
        //lblNombre.setText("Turno del Jugador: "+turnoJugador);
        lblNombre.setForeground(Color.BLACK);
        lblNombre.setVisible(true);
        panelJuego.add(lblNombre,0);
        
        
        
        //cartas logicas
        matrizInt = new int[DIMENSION_X][DIMENSION_Y];
        matrizAux = new int[DIMENSION_X][DIMENSION_Y];
        aleatorio = new Random(); 
        this.llenaCeros();
        this.llenaArrayFalso();
        this.cartasAleatorias();
        this.setContrincante();
        
        this.vtn.setTitle(jugadorActual.getNombreCompleto());
        this.tablero.setTxaInfoMomento(this.tablero.getTxaInfoMomento()+"\n"+jugadorActual.getNombreCompleto()+" está jugado Memory Cards\n"
                                        + "Contrincante: "+this.contrincante.getNombreCompleto()+"\n");
                
        //imagenes
        matriz = new JLabel[DIMENSION_X][DIMENSION_Y];
        for (int i = 0; i < DIMENSION_X; i++) {
            for (int j = 0; j < DIMENSION_Y; j++) {
                matriz[i][j] = new JLabel();
                matriz[i][j].setBounds(55+(j*100), 65+(i*145), 100, 145);
                matriz[i][j].setIcon(new ImageIcon("C:\\Users\\Hewlett Packard\\Documents\\NetBeansProjects\\MarioParty\\src\\juegos\\MemoryCard\\imagenes\\"+matrizAux[i][j]+".jpg"));
                matriz[i][j].setVisible(true);
                panelJuego.add(matriz[i][j],0); 
            }           
        }
        
        //Tiempo de espera
        counterSeconds = 0;
        TiempoEspera = new Timer(300, new ActionListener()
        {
            public void actionPerformed(ActionEvent evt){
                counterSeconds++;
            }
        });
        
        TiempoEspera.start();
        TiempoEspera.stop();
        counterSeconds = 0;
        flag = false;
        secondFlag = false;
        
        
        
        contador = 0;
        
        for (int i = 0; i < DIMENSION_X; i++) {
            for (int j = 0; j < DIMENSION_Y; j++) {
                matriz[i][j].addMouseListener(new MouseAdapter() {
                    @Override
                    public void mousePressed(MouseEvent evt){
                        for (int k = 0; k < DIMENSION_X; k++) {
                            for (int l = 0; l < DIMENSION_Y; l++) {
                                if(evt.getSource() == matriz[k][l]){

                                    if (matrizAux[k][l] == 0 && contador != 2){
                                        
                                        matrizAux[k][l] = matrizInt[k][l];
                                        matriz[k][l].setIcon(new ImageIcon("C:\\Users\\Hewlett Packard\\Documents\\NetBeansProjects\\MarioParty\\src\\juegos\\MemoryCard\\imagenes\\"+matrizAux[k][l]+".jpg"));
                                        
                                        actualNumeroCarta = matrizAux[k][l];
                                        actualPosX = k;
                                        actualPosY = l;
                                        
                                        contador ++;
                                        
                                        if (contador == 1) {
                                            antiguoNumeroCarta = matrizInt[k][l];
                                            antiguaPosX = k;
                                            antiguaPosY = l;
                                        }
                                        
                                        
                                        
                                        TiempoEspera1 = new Timer(100, new ActionListener()
                                        {
                                        @Override
                                        public void actionPerformed(ActionEvent evt){
                                        
                                            if (contador == 2 && secondFlag == false){
                                                TiempoEspera.restart();
                                                secondFlag = true;
                                            }
                                            if ( contador == 2 && counterSeconds == 2){
                                                TiempoEspera.stop();
                                                counterSeconds = 0;
                                                
                                                //System.out.println("TURNO "+numeroJugador);
                                                if (numeroJugador == 1){
                                                    turnoJugador = 2;
                                                    numeroJugador = 2;
                                                }else {
                                                    // si era jugador 3, marca circulo y turno jugador 1
                                                    turnoJugador = 1;
                                                    numeroJugador = 1;
                                                }

                                                // muestra el turno del jugador
                                                if (turnoJugador == 1) {
                                                    lblNombre.setText("Turno del Jugador " + jugadorActual.getNombreCompleto());
                                                    //lblNombre.setText("Turno del Jugador " +turnoJugador);
                                                } else {
                                                    lblNombre.setText("Turno del Jugador " + contrincante.getNombreCompleto());
                                                    //lblNombre.setText("Turno del Jugador " +turnoJugador);
                                                }
                                                
                                                if (matrizAux[actualPosX][actualPosY] == matrizAux[antiguaPosX][antiguaPosY]){
                                                    matrizAux[actualPosX][actualPosY] = -1;
                                                    matrizAux[antiguaPosX][antiguaPosY] = -1;
                                                    matriz[actualPosX][actualPosY].setIcon(new ImageIcon("C:\\Users\\Hewlett Packard\\Documents\\NetBeansProjects\\MarioParty\\src\\juegos\\MemoryCard\\imagenes\\"+matrizAux[actualPosX][actualPosY]+".jpg"));
                                                    matriz[antiguaPosX][antiguaPosY].setIcon(new ImageIcon("C:\\Users\\Hewlett Packard\\Documents\\NetBeansProjects\\MarioParty\\src\\juegos\\MemoryCard\\imagenes\\"+matrizAux[antiguaPosX][antiguaPosY]+".jpg"));
                                                    contador = 0;
                                                    
                                                    //Ganador
                                                    int acumulador = 0;
                                                    for (int m = 0; m < DIMENSION_X; m++) {
                                                        for (int n = 0; n < DIMENSION_Y; n++) {
                                                            if (matrizAux[m][n] == -1) {
                                                                acumulador++;
                                                                
                                                                if (acumulador == 2 & turnoJugador == 1) {
                                                                    aciertosActual++;
                                                                }else if (acumulador == 2 & turnoJugador == 2){
                                                                    aciertosContrincante++;
                                                                }
                                                                //System.out.println("Jugador 1 "+aciertosActual);
                                                                //System.out.println("Jugador 2 "+aciertosContrincante);
                                                            }
                                                        }
                                                    }                                         
                                                    if (acumulador == 18) {
                                                        if (aciertosActual > aciertosContrincante){
                                                            JOptionPane.showMessageDialog(vtn, "LO SENTIMOS "+jugadorActual.getNombreCompleto().toUpperCase()+", HA GANADO "+contrincante.getNombreCompleto().toUpperCase());
                                                            jugadorActual.setPuedoAvanzar(false);
                                                            

                                                        } else if (aciertosActual <= aciertosContrincante){
                                                            JOptionPane.showMessageDialog(vtn, "FELICITACIONES JUGADOR "+jugadorActual.getNombreCompleto().toUpperCase()+", HAS GANADO");
                                                            jugadorActual.setPuedoAvanzar(true);
                                                            //System.out.println("Contrincante");
                                                        }
                                                        
                                                        if (jugadorActual.getCasillaActual() == 26 & jugadorActual.isPuedoAvanzar()){
                                                            new VentanaFinal(jugadorActual.getNombreCompleto()).setVisible(true);
                                                        }
                                                        vtn.dispose();
                                                    }                
                                                }
                                                
                                                
                                                for (int m = 0; m < DIMENSION_X; m++) {
                                                    for (int n = 0; n < DIMENSION_Y; n++) {
                                                        if (matrizAux[m][n] != 0 && matrizAux[m][n] != -1){
                                                            matrizAux[m][n] = 0;
                                                            matriz[m][n].setIcon(new ImageIcon("C:\\Users\\Hewlett Packard\\Documents\\NetBeansProjects\\MarioParty\\src\\juegos\\MemoryCard\\imagenes\\"+matrizAux[m][n]+".jpg"));
                                                            contador = 0;
                                                        }
                                                    }
                                                }
                                                TiempoEspera1.stop();
                                                secondFlag = false;
                                            }
                                        }});
                                        if (flag == false){
                                            TiempoEspera1.start();
                                            flag = true;
                                        }
                                        if (contador == 2){
                                            TiempoEspera1.restart();
                                        }
                                    }                         
                                }                               
                            }
                        } 
                    }
                });
            }
        }
        
        
        vtn.add(panelJuego);
        vtn.setVisible(true);
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
        //System.out.println("TAMANO "+jugadoresPrueba.size());
        int azar = random.nextInt(jugadoresPrueba.size());
        System.out.println(azar);
        
        this.contrincante = jugadoresPrueba.get(azar);
    }
    
    
    private void reiniciaJuego(){
        for (int i = 0; i < DIMENSION_X; i++) {
            for (int j = 0; j < DIMENSION_Y; j++) {
                matrizInt[i][j] = 0;
                matrizAux[i][j] = 0;
                matriz[i][j].setIcon(new ImageIcon("C:\\Users\\Hewlett Packard\\Documents\\NetBeansProjects\\MarioParty\\src\\juegos\\MemoryCard\\imagenes\\"+matrizAux[i][j]+".jpg"));
            }
        }
    }
    
    
    private void llenaCeros(){
        for (int i = 0; i < DIMENSION_X; i++) {
            for (int j = 0; j < DIMENSION_Y; j++) {
                matrizInt[i][j] = 0;
                matrizAux[i][j] = 0;
            }
        }
    }
    
    public void cartasAleatorias(){
        //llenaCeros();
        int acumulador = 0;
        
        for (int i = 0; i < DIMENSION_X; i++) {
            for (int j = 0; j < DIMENSION_Y; j++) {
                matrizInt[i][j] = aleatorio.nextInt(9)+1;
                do{
                    acumulador = 0;
                    
                    for (int k = 0; k < DIMENSION_X; k++) {
                        for (int l = 0; l < DIMENSION_Y; l++) {

                            if ( matrizInt[i][j] == matrizInt[k][l] ) {
                                acumulador += 1;
                            }  
                        }
                    }
                    if(acumulador == 3){
                        matrizInt[i][j] = aleatorio.nextInt(9)+1;
                    }
                } while ( acumulador == 3);
                    
            }          
        }
        
        for (int i = 0; i < DIMENSION_X; i++) {
            for (int j = 0; j < DIMENSION_Y; j++) {
                //System.out.print(matrizInt[i][j] + "    ");
            }
            //System.out.println("");
        }
    }
    
    
}
