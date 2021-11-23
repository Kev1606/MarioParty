package juegos.MemoryCard.juegoMemoryCard;

import juegos.Jugador;
import juegos.Tablero;
import juegos.iJuego;

public class VentanaJuego extends javax.swing.JFrame implements iJuego{
    JuegoMemory juegoInicio;

    public VentanaJuego(Jugador jugadorActual, Tablero tablero) {
        initComponents();
        juegoInicio = new JuegoMemory(this,jugadorActual,tablero);
    }
    
    @Override
    public void ejecutar(Jugador jugadorActual){
        this.setVisible(true);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MemoryCard");
        setResizable(false);
        setSize(new java.awt.Dimension(1024, 768));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 712, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 611, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
