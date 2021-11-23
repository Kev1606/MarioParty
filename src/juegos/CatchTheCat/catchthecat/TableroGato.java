package juegos.CatchTheCat.catchthecat;


import java.awt.Cursor;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.border.Border;
import juegos.Jugador;
import juegos.SongThread;
import juegos.Tablero;
import juegos.iJuego;
import juegos.vtnFinal.VentanaFinal;

/**
 *
 * @author Joctan Esquivel
 */
public class TableroGato extends javax.swing.JFrame implements iJuego{
    
    private final int PLACE_SIZE = 11;
    private int clicks=0;
    private JLabel[][] matrizBotones = new JLabel[PLACE_SIZE][PLACE_SIZE];
    private JButton marioColita = new JButton();
    private Jugador jugadorActual;
    private Tablero tablero;
    
    private boolean matrizLogica[][] = new boolean[PLACE_SIZE][PLACE_SIZE];;
    public final double DIAGONAL_CUADRITO = distanciaEntrePuntos(new Point(0,0),new Point(1,1));

    /**
     * Creates new form TableroGato
     */
    public TableroGato(Jugador jugadorActual, Tablero tablero) {
        initComponents();
        this.jugadorActual = jugadorActual;
        this.tablero = tablero;
        creaTablero();
        logicaJuego();
        bloquearCasillas();
        
        
//        matrizLogica[3][3]=false;
//        matrizBotones[3][3].setIcon(new ImageIcon("C:\\Users\\Joctan Esquivel\\Documents\\TEC\\Semestre II\\POO\\Proyecto2\\CatchTheCat\\src\\fotos\\rojo.jpg"));
//        
//        matrizLogica[3][4]=false;
//        matrizBotones[3][4].setIcon(new ImageIcon("C:\\Users\\Joctan Esquivel\\Documents\\TEC\\Semestre II\\POO\\Proyecto2\\CatchTheCat\\src\\fotos\\rojo.jpg"));
//        
//        matrizLogica[3][5]=false;
//        matrizBotones[3][5].setIcon(new ImageIcon("C:\\Users\\Joctan Esquivel\\Documents\\TEC\\Semestre II\\POO\\Proyecto2\\CatchTheCat\\src\\fotos\\rojo.jpg"));
//        
//        matrizLogica[3][6]=false;
//        matrizBotones[3][6].setIcon(new ImageIcon("C:\\Users\\Joctan Esquivel\\Documents\\TEC\\Semestre II\\POO\\Proyecto2\\CatchTheCat\\src\\fotos\\rojo.jpg"));
//        
//        matrizLogica[3][7]=false;
//        matrizBotones[3][7].setIcon(new ImageIcon("C:\\Users\\Joctan Esquivel\\Documents\\TEC\\Semestre II\\POO\\Proyecto2\\CatchTheCat\\src\\fotos\\rojo.jpg"));
//        
//        matrizLogica[4][7]=false;
//        matrizBotones[4][7].setIcon(new ImageIcon("C:\\Users\\Joctan Esquivel\\Documents\\TEC\\Semestre II\\POO\\Proyecto2\\CatchTheCat\\src\\fotos\\rojo.jpg"));
//        
//        matrizLogica[5][7]=false;
//        matrizBotones[5][7].setIcon(new ImageIcon("C:\\Users\\Joctan Esquivel\\Documents\\TEC\\Semestre II\\POO\\Proyecto2\\CatchTheCat\\src\\fotos\\rojo.jpg"));
//        
//        matrizLogica[6][7]=false;
//        matrizBotones[6][7].setIcon(new ImageIcon("C:\\Users\\Joctan Esquivel\\Documents\\TEC\\Semestre II\\POO\\Proyecto2\\CatchTheCat\\src\\fotos\\rojo.jpg"));
//        
//        matrizLogica[7][7]=false;
//        matrizBotones[7][7].setIcon(new ImageIcon("C:\\Users\\Joctan Esquivel\\Documents\\TEC\\Semestre II\\POO\\Proyecto2\\CatchTheCat\\src\\fotos\\rojo.jpg"));
//        
//        matrizLogica[7][6]=false;
//        matrizBotones[7][6].setIcon(new ImageIcon("C:\\Users\\Joctan Esquivel\\Documents\\TEC\\Semestre II\\POO\\Proyecto2\\CatchTheCat\\src\\fotos\\rojo.jpg"));
//        
//        matrizLogica[7][5]=false;
//        matrizBotones[7][5].setIcon(new ImageIcon("C:\\Users\\Joctan Esquivel\\Documents\\TEC\\Semestre II\\POO\\Proyecto2\\CatchTheCat\\src\\fotos\\rojo.jpg"));
//        
//        matrizLogica[7][4]=false;
//        matrizBotones[7][4].setIcon(new ImageIcon("C:\\Users\\Joctan Esquivel\\Documents\\TEC\\Semestre II\\POO\\Proyecto2\\CatchTheCat\\src\\fotos\\rojo.jpg"));
//        
//        matrizLogica[7][3]=false;
//        matrizBotones[7][3].setIcon(new ImageIcon("C:\\Users\\Joctan Esquivel\\Documents\\TEC\\Semestre II\\POO\\Proyecto2\\CatchTheCat\\src\\fotos\\rojo.jpg"));
//        
//        matrizLogica[6][3]=false;
//        matrizBotones[6][3].setIcon(new ImageIcon("C:\\Users\\Joctan Esquivel\\Documents\\TEC\\Semestre II\\POO\\Proyecto2\\CatchTheCat\\src\\fotos\\rojo.jpg"));
//        
//        matrizLogica[5][3]=false;
//        matrizBotones[5][3].setIcon(new ImageIcon("C:\\Users\\Joctan Esquivel\\Documents\\TEC\\Semestre II\\POO\\Proyecto2\\CatchTheCat\\src\\fotos\\rojo.jpg"));
//        
//        matrizLogica[4][3]=false;
//        matrizBotones[4][3].setIcon(new ImageIcon("C:\\Users\\Joctan Esquivel\\Documents\\TEC\\Semestre II\\POO\\Proyecto2\\CatchTheCat\\src\\fotos\\rojo.jpg"));
        this.setTitle(jugadorActual.getNombreCompleto());
        this.tablero.setTxaInfoMomento(this.tablero.getTxaInfoMomento()+"\n"+jugadorActual.getNombreCompleto()+" está jugado Catch The Cat\n");
        
    }
    
