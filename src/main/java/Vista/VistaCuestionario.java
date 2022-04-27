package Vista;

import Controlador.CategoriasController;
import Controlador.JugadorController;
import Controlador.OpcionesController;
import Controlador.PreguntaController;
import Controlador.PremioController;
import Controlador.RondaController;
import Modelo.Categoria;
import Modelo.Opcion;
import Modelo.Pregunta;
import Modelo.Premio;
import Modelo.Ronda;
import java.awt.Color;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Alvaro José Tobar Mayorquín
 */
public class VistaCuestionario extends javax.swing.JFrame {

    private int ronda = 1;
    private int acomulado = 0;
    private int premioActual = 0;

    // Controladores
    private OpcionesController oController = new OpcionesController();
    private CategoriasController cController = new CategoriasController();
    private PreguntaController pController = new PreguntaController();
    private RondaController rController = new RondaController();
    private PremioController prController = new PremioController();
    private JugadorController jController = new JugadorController();

    // Arreglos
    private Pregunta preguntas[] = new Pregunta[5];
    Opcion opciones[] = new Opcion[4];

    public VistaCuestionario() {
        initComponents();

        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setTitle("¿Te la sabes?");
        this.lblRonda.setText("Ronda N°" + Integer.toString(ronda));
        this.lblAcomulado.setText("Tus puntos: " + acomulado);
        mostrarPregunta();
        obtenerPremio();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblAcomulado = new javax.swing.JLabel();
        lblCategoria = new javax.swing.JLabel();
        lblRonda = new javax.swing.JLabel();
        lblPregunta = new javax.swing.JLabel();
        opcionB = new javax.swing.JButton();
        opcionA = new javax.swing.JButton();
        opcionC = new javax.swing.JButton();
        opcionD = new javax.swing.JButton();
        btnRendicion = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        lblAcomulado.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblAcomulado.setForeground(new java.awt.Color(255, 50, 78));
        lblAcomulado.setText("Tus puntos: 0");

        lblCategoria.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblCategoria.setForeground(new java.awt.Color(96, 151, 253));
        lblCategoria.setText("Nivel básico");

        lblRonda.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblRonda.setForeground(new java.awt.Color(204, 204, 204));
        lblRonda.setText("Ronda N°1");

        lblPregunta.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblPregunta.setForeground(new java.awt.Color(102, 102, 102));
        lblPregunta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPregunta.setText("¿Qué término es el correcto para referirse a la transfomación del estado sólido a gaseoso?");

        opcionB.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        opcionB.setText("B) Condensación");
        opcionB.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        opcionB.setFocusPainted(false);
        opcionB.setFocusable(false);
        opcionB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcionBActionPerformed(evt);
            }
        });

        opcionA.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        opcionA.setText("A) Desintegración");
        opcionA.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        opcionA.setFocusPainted(false);
        opcionA.setFocusable(false);
        opcionA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcionAActionPerformed(evt);
            }
        });

        opcionC.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        opcionC.setText("C) Sublimación");
        opcionC.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        opcionC.setFocusPainted(false);
        opcionC.setFocusable(false);
        opcionC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcionCActionPerformed(evt);
            }
        });

        opcionD.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        opcionD.setText("D) Ninguna de las anteriores");
        opcionD.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        opcionD.setFocusPainted(false);
        opcionD.setFocusable(false);
        opcionD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcionDActionPerformed(evt);
            }
        });

        btnRendicion.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnRendicion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rendicion.png"))); // NOI18N
        btnRendicion.setToolTipText("Me rindo!");
        btnRendicion.setBorderPainted(false);
        btnRendicion.setContentAreaFilled(false);
        btnRendicion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRendicion.setFocusPainted(false);
        btnRendicion.setFocusable(false);
        btnRendicion.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnRendicion.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnRendicion.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnRendicion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRendicionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(lblCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblAcomulado, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(550, 550, 550)
                        .addComponent(lblRonda))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addComponent(lblPregunta, javax.swing.GroupLayout.PREFERRED_SIZE, 1034, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(265, 265, 265)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(opcionA, javax.swing.GroupLayout.PREFERRED_SIZE, 682, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(opcionD, javax.swing.GroupLayout.PREFERRED_SIZE, 679, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(opcionC, javax.swing.GroupLayout.PREFERRED_SIZE, 679, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(opcionB, javax.swing.GroupLayout.PREFERRED_SIZE, 679, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(btnRendicion)))
                .addContainerGap(96, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAcomulado)
                    .addComponent(lblCategoria))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblRonda)
                .addGap(18, 18, 18)
                .addComponent(lblPregunta)
                .addGap(52, 52, 52)
                .addComponent(opcionA, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(opcionB, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(opcionC, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(opcionD, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
                .addComponent(btnRendicion)
                .addGap(33, 33, 33))
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
    }// </editor-fold>//GEN-END:initComponents

    private void opcionAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcionAActionPerformed

        if (opciones[0].isCorrecta()) {

            respuestaCorrecta();

        } else {

            this.opcionA.setBackground(Color.red);
            derrota();

        }

    }//GEN-LAST:event_opcionAActionPerformed

    private void opcionBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcionBActionPerformed

        if (opciones[1].isCorrecta()) {

            respuestaCorrecta();

        } else {

            this.opcionB.setBackground(Color.red);
            derrota();

        }

    }//GEN-LAST:event_opcionBActionPerformed

    private void opcionCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcionCActionPerformed

        if (opciones[2].isCorrecta()) {

            respuestaCorrecta();

        } else {

            this.opcionC.setBackground(Color.red);
            derrota();

        }

    }//GEN-LAST:event_opcionCActionPerformed

    private void opcionDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcionDActionPerformed

        if (opciones[3].isCorrecta()) {

            respuestaCorrecta();

        } else {

            this.opcionD.setBackground(Color.red);
            derrota();

        }

    }//GEN-LAST:event_opcionDActionPerformed

    private void btnRendicionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRendicionActionPerformed

        almacenarPuntos();

        VistaPrincipal principal = new VistaPrincipal();

        principal.setVisible(true);

    }//GEN-LAST:event_btnRendicionActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRendicion;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblAcomulado;
    private javax.swing.JLabel lblCategoria;
    private javax.swing.JLabel lblPregunta;
    private javax.swing.JLabel lblRonda;
    private javax.swing.JButton opcionA;
    private javax.swing.JButton opcionB;
    private javax.swing.JButton opcionC;
    private javax.swing.JButton opcionD;
    // End of variables declaration//GEN-END:variables

    public void mostrarPregunta() {

        try {

            preguntas = pController.buscarPregunta(Integer.toString(ronda));

            int indexAleatorio = (int) (Math.random() * (preguntas.length - 0)) + 0;

            String pregunta = preguntas[indexAleatorio].getPregunta();
            int identificador = preguntas[indexAleatorio].getId();
            int indexCategoria = preguntas[indexAleatorio].getId_categoria();

            lblPregunta.setText(pregunta);

            opciones = oController.buscarOpciones(Integer.toString(identificador));

            opcionA.setText(opciones[0].getRespuesta());
            opcionB.setText(opciones[1].getRespuesta());
            opcionC.setText(opciones[2].getRespuesta());
            opcionD.setText(opciones[3].getRespuesta());

            Categoria categoria = cController.obtenerCategoria(Integer.toString(indexCategoria));

            lblCategoria.setText(categoria.getNombre());

            this.opcionA.setBackground(Color.gray);
            this.opcionB.setBackground(Color.gray);
            this.opcionC.setBackground(Color.gray);
            this.opcionD.setBackground(Color.gray);

        } catch (SQLException ex) {
            Logger.getLogger(VistaCuestionario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void respuestaCorrecta() {

        acomulado += premioActual;
        this.lblAcomulado.setText("Tus puntos: " + acomulado);

        if (ronda < 5) {
            ronda++;
            lblRonda.setText("Ronda N°" + ronda);
            mostrarPregunta();
            obtenerPremio();
        } else {

            almacenarPuntos();
            VistaFelicidades felicidades = new VistaFelicidades();

            felicidades.setVisible(true);

        }
    }

    public void derrota() {

        this.dispose();

        VistaDerrota derrota = new VistaDerrota();
        derrota.setVisible(true);
    }

    public void obtenerPremio() {

        try {

            Ronda r = rController.obtenerRonda(Integer.toString(ronda));

            int id_premio = r.getId_premio();

            Premio premio = prController.obtenerPremio(Integer.toString(id_premio));

            premioActual = premio.getPuntos();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al obtener el premio!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void almacenarPuntos() {

        try {

            int maxJugador = jController.maxJugador();

            boolean actualizar = jController.actualizarPuntaje(maxJugador, acomulado);

            if (!actualizar) {

                JOptionPane.showMessageDialog(null, "Error al incrementar los puntos!", "Error", JOptionPane.ERROR_MESSAGE);

            }

            this.dispose();
        } catch (SQLException ex) {
            Logger.getLogger(VistaCuestionario.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
