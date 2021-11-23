package juegos.MemoryPath.juegoMemory;

import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import juegos.Jugador;
import juegos.Tablero;
import juegos.iJuego;
import juegos.vtnFinal.VentanaFinal;

public class VentanaMemoryP extends javax.swing.JFrame implements iJuego{
    JPanel panelJuego;
    JLabel fondoJuego;
    Jugador jugadorActual;
    Tablero tablero;
    
    private static final int FILAS = 6;
    private static final int INTENTOS = 3;
    private int indiceMatriz = 0;
    private int intentos = 0;

    private int matrizBotones[][] = {{0, 0, 0}, {0, 0, 0}, {0, 0, 0},
    {0, 0, 0}, {0, 0, 0}, {0, 0, 0}};

    
    @Override
    public void ejecutar(Jugador jugadorActual){
        this.setVisible(true);
    }
    
    
    public VentanaMemoryP(Jugador jugadorActual, Tablero tablero) {    
        initComponents();
        this.jugadorActual = jugadorActual;
        this.tablero = tablero;
        creaJuegoMatriz();
        this.setTitle(jugadorActual.getNombreCompleto());
        this.tablero.setTxaInfoMomento(this.tablero.getTxaInfoMomento()+"\n"+jugadorActual.getNombreCompleto()+" está jugado Memory Path\n");
    }