    @Override
    public void ejecutar(Jugador jugadorActual){
        this.setVisible(true);
    }
    
    
    private void bloqueadorGenerico(int bloquear, int fila){
        int random = (int) (Math.random()*11);
        int anterior = random;
        for (; bloquear>0;){
            
            if (random!=anterior){
                //System.out.println(bloquear);
                matrizLogica[fila][random]=false;
                matrizBotones[fila][random].setIcon(new ImageIcon("C:\\Users\\Hewlett Packard\\Documents\\NetBeansProjects\\MarioParty\\src\\juegos\\CatchTheCat\\fotos\\rojo.jpg"));
                anterior = random;
                bloquear--;
                
            }else{
                random = (int) (Math.random()*11);
            }
        }
    }
    
    private void bloquearCasillas(){
        int cantidad0 = 3;
        int cantidad1 = 2;
        int cantidad2 = 3;
        int cantidad3 = 2;
        
        bloqueadorGenerico(1, 6);
        bloqueadorGenerico(1, 9);
        
        bloqueadorGenerico(2, 2);
        bloqueadorGenerico(2, 3);
        bloqueadorGenerico(2, 4);
        
        bloqueadorGenerico(3, 1);
        bloqueadorGenerico(3, 8);

    }
    
    
    
    public void creaTablero(){
        
        int cantidad0 = 3;
        int cantidad1 = 2;
        int cantidad2 = 3;
        int cantidad3 = 2;
        
        
      
        int contadorX= 100;
        int contadorY = 3;
        for (int i = 0; i < 11; i++){
            for (int j = 0; j < 11; j++){
                matrizBotones[i][j] = new JLabel();
                matrizLogica[i][j] = true;
                this.panel.add(matrizBotones[i][j]);
                matrizBotones[i][j].setBounds(contadorX, contadorY, 60, 60);
                //matrizBotones[i][j].setText("jeje");
                matrizBotones[i][j].setIcon(new ImageIcon("C:\\Users\\Hewlett Packard\\Documents\\NetBeansProjects\\MarioParty\\src\\juegos\\CatchTheCat\\fotos\\verde.jpg"));
                
                contadorX +=60;
                
              
            }
            contadorY +=60;
            contadorX =100;
        }
        this.panel.add(marioColita);
        marioColita.setIcon(new ImageIcon("C:\\Users\\Hewlett Packard\\Documents\\NetBeansProjects\\MarioParty\\src\\juegos\\CatchTheCat\\catchthecat\\fotos\\marioColita.png"));
        Point punto = matrizBotones[5][5].getLocation();
        marioColita.setBounds(punto.x, punto.y, 60, 60);
        pintaMario(punto);

    }
    
    public double distanciaEntrePuntos(Point punto1, Point punto2){
        double x1 = punto1.x; 
        double y1 = punto1.y; 
        double x2 = punto2.x; 
        double y2 = punto2.y; 
        
        return Math.sqrt(Math.pow(x2-x1, 2.0)+Math.pow(y2-y1, 2.0));
        
    }
    
    private int[] getPosicionMario(){
        for (int i = 0; i<11;i++){
            for (int j = 0; j<11;j++){
                if(marioColita.getLocation().equals(matrizBotones[i][j].getLocation())){
                    int[] punto = {i,j};
                    return punto;
                }
                }
        } 
        return null;
    }
    
    private boolean buscaDerecha(int fila, int columna){
        for (;columna<11;columna++){
            if(!matrizLogica[fila][columna]){
                return true;
            }
        }
        return false;
    }
    private boolean buscaIzquierda(int fila, int columna){
        for (;columna>-1;columna--){
            if(!matrizLogica[fila][columna]){
                return true;
            }
        }
        return false;
    }
    private boolean buscaAbajo(int fila, int columna){
        for (;fila<11;fila++){
            if(!matrizLogica[fila][columna]){
                return true;
            }
        }
        return false;
    }
    private boolean buscaArriba(int fila, int columna){
        for (;fila>-1;fila--){
            if(!matrizLogica[fila][columna]){
                return true;
            }
        }
        return false;
    }
    private boolean buscaDiagonalArribaDerecha(int fila, int columna){
        for (;fila>-1 & columna<11;){
            if(!matrizLogica[fila][columna]){
                return true;
            }
            fila--;
            columna++;
        }
        return false;
    }
    private boolean buscaDiagonalArribaIzquierda(int fila, int columna){
        for (;fila>-1 & columna>-1;){
            if(!matrizLogica[fila][columna]){
                return true;
            }
            fila--;
            columna--;
        }
        return false;
    }
    private boolean buscaDiagonalAbajoIzquierda(int fila, int columna){
        for (;fila<11 & columna>-1;){
            if(!matrizLogica[fila][columna]){
                return true;
            }
            fila++;
            columna--;
        }
        return false;
    }
    private boolean buscaDiagonalAbajoDerecha(int fila, int columna){
        for (;fila<11 & columna<11;){
            if(!matrizLogica[fila][columna]){
                return true;
            }
            fila++;
            columna++;
        }
        return false;
    }
    
    private void ganoGato(){
        int x = marioColita.getLocation().x;
        int y = marioColita.getLocation().y;
        if(x<100||x>759||y<0||y>660){
            SongThread sonido = new SongThread("risa.wav");
            sonido.start();
            JOptionPane.showMessageDialog(this, "LO SIENTO "+jugadorActual.getNombreCompleto().toUpperCase()+" HAS PERDIDO", "Juego Terminado", 2);
            jugadorActual.setPuedoAvanzar(false);
            this.dispose();
            //jButton1.doClick();
        }
    }
    
    private boolean encerradoCerca(){
        int[] marioPosicion = getPosicionMario();
        
        int fila = marioPosicion[0]; 
        int columna = marioPosicion[1]; 
        System.out.println(fila+" , "+columna);
        
        if(matrizLogica[fila][columna-1]){
            moverGato(1);
        }else if(matrizLogica[fila][columna+1]){
            moverGato(0);
        }else if(matrizLogica[fila+1][columna]){
            moverGato(2);
        }else if(matrizLogica[fila-1][columna]){
            moverGato(3);
        }else if(matrizLogica[fila-1][columna-1]){
            moverGato(6);
        }else if(matrizLogica[fila-1][columna+1]){
            moverGato(4);
        }else if(matrizLogica[fila+1][columna+1]){
            moverGato(5);
        }else if(matrizLogica[fila+1][columna-1]){
            moverGato(7);
        }else{
            return true;
        }
        
        return false;
        
        
    }
    

    
    public boolean estaEncerrado(){
        //Point ubicacion = this.marioColita.getLocation();
        int[] marioPosicion = getPosicionMario();
        int fila = marioPosicion[0]; 
        int columna = marioPosicion[1]; 
//        System.out.println("Derecha: "+buscaDerecha(fila, columna));
//        System.out.println("Izquierda: "+buscaIzquierda(fila, columna));
//        System.out.println("Abajo: "+buscaAbajo(fila, columna));
//        System.out.println("Arriba: "+buscaArriba(fila, columna));
//        System.out.println("Diagonal derecha arriba: "+buscaDiagonalArribaDerecha(fila, columna));
//        System.out.println("Diagonal derecha abajo: "+buscaDiagonalAbajoDerecha(fila, columna));
//        System.out.println("Diagonal izquierda arriba: "+buscaDiagonalArribaIzquierda(fila, columna));
//        System.out.println("Diagonal izquierda abajo: "+buscaDiagonalAbajoIzquierda(fila, columna));
        
        System.out.println("---------------------------------------------------");
        
        if(buscaDerecha(fila, columna)){
            if(buscaIzquierda(fila, columna)){
                if(buscaAbajo(fila, columna)){
                    if(buscaArriba(fila, columna)){
                        if(buscaDiagonalArribaDerecha(fila, columna)){
                            if(buscaDiagonalAbajoDerecha(fila, columna)){
                                if(buscaDiagonalArribaIzquierda(fila, columna)){
                                    if (buscaDiagonalAbajoIzquierda(fila, columna)){
                                        return true;
                                    }
                                    
                                }
                            }
                        }
                    }
                }
            }
        }
        
        return false;
                
        
        
        
    } 
    