    private void creaJuegoMatriz() {

        for (int i = 0; i < FILAS; i++) {
            int numero = (int) (Math.random() * 3);
            matrizBotones[i][numero] = 1;
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Casilla4x0 = new javax.swing.JButton();
        Casilla4x1 = new javax.swing.JButton();
        Casilla3x1 = new javax.swing.JButton();
        Casilla3x2 = new javax.swing.JButton();
        Casilla2x0 = new javax.swing.JButton();
        Casilla5x1 = new javax.swing.JButton();
        Casilla3x0 = new javax.swing.JButton();
        Casilla2x1 = new javax.swing.JButton();
        Casilla1x1 = new javax.swing.JButton();
        Casilla0x1 = new javax.swing.JButton();
        Casilla0x0 = new javax.swing.JButton();
        Casilla1x0 = new javax.swing.JButton();
        Casilla2x2 = new javax.swing.JButton();
        Casilla1x2 = new javax.swing.JButton();
        Casilla0x2 = new javax.swing.JButton();
        Casilla5x0 = new javax.swing.JButton();
        Casilla4x2 = new javax.swing.JButton();
        Casilla5x2 = new javax.swing.JButton();
        textoIntentos = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        mario = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);

        Casilla4x0.setIcon(new javax.swing.ImageIcon(getClass().getResource("/juegos/MemoryPath/icono/icono.png"))); // NOI18N
        Casilla4x0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Casilla4x0ActionPerformed(evt);
            }
        });

        Casilla4x1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/juegos/MemoryPath/icono/icono.png"))); // NOI18N
        Casilla4x1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Casilla4x1ActionPerformed(evt);
            }
        });

        Casilla3x1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/juegos/MemoryPath/icono/icono.png"))); // NOI18N
        Casilla3x1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Casilla3x1ActionPerformed(evt);
            }
        });

        Casilla3x2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/juegos/MemoryPath/icono/icono.png"))); // NOI18N
        Casilla3x2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Casilla3x2ActionPerformed(evt);
            }
        });

        Casilla2x0.setIcon(new javax.swing.ImageIcon(getClass().getResource("/juegos/MemoryPath/icono/icono.png"))); // NOI18N
        Casilla2x0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Casilla2x0ActionPerformed(evt);
            }
        });

        Casilla5x1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/juegos/MemoryPath/icono/icono.png"))); // NOI18N
        Casilla5x1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Casilla5x1ActionPerformed(evt);
            }
        });

        Casilla3x0.setIcon(new javax.swing.ImageIcon(getClass().getResource("/juegos/MemoryPath/icono/icono.png"))); // NOI18N
        Casilla3x0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Casilla3x0ActionPerformed(evt);
            }
        });

        Casilla2x1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/juegos/MemoryPath/icono/icono.png"))); // NOI18N
        Casilla2x1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Casilla2x1ActionPerformed(evt);
            }
        });

        Casilla1x1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/juegos/MemoryPath/icono/icono.png"))); // NOI18N
        Casilla1x1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Casilla1x1ActionPerformed(evt);
            }
        });

        Casilla0x1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/juegos/MemoryPath/icono/icono.png"))); // NOI18N
        Casilla0x1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Casilla0x1ActionPerformed(evt);
            }
        });

        Casilla0x0.setIcon(new javax.swing.ImageIcon(getClass().getResource("/juegos/MemoryPath/icono/icono.png"))); // NOI18N
        Casilla0x0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Casilla0x0ActionPerformed(evt);
            }
        });

        Casilla1x0.setIcon(new javax.swing.ImageIcon(getClass().getResource("/juegos/MemoryPath/icono/icono.png"))); // NOI18N
        Casilla1x0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Casilla1x0ActionPerformed(evt);
            }
        });

        Casilla2x2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/juegos/MemoryPath/icono/icono.png"))); // NOI18N
        Casilla2x2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Casilla2x2ActionPerformed(evt);
            }
        });

        Casilla1x2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/juegos/MemoryPath/icono/icono.png"))); // NOI18N
        Casilla1x2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Casilla1x2ActionPerformed(evt);
            }
        });

        Casilla0x2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/juegos/MemoryPath/icono/icono.png"))); // NOI18N
        Casilla0x2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Casilla0x2ActionPerformed(evt);
            }
        });

        Casilla5x0.setIcon(new javax.swing.ImageIcon(getClass().getResource("/juegos/MemoryPath/icono/icono.png"))); // NOI18N
        Casilla5x0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Casilla5x0ActionPerformed(evt);
            }
        });

        Casilla4x2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/juegos/MemoryPath/icono/icono.png"))); // NOI18N
        Casilla4x2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Casilla4x2ActionPerformed(evt);
            }
        });

        Casilla5x2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/juegos/MemoryPath/icono/icono.png"))); // NOI18N
        Casilla5x2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Casilla5x2ActionPerformed(evt);
            }
        });

        textoIntentos.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        textoIntentos.setText("Intentos: ");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/juegos/MemoryPath/imagenFondo/index.png"))); // NOI18N

        mario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/juegos/MemoryPath/imagenFondo/png-clipart-super-mario-bros-3-super-mario-world-mario-heroes-super-mario-bros.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(mario, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 73, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Casilla4x0, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Casilla4x1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Casilla4x2, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Casilla0x0, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Casilla0x1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Casilla0x2, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Casilla1x0, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Casilla1x1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Casilla1x2, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Casilla3x0, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Casilla3x1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Casilla2x0, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Casilla2x1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Casilla3x2, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Casilla2x2, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Casilla5x0, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Casilla5x1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Casilla5x2, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)
                        .addComponent(textoIntentos)))
                .addGap(87, 87, 87))
            .addGroup(layout.createSequentialGroup()
                .addGap(240, 240, 240)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Casilla5x0, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Casilla5x1, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Casilla5x2, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textoIntentos))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Casilla4x1, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Casilla4x0, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Casilla3x0, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Casilla3x1, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Casilla3x2, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Casilla2x0, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Casilla2x1, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Casilla2x2, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Casilla1x0, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Casilla1x1, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Casilla1x2, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Casilla0x0, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Casilla0x1, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Casilla0x2, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(Casilla4x2, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mario, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Casilla4x0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Casilla4x0ActionPerformed
        if (indiceMatriz == 4) {
            if (matrizBotones[4][0] == 1) {
                mario.setLocation(Casilla4x0.getLocation());
                indiceMatriz++;
            } else {
                Casilla0x0.setBackground(null);
                Casilla0x1.setBackground(null);
                Casilla0x2.setBackground(null);

                Casilla1x0.setBackground(null);
                Casilla1x1.setBackground(null);
                Casilla1x2.setBackground(null);

                Casilla2x0.setBackground(null);
                Casilla2x1.setBackground(null);
                Casilla2x2.setBackground(null);

                Casilla3x0.setBackground(null);
                Casilla3x1.setBackground(null);
                Casilla3x2.setBackground(null);

                Casilla4x0.setBackground(null);
                Casilla4x1.setBackground(null);
                Casilla4x2.setBackground(null);

                Casilla5x0.setBackground(null);
                Casilla5x1.setBackground(null);
                Casilla5x2.setBackground(null);

                intentos++;
                if (intentos > INTENTOS) {
                    JOptionPane.showMessageDialog(null, "LO SENTIMOS "+jugadorActual.getNombreCompleto().toUpperCase()+", HAS PERDIDO :( ");
                    jugadorActual.setPuedoAvanzar(false);
                    this.dispose();                    
                } else {
                    textoIntentos.setText("Intentos: " + intentos);
                    indiceMatriz = 0;

                }
            }
        }
    }//GEN-LAST:event_Casilla4x0ActionPerformed

    private void Casilla0x1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Casilla0x1ActionPerformed
        if (indiceMatriz == 0) {
            if (matrizBotones[0][1] == 1) {
                mario.setLocation(Casilla0x1.getLocation());
                indiceMatriz++;
            } else {
                Casilla0x0.setBackground(null);
                Casilla0x1.setBackground(null);
                Casilla0x2.setBackground(null);

                Casilla1x0.setBackground(null);
                Casilla1x1.setBackground(null);
                Casilla1x2.setBackground(null);

                Casilla2x0.setBackground(null);
                Casilla2x1.setBackground(null);
                Casilla2x2.setBackground(null);

                Casilla3x0.setBackground(null);
                Casilla3x1.setBackground(null);
                Casilla3x2.setBackground(null);

                Casilla4x0.setBackground(null);
                Casilla4x1.setBackground(null);
                Casilla4x2.setBackground(null);

                Casilla5x0.setBackground(null);
                Casilla5x1.setBackground(null);
                Casilla5x2.setBackground(null);

                intentos++;
                if (intentos > INTENTOS) {
                    JOptionPane.showMessageDialog(null, "LO SENTIMOS "+jugadorActual.getNombreCompleto().toUpperCase()+", HAS PERDIDO :( ");
                    jugadorActual.setPuedoAvanzar(false);
                    this.dispose();                    
                } else {
                    textoIntentos.setText("Intentos: " + intentos);
                    indiceMatriz = 0;

                }
            }
        }
    }//GEN-LAST:event_Casilla0x1ActionPerformed

    private void Casilla0x0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Casilla0x0ActionPerformed

        if (indiceMatriz == 0) {
            if (matrizBotones[0][0] == 1) {
                mario.setLocation(Casilla0x0.getLocation());
                indiceMatriz++;
            } else {
                Casilla0x0.setBackground(null);
                Casilla0x1.setBackground(null);
                Casilla0x2.setBackground(null);

                Casilla1x0.setBackground(null);
                Casilla1x1.setBackground(null);
                Casilla1x2.setBackground(null);

                Casilla2x0.setBackground(null);
                Casilla2x1.setBackground(null);
                Casilla2x2.setBackground(null);

                Casilla3x0.setBackground(null);
                Casilla3x1.setBackground(null);
                Casilla3x2.setBackground(null);

                Casilla4x0.setBackground(null);
                Casilla4x1.setBackground(null);
                Casilla4x2.setBackground(null);

                Casilla5x0.setBackground(null);
                Casilla5x1.setBackground(null);
                Casilla5x2.setBackground(null);

                intentos++;
                if (intentos > INTENTOS) {
                    JOptionPane.showMessageDialog(null, "LO SENTIMOS "+jugadorActual.getNombreCompleto().toUpperCase()+", HAS PERDIDO :( ");
                    jugadorActual.setPuedoAvanzar(false);
                    this.dispose();                    
                } else {
                    textoIntentos.setText("Intentos: " + intentos);
                    indiceMatriz = 0;

                }

            }
        }
    }//GEN-LAST:event_Casilla0x0ActionPerformed

    private void Casilla0x2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Casilla0x2ActionPerformed
        if (indiceMatriz == 0) {
            if (matrizBotones[0][2] == 1) {
                mario.setLocation(Casilla0x2.getLocation());
                indiceMatriz++;
            } else {
                Casilla0x0.setBackground(null);
                Casilla0x1.setBackground(null);
                Casilla0x2.setBackground(null);

                Casilla1x0.setBackground(null);
                Casilla1x1.setBackground(null);
                Casilla1x2.setBackground(null);

                Casilla2x0.setBackground(null);
                Casilla2x1.setBackground(null);
                Casilla2x2.setBackground(null);

                Casilla3x0.setBackground(null);
                Casilla3x1.setBackground(null);
                Casilla3x2.setBackground(null);

                Casilla4x0.setBackground(null);
                Casilla4x1.setBackground(null);
                Casilla4x2.setBackground(null);

                Casilla5x0.setBackground(null);
                Casilla5x1.setBackground(null);
                Casilla5x2.setBackground(null);

                intentos++;
                if (intentos > INTENTOS) {
                    JOptionPane.showMessageDialog(null, "LO SENTIMOS "+jugadorActual.getNombreCompleto().toUpperCase()+", HAS PERDIDO :( ");
                    jugadorActual.setPuedoAvanzar(false);
                    this.dispose();                    
                } else {
                    textoIntentos.setText("Intentos: " + intentos);
                    indiceMatriz = 0;

                }
            }
        }
    }//GEN-LAST:event_Casilla0x2ActionPerformed

    private void Casilla1x0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Casilla1x0ActionPerformed
        if (indiceMatriz == 1) {
            if (matrizBotones[1][0] == 1) {
                mario.setLocation(Casilla1x0.getLocation());
                indiceMatriz++;
            } else {
                Casilla0x0.setBackground(null);
                Casilla0x1.setBackground(null);
                Casilla0x2.setBackground(null);

                Casilla1x0.setBackground(null);
                Casilla1x1.setBackground(null);
                Casilla1x2.setBackground(null);

                Casilla2x0.setBackground(null);
                Casilla2x1.setBackground(null);
                Casilla2x2.setBackground(null);

                Casilla3x0.setBackground(null);
                Casilla3x1.setBackground(null);
                Casilla3x2.setBackground(null);

                Casilla4x0.setBackground(null);
                Casilla4x1.setBackground(null);
                Casilla4x2.setBackground(null);

                Casilla5x0.setBackground(null);
                Casilla5x1.setBackground(null);
                Casilla5x2.setBackground(null);

                intentos++;
                if (intentos > INTENTOS) {
                    JOptionPane.showMessageDialog(null, "LO SENTIMOS "+jugadorActual.getNombreCompleto().toUpperCase()+", HAS PERDIDO :( ");
                    jugadorActual.setPuedoAvanzar(false);
                    this.dispose();                    
                } else {
                    textoIntentos.setText("Intentos: " + intentos);
                    indiceMatriz = 0;

                }
            }
        }
    }//GEN-LAST:event_Casilla1x0ActionPerformed

    private void Casilla1x1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Casilla1x1ActionPerformed
        if (indiceMatriz == 1) {
            if (matrizBotones[1][1] == 1) {
                mario.setLocation(Casilla1x1.getLocation());
                indiceMatriz++;
            } else {
                Casilla0x0.setBackground(null);
                Casilla0x1.setBackground(null);
                Casilla0x2.setBackground(null);

                Casilla1x0.setBackground(null);
                Casilla1x1.setBackground(null);
                Casilla1x2.setBackground(null);

                Casilla2x0.setBackground(null);
                Casilla2x1.setBackground(null);
                Casilla2x2.setBackground(null);

                Casilla3x0.setBackground(null);
                Casilla3x1.setBackground(null);
                Casilla3x2.setBackground(null);

                Casilla4x0.setBackground(null);
                Casilla4x1.setBackground(null);
                Casilla4x2.setBackground(null);

                Casilla5x0.setBackground(null);
                Casilla5x1.setBackground(null);
                Casilla5x2.setBackground(null);

                intentos++;
                if (intentos > INTENTOS) {
                    JOptionPane.showMessageDialog(null, "LO SENTIMOS "+jugadorActual.getNombreCompleto().toUpperCase()+", HAS PERDIDO :( ");
                    jugadorActual.setPuedoAvanzar(false);
                    this.dispose();                    
                } else {
                    textoIntentos.setText("Intentos: " + intentos);
                    indiceMatriz = 0;

                }
            }
        }
    }//GEN-LAST:event_Casilla1x1ActionPerformed

    private void Casilla1x2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Casilla1x2ActionPerformed
        if (indiceMatriz == 1) {
            if (matrizBotones[1][2] == 1) {
                mario.setLocation(Casilla1x2.getLocation());
                indiceMatriz++;
            } else {
                Casilla0x0.setBackground(null);
                Casilla0x1.setBackground(null);
                Casilla0x2.setBackground(null);

                Casilla1x0.setBackground(null);
                Casilla1x1.setBackground(null);
                Casilla1x2.setBackground(null);

                Casilla2x0.setBackground(null);
                Casilla2x1.setBackground(null);
                Casilla2x2.setBackground(null);

                Casilla3x0.setBackground(null);
                Casilla3x1.setBackground(null);
                Casilla3x2.setBackground(null);

                Casilla4x0.setBackground(null);
                Casilla4x1.setBackground(null);
                Casilla4x2.setBackground(null);

                Casilla5x0.setBackground(null);
                Casilla5x1.setBackground(null);
                Casilla5x2.setBackground(null);

                intentos++;
                if (intentos > INTENTOS) {
                    JOptionPane.showMessageDialog(null, "LO SENTIMOS "+jugadorActual.getNombreCompleto().toUpperCase()+", HAS PERDIDO :( ");
                    jugadorActual.setPuedoAvanzar(false);
                    this.dispose();                    
                } else {
                    textoIntentos.setText("Intentos: " + intentos);
                    indiceMatriz = 0;

                }
            }
        }
    }//GEN-LAST:event_Casilla1x2ActionPerformed

    private void Casilla2x0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Casilla2x0ActionPerformed
        if (indiceMatriz == 2) {
            if (matrizBotones[2][0] == 1) {
                mario.setLocation(Casilla2x0.getLocation());
                indiceMatriz++;
            } else {
                Casilla0x0.setBackground(null);
                Casilla0x1.setBackground(null);
                Casilla0x2.setBackground(null);

                Casilla1x0.setBackground(null);
                Casilla1x1.setBackground(null);
                Casilla1x2.setBackground(null);

                Casilla2x0.setBackground(null);
                Casilla2x1.setBackground(null);
                Casilla2x2.setBackground(null);

                Casilla3x0.setBackground(null);
                Casilla3x1.setBackground(null);
                Casilla3x2.setBackground(null);

                Casilla4x0.setBackground(null);
                Casilla4x1.setBackground(null);
                Casilla4x2.setBackground(null);

                Casilla5x0.setBackground(null);
                Casilla5x1.setBackground(null);
                Casilla5x2.setBackground(null);

                intentos++;
                if (intentos > INTENTOS) {
                    JOptionPane.showMessageDialog(null, "LO SENTIMOS "+jugadorActual.getNombreCompleto().toUpperCase()+", HAS PERDIDO :( ");
                    jugadorActual.setPuedoAvanzar(false);
                    this.dispose();                    
                } else {
                    textoIntentos.setText("Intentos: " + intentos);
                    indiceMatriz = 0;

                }
            }
        }
    }//GEN-LAST:event_Casilla2x0ActionPerformed

    private void Casilla2x1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Casilla2x1ActionPerformed
        if (indiceMatriz == 2) {
            if (matrizBotones[2][1] == 1) {
                mario.setLocation(Casilla2x1.getLocation());
                indiceMatriz++;
            } else {
                Casilla0x0.setBackground(null);
                Casilla0x1.setBackground(null);
                Casilla0x2.setBackground(null);

                Casilla1x0.setBackground(null);
                Casilla1x1.setBackground(null);
                Casilla1x2.setBackground(null);

                Casilla2x0.setBackground(null);
                Casilla2x1.setBackground(null);
                Casilla2x2.setBackground(null);

                Casilla3x0.setBackground(null);
                Casilla3x1.setBackground(null);
                Casilla3x2.setBackground(null);

                Casilla4x0.setBackground(null);
                Casilla4x1.setBackground(null);
                Casilla4x2.setBackground(null);

                Casilla5x0.setBackground(null);
                Casilla5x1.setBackground(null);
                Casilla5x2.setBackground(null);

                intentos++;
                if (intentos > INTENTOS) {
                    JOptionPane.showMessageDialog(null, "LO SENTIMOS "+jugadorActual.getNombreCompleto().toUpperCase()+", HAS PERDIDO :( ");
                    jugadorActual.setPuedoAvanzar(false);
                    this.dispose();                    
                } else {
                    textoIntentos.setText("Intentos: " + intentos);
                    indiceMatriz = 0;

                }
            }
        }
    }//GEN-LAST:event_Casilla2x1ActionPerformed

    private void Casilla2x2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Casilla2x2ActionPerformed
        if (indiceMatriz == 2) {
            if (matrizBotones[2][2] == 1) {
                mario.setLocation(Casilla2x2.getLocation());
                indiceMatriz++;
            } else {
                Casilla0x0.setBackground(null);
                Casilla0x1.setBackground(null);
                Casilla0x2.setBackground(null);

                Casilla1x0.setBackground(null);
                Casilla1x1.setBackground(null);
                Casilla1x2.setBackground(null);

                Casilla2x0.setBackground(null);
                Casilla2x1.setBackground(null);
                Casilla2x2.setBackground(null);

                Casilla3x0.setBackground(null);
                Casilla3x1.setBackground(null);
                Casilla3x2.setBackground(null);

                Casilla4x0.setBackground(null);
                Casilla4x1.setBackground(null);
                Casilla4x2.setBackground(null);

                Casilla5x0.setBackground(null);
                Casilla5x1.setBackground(null);
                Casilla5x2.setBackground(null);

                intentos++;
                if (intentos > INTENTOS) {
                    JOptionPane.showMessageDialog(null, "LO SENTIMOS "+jugadorActual.getNombreCompleto().toUpperCase()+", HAS PERDIDO :( ");
                    jugadorActual.setPuedoAvanzar(false);
                    this.dispose();               
                } else {
                    textoIntentos.setText("Intentos: " + intentos);
                    indiceMatriz = 0;

                }
            }
        }
    }//GEN-LAST:event_Casilla2x2ActionPerformed

    private void Casilla3x0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Casilla3x0ActionPerformed
        if (indiceMatriz == 3) {
            if (matrizBotones[3][0] == 1) {
                mario.setLocation(Casilla3x0.getLocation());
                indiceMatriz++;
            } else {
                Casilla0x0.setBackground(null);
                Casilla0x1.setBackground(null);
                Casilla0x2.setBackground(null);

                Casilla1x0.setBackground(null);
                Casilla1x1.setBackground(null);
                Casilla1x2.setBackground(null);

                Casilla2x0.setBackground(null);
                Casilla2x1.setBackground(null);
                Casilla2x2.setBackground(null);

                Casilla3x0.setBackground(null);
                Casilla3x1.setBackground(null);
                Casilla3x2.setBackground(null);

                Casilla4x0.setBackground(null);
                Casilla4x1.setBackground(null);
                Casilla4x2.setBackground(null);

                Casilla5x0.setBackground(null);
                Casilla5x1.setBackground(null);
                Casilla5x2.setBackground(null);

                intentos++;
                if (intentos > INTENTOS) {
                    JOptionPane.showMessageDialog(null, "LO SENTIMOS "+jugadorActual.getNombreCompleto().toUpperCase()+", HAS PERDIDO :( ");
                    jugadorActual.setPuedoAvanzar(false);
                    this.dispose();                
                } else {
                    textoIntentos.setText("Intentos: " + intentos);
                    indiceMatriz = 0;

                }
            }
        }
    }//GEN-LAST:event_Casilla3x0ActionPerformed

    private void Casilla3x1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Casilla3x1ActionPerformed
        if (indiceMatriz == 3) {
            if (matrizBotones[3][1] == 1) {
                mario.setLocation(Casilla3x1.getLocation());
                indiceMatriz++;
            } else {
                Casilla0x0.setBackground(null);
                Casilla0x1.setBackground(null);
                Casilla0x2.setBackground(null);

                Casilla1x0.setBackground(null);
                Casilla1x1.setBackground(null);
                Casilla1x2.setBackground(null);

                Casilla2x0.setBackground(null);
                Casilla2x1.setBackground(null);
                Casilla2x2.setBackground(null);

                Casilla3x0.setBackground(null);
                Casilla3x1.setBackground(null);
                Casilla3x2.setBackground(null);

                Casilla4x0.setBackground(null);
                Casilla4x1.setBackground(null);
                Casilla4x2.setBackground(null);

                Casilla5x0.setBackground(null);
                Casilla5x1.setBackground(null);
                Casilla5x2.setBackground(null);

                intentos++;
                if (intentos > INTENTOS) {
                    JOptionPane.showMessageDialog(null, "LO SENTIMOS "+jugadorActual.getNombreCompleto().toUpperCase()+", HAS PERDIDO :( ");
                    jugadorActual.setPuedoAvanzar(false);
                    this.dispose();                
                } else {
                    textoIntentos.setText("Intentos: " + intentos);
                    indiceMatriz = 0;

                }
            }
        }
    }//GEN-LAST:event_Casilla3x1ActionPerformed

    private void Casilla3x2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Casilla3x2ActionPerformed
        if (indiceMatriz == 3) {
            if (matrizBotones[3][2] == 1) {
                mario.setLocation(Casilla3x2.getLocation());
                indiceMatriz++;
            } else {
                Casilla0x0.setBackground(null);
                Casilla0x1.setBackground(null);
                Casilla0x2.setBackground(null);

                Casilla1x0.setBackground(null);
                Casilla1x1.setBackground(null);
                Casilla1x2.setBackground(null);

                Casilla2x0.setBackground(null);
                Casilla2x1.setBackground(null);
                Casilla2x2.setBackground(null);

                Casilla3x0.setBackground(null);
                Casilla3x1.setBackground(null);
                Casilla3x2.setBackground(null);

                Casilla4x0.setBackground(null);
                Casilla4x1.setBackground(null);
                Casilla4x2.setBackground(null);

                Casilla5x0.setBackground(null);
                Casilla5x1.setBackground(null);
                Casilla5x2.setBackground(null);

                intentos++;
                if (intentos > INTENTOS) {
                    JOptionPane.showMessageDialog(null, "LO SENTIMOS "+jugadorActual.getNombreCompleto().toUpperCase()+", HAS PERDIDO :( ");
                    jugadorActual.setPuedoAvanzar(false);
                    this.dispose();               
                } else {
                    textoIntentos.setText("Intentos: " + intentos);
                    indiceMatriz = 0;

                }
            }
        }
    }//GEN-LAST:event_Casilla3x2ActionPerformed

    private void Casilla4x1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Casilla4x1ActionPerformed
        if (indiceMatriz == 4) {
            if (matrizBotones[4][1] == 1) {
                mario.setLocation(Casilla4x1.getLocation());
                indiceMatriz++;
            } else {
                Casilla0x0.setBackground(null);
                Casilla0x1.setBackground(null);
                Casilla0x2.setBackground(null);

                Casilla1x0.setBackground(null);
                Casilla1x1.setBackground(null);
                Casilla1x2.setBackground(null);

                Casilla2x0.setBackground(null);
                Casilla2x1.setBackground(null);
                Casilla2x2.setBackground(null);

                Casilla3x0.setBackground(null);
                Casilla3x1.setBackground(null);
                Casilla3x2.setBackground(null);

                Casilla4x0.setBackground(null);
                Casilla4x1.setBackground(null);
                Casilla4x2.setBackground(null);

                Casilla5x0.setBackground(null);
                Casilla5x1.setBackground(null);
                Casilla5x2.setBackground(null);

                intentos++;
                if (intentos > INTENTOS) {
                    JOptionPane.showMessageDialog(null, "LO SENTIMOS "+jugadorActual.getNombreCompleto().toUpperCase()+", HAS PERDIDO :( ");
                    jugadorActual.setPuedoAvanzar(false);
                    this.dispose();                    
                } else {
                    textoIntentos.setText("Intentos: " + intentos);
                    indiceMatriz = 0;

                }
            }
        }
    }//GEN-LAST:event_Casilla4x1ActionPerformed

    private void Casilla4x2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Casilla4x2ActionPerformed
        if (indiceMatriz == 4) {
            if (matrizBotones[4][2] == 1) {
                mario.setLocation(Casilla4x2.getLocation());
                indiceMatriz++;
            } else {
                Casilla0x0.setBackground(null);
                Casilla0x1.setBackground(null);
                Casilla0x2.setBackground(null);

                Casilla1x0.setBackground(null);
                Casilla1x1.setBackground(null);
                Casilla1x2.setBackground(null);

                Casilla2x0.setBackground(null);
                Casilla2x1.setBackground(null);
                Casilla2x2.setBackground(null);

                Casilla3x0.setBackground(null);
                Casilla3x1.setBackground(null);
                Casilla3x2.setBackground(null);

                Casilla4x0.setBackground(null);
                Casilla4x1.setBackground(null);
                Casilla4x2.setBackground(null);

                Casilla5x0.setBackground(null);
                Casilla5x1.setBackground(null);
                Casilla5x2.setBackground(null);

                intentos++;
                if (intentos > INTENTOS) {
                    JOptionPane.showMessageDialog(null, "LO SENTIMOS "+jugadorActual.getNombreCompleto().toUpperCase()+", HAS PERDIDO :( ");
                    jugadorActual.setPuedoAvanzar(false);
                    this.dispose();
                } else {
                    textoIntentos.setText("Intentos: " + intentos);
                    indiceMatriz = 0;

                }
            }
        }
    }//GEN-LAST:event_Casilla4x2ActionPerformed

    private void Casilla5x0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Casilla5x0ActionPerformed
        if (indiceMatriz == 5) {
            if (matrizBotones[5][0] == 1) {
                mario.setLocation(Casilla5x0.getLocation());
                indiceMatriz++;
                JOptionPane.showMessageDialog(null, "FELICITACIONES "+jugadorActual.getNombreCompleto().toUpperCase()+", HAS GANADO :) ");
                jugadorActual.setPuedoAvanzar(true);
                
                if (jugadorActual.getCasillaActual() == 26 & jugadorActual.isPuedoAvanzar()) {
                    new VentanaFinal(jugadorActual.getNombreCompleto()).setVisible(true);
                }
                this.dispose();
                
                
            } else {
                Casilla0x0.setBackground(null);
                Casilla0x1.setBackground(null);
                Casilla0x2.setBackground(null);

                Casilla1x0.setBackground(null);
                Casilla1x1.setBackground(null);
                Casilla1x2.setBackground(null);

                Casilla2x0.setBackground(null);
                Casilla2x1.setBackground(null);
                Casilla2x2.setBackground(null);

                Casilla3x0.setBackground(null);
                Casilla3x1.setBackground(null);
                Casilla3x2.setBackground(null);

                Casilla4x0.setBackground(null);
                Casilla4x1.setBackground(null);
                Casilla4x2.setBackground(null);

                Casilla5x0.setBackground(null);
                Casilla5x1.setBackground(null);
                Casilla5x2.setBackground(null);

                intentos++;
                if (intentos > INTENTOS) {
                    JOptionPane.showMessageDialog(null, "LO SENTIMOS "+jugadorActual.getNombreCompleto().toUpperCase()+", HAS PERDIDO :( ");
                    jugadorActual.setPuedoAvanzar(false);
                    this.dispose();
                } else {
                    textoIntentos.setText("Intentos: " + intentos);
                    indiceMatriz = 0;

                }
            }
        }
    }//GEN-LAST:event_Casilla5x0ActionPerformed

    private void Casilla5x1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Casilla5x1ActionPerformed
        if (indiceMatriz == 5) {
            if (matrizBotones[5][1] == 1) {
                mario.setLocation(Casilla5x1.getLocation());
                indiceMatriz++;
                JOptionPane.showMessageDialog(null, "FELICITACIONES "+jugadorActual.getNombreCompleto().toUpperCase()+", HAS GANADO :) ");
                jugadorActual.setPuedoAvanzar(true);
                if (jugadorActual.getCasillaActual() == 26 & jugadorActual.isPuedoAvanzar()) {
                    new VentanaFinal(jugadorActual.getNombreCompleto()).setVisible(true);
                }
                this.dispose();
            } else {
                Casilla0x0.setBackground(null);
                Casilla0x1.setBackground(null);
                Casilla0x2.setBackground(null);

                Casilla1x0.setBackground(null);
                Casilla1x1.setBackground(null);
                Casilla1x2.setBackground(null);

                Casilla2x0.setBackground(null);
                Casilla2x1.setBackground(null);
                Casilla2x2.setBackground(null);

                Casilla3x0.setBackground(null);
                Casilla3x1.setBackground(null);
                Casilla3x2.setBackground(null);

                Casilla4x0.setBackground(null);
                Casilla4x1.setBackground(null);
                Casilla4x2.setBackground(null);

                Casilla5x0.setBackground(null);
                Casilla5x1.setBackground(null);
                Casilla5x2.setBackground(null);

                intentos++;
                if (intentos > INTENTOS) {
                    JOptionPane.showMessageDialog(null, "LO SENTIMOS "+jugadorActual.getNombreCompleto().toUpperCase()+", HAS PERDIDO :( ");
                    jugadorActual.setPuedoAvanzar(false);
                    this.dispose();
                } else {
                    textoIntentos.setText("Intentos: " + intentos);
                    indiceMatriz = 0;

                }
            }
        }
    }//GEN-LAST:event_Casilla5x1ActionPerformed

    private void Casilla5x2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Casilla5x2ActionPerformed
        if (indiceMatriz == 5) {
            if (matrizBotones[5][2] == 1) {
                mario.setLocation(Casilla5x2.getLocation());
                indiceMatriz++;
                JOptionPane.showMessageDialog(null, "FELICITACIONES "+jugadorActual.getNombreCompleto().toUpperCase()+", HAS GANADO :) ");
                jugadorActual.setPuedoAvanzar(true);
                if (jugadorActual.getCasillaActual() == 26 & jugadorActual.isPuedoAvanzar()) {
                    new VentanaFinal(jugadorActual.getNombreCompleto()).setVisible(true);
                }
                this.dispose();

            } else {
                Casilla0x0.setBackground(null);
                Casilla0x1.setBackground(null);
                Casilla0x2.setBackground(null);

                Casilla1x0.setBackground(null);
                Casilla1x1.setBackground(null);
                Casilla1x2.setBackground(null);

                Casilla2x0.setBackground(null);
                Casilla2x1.setBackground(null);
                Casilla2x2.setBackground(null);

                Casilla3x0.setBackground(null);
                Casilla3x1.setBackground(null);
                Casilla3x2.setBackground(null);

                Casilla4x0.setBackground(null);
                Casilla4x1.setBackground(null);
                Casilla4x2.setBackground(null);

                Casilla5x0.setBackground(null);
                Casilla5x1.setBackground(null);
                Casilla5x2.setBackground(null);

                intentos++;
                if (intentos > INTENTOS) {
                    JOptionPane.showMessageDialog(null, "LO SENTIMOS "+jugadorActual.getNombreCompleto().toUpperCase()+", HAS PERDIDO :( ");
                    jugadorActual.setPuedoAvanzar(false);
                    this.dispose();
                } else {
                    textoIntentos.setText("Intentos: " + intentos);
                    indiceMatriz = 0;
                }
            }
        }
    }//GEN-LAST:event_Casilla5x2ActionPerformed

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
//            java.util.logging.Logger.getLogger(VentanaMemoryP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(VentanaMemoryP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(VentanaMemoryP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(VentanaMemoryP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//        //</editor-fold>
//        //</editor-fold>
//        //</editor-fold>
//        //</editor-fold>
//        //</editor-fold>
//        //</editor-fold>
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new VentanaMemoryP().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Casilla0x0;
    private javax.swing.JButton Casilla0x1;
    private javax.swing.JButton Casilla0x2;
    private javax.swing.JButton Casilla1x0;
    private javax.swing.JButton Casilla1x1;
    private javax.swing.JButton Casilla1x2;
    private javax.swing.JButton Casilla2x0;
    private javax.swing.JButton Casilla2x1;
    private javax.swing.JButton Casilla2x2;
    private javax.swing.JButton Casilla3x0;
    private javax.swing.JButton Casilla3x1;
    private javax.swing.JButton Casilla3x2;
    private javax.swing.JButton Casilla4x0;
    private javax.swing.JButton Casilla4x1;
    private javax.swing.JButton Casilla4x2;
    private javax.swing.JButton Casilla5x0;
    private javax.swing.JButton Casilla5x1;
    private javax.swing.JButton Casilla5x2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel mario;
    private javax.swing.JLabel textoIntentos;
    // End of variables declaration//GEN-END:variables
}