    public Point buscaDiagonal(int id, int x, int y){
        switch (id){
            case 1:
               for (;x>0 & y<10;){
                    x--;
                    y++;
                    }
              
                return new Point(x,y);   
                
            case 2:
               for (;x<10 & y<10;){
                    x++;
                    y++;
                    }
              
                return new Point(x,y);   
            case 3:
               for (;x>0 & y>0;){
                    x--;
                    y--;
                    }
              
                return new Point(x,y);   
                
            case 4:
               for (;x<10 & y>0;){
                    x++;
                    y--;
                    }
              
                return new Point(x,y);   
        }
        return null;
        
        
    }
    
    private int puntoMasCercano(double[] array){
        double masPeque=20.0;
        int menor = 0;
        for (int i = 0 ; i<8;i++) {
            
            if (array[i]<masPeque){
                masPeque=array[i];
                menor=i;
            }
        }
        return menor;
    }
    
    public int logicaDelGato(){
       
        int[] marioPosicion = getPosicionMario();
        int fila = marioPosicion[0]; 
        int columna = marioPosicion[1]; 
        double[] posibilidades=new double[8];
        
        // d significa distancia        0                  1                2            3                           4                                        5                                      6                                             7
        //Posiciones del array [d.derecha , d.izquierda , d.abajo, d.arriba , d.diagonaArribaDerecha , d.diagonaAbajoDerecha , d.diagonaArribaIzquierda , d.diagonaAabajoIzquierda]
        
        if(!buscaDerecha(fila, columna)){
            posibilidades[0]=distanciaEntrePuntos(new Point(fila,columna), new Point(fila,10));
        }else{
            posibilidades[0]=15.0;
        }
       
        if(!buscaIzquierda(fila, columna)){
            posibilidades[1]=distanciaEntrePuntos(new Point(fila,columna), new Point(fila,0));
        }else{
            posibilidades[1]=15.0;
        }
        if(!buscaAbajo(fila, columna)){
            posibilidades[2]=distanciaEntrePuntos(new Point(fila,columna), new Point(10,columna));
        }else{
            posibilidades[2]=15.0;
        }
        if(!buscaArriba(fila, columna)){
            posibilidades[3]=distanciaEntrePuntos(new Point(fila,columna), new Point(0,columna));
        }else{
            posibilidades[3]=15.0;
        }
        
        if(!buscaDiagonalArribaDerecha(fila, columna)){
            Point diagonal = buscaDiagonal(1, fila, columna);
            posibilidades[4] = distanciaEntrePuntos(new Point(fila,columna), diagonal)/DIAGONAL_CUADRITO;
        }else{
            posibilidades[4]=15.0;
        }
        if(!buscaDiagonalAbajoDerecha(fila, columna)){
            Point diagonal = buscaDiagonal(2, fila, columna);
            posibilidades[5] = distanciaEntrePuntos(new Point(fila,columna), diagonal)/DIAGONAL_CUADRITO;
        }else{
            posibilidades[5] = 15.0;
        }
       if(!buscaDiagonalArribaIzquierda(fila, columna)){
            Point diagonal = buscaDiagonal(3, fila, columna);
            posibilidades[6] = distanciaEntrePuntos(new Point(fila,columna), diagonal)/DIAGONAL_CUADRITO;
       }else{
           posibilidades[6] = 15.0;
       }
       if (!buscaDiagonalAbajoIzquierda(fila, columna)){
           Point diagonal = buscaDiagonal(4, fila, columna);
            posibilidades[7] = distanciaEntrePuntos(new Point(fila,columna), diagonal)/DIAGONAL_CUADRITO;
       }else{
           posibilidades[7] = 15.0;
       }
       
       
       return puntoMasCercano(posibilidades);
    }
    private void pintaMario(Point nuevaPosicion){
        for (int k = 0; k<11;k++){
            for (int m = 0; m<11; m++){
                if (nuevaPosicion.equals(matrizBotones[k][m].getLocation())){
                    
                    matrizBotones[k][m].setIcon(new ImageIcon("C:\\Users\\Hewlett Packard\\Documents\\NetBeansProjects\\MarioParty\\src\\juegos\\CatchTheCat\\catchthecat\\fotos\\marioColita.png"));
                    }
                }
        }
                             
        
    }
    
    
    private void despintaMario(Point posicion){
        for (int k = 0; k<11;k++){
            for (int m = 0; m<11; m++){
                if (posicion.equals(matrizBotones[k][m].getLocation())){
                    matrizBotones[k][m].setIcon(new ImageIcon("C:\\Users\\Hewlett Packard\\Documents\\NetBeansProjects\\MarioParty\\src\\juegos\\CatchTheCat\\fotos\\verde.jpg"));
                    }
                }
        }
                             
        
    }
    
    
    
    
    private void moverGato(int direccion){
        Point fila = marioColita.getLocation();
        despintaMario(fila);
        //int columna = getPosicionMario()[0];
        switch (direccion){
            case 0:
                
                marioColita.setBounds(fila.x+60, fila.y, 60, 60);
                
                break;
            case 1:
                marioColita.setBounds(fila.x-60, fila.y, 60, 60);
                break;
                
            case 2:
                marioColita.setBounds(fila.x, fila.y+60, 60, 60);
                break;
            case 3:
                marioColita.setBounds(fila.x, fila.y-60, 60, 60);
                break;
                
            case 4:
                marioColita.setBounds(fila.x+60, fila.y-60, 60, 60);
                break;
                
            case 5:
                marioColita.setBounds(fila.x+60, fila.y+60, 60, 60);
                break; 
             case 6:
                marioColita.setBounds(fila.x-60, fila.y-60, 60, 60);
                break;
             
             case 7:
                marioColita.setBounds(fila.x-60, fila.y+60, 60, 60);
                break;
        }
        pintaMario(marioColita.getLocation());
        
          
          //marioColita.porFavorPonteAlFrente();
    }
    
    public void logicaJuego(){
        for (int i = 0; i<11;i++){
            for (int j = 0; j<11; j++){
                matrizBotones[i][j].addMouseListener(new MouseAdapter() {
                    @Override
                    public void mousePressed(MouseEvent evt){
                         for (int k = 0; k<11;k++){
                             for (int m = 0; m<11; m++){
                                 if(evt.getSource()==matrizBotones[k][m]){
                                     if (!marioColita.getLocation().equals(matrizBotones[k][m].getLocation())){
                                         if(matrizLogica[k][m]==true){
                                             
                                         
                                         
                                         matrizBotones[k][m].setIcon(new ImageIcon("C:\\Users\\Hewlett Packard\\Documents\\NetBeansProjects\\MarioParty\\src\\juegos\\CatchTheCat\\fotos\\rojo.jpg"));
                                         matrizLogica[k][m]=false;
                          
                                         
                                         //System.out.println(getPosicionMario()[0]+" -- "+getPosicionMario()[1]);
                                         
                                         
                                         if(!estaEncerrado()){
                                             
                                             moverGato(logicaDelGato());
                                             //System.out.println(marioColita.getLocation());
                                             
                                             
                                         }else{
                                             if(encerradoCerca()){
                                                JOptionPane.showMessageDialog(rootPane, "FELICIDADES "+jugadorActual.getNombreCompleto().toUpperCase()+", HAS ATRAPADO AL GATO", "Felicidades", 1);
                                                jugadorActual.setPuedoAvanzar(true);
                                                cierraVentana();
                                                
                                                
                                                if (jugadorActual.getCasillaActual() == 26 & jugadorActual.isPuedoAvanzar()){
                                                    new VentanaFinal(jugadorActual.getNombreCompleto()).setVisible(true);
                                                }
                                            }
                                             
                                             
                                             
                                         }
                                     
                                         ganoGato();
                                         }
                                         
                                    
                                        
                                    }
                                 }
                                     
                                 
                             }
                             
                         }
            
                    }
     
                });
            }
        }
    }
    
    private void cierraVentana(){
        this.dispose();
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 934, Short.MAX_VALUE)
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 675, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

//    /**
//     * 
//     * 
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
//            java.util.logging.Logger.getLogger(TableroGato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(TableroGato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(TableroGato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(TableroGato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new TableroGato().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel panel;
    // End of variables declaration//GEN-END:variables
}
