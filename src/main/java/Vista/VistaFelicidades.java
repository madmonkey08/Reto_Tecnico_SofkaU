package Vista;

import Controlador.JugadorController;
import Modelo.Jugador;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Alvaro José Tobar Mayorquín
 */
public class VistaFelicidades extends javax.swing.JFrame {

    private JugadorController jController = new JugadorController();
    private String nombreJugador = "";

    public VistaFelicidades() {
        initComponents();
        this.setLocationRelativeTo(null);

        obtenerJugador();
    }


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblPregunta = new javax.swing.JLabel();
        lblJugador = new javax.swing.JLabel();
        lblPregunta2 = new javax.swing.JLabel();
        lblPregunta3 = new javax.swing.JLabel();
        btnInicio = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        lblPregunta.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblPregunta.setForeground(new java.awt.Color(102, 102, 102));
        lblPregunta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPregunta.setText("FELICIDADES!!! ");

        lblJugador.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        lblJugador.setForeground(new java.awt.Color(51, 51, 51));
        lblJugador.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblJugador.setText("NOMBRE DEL JUGADOR");

        lblPregunta2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblPregunta2.setForeground(new java.awt.Color(102, 102, 102));
        lblPregunta2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPregunta2.setText("Eres todo un erudito! Has obtenido el puntaje máximo, sigue así!");

        lblPregunta3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblPregunta3.setForeground(new java.awt.Color(102, 102, 102));
        lblPregunta3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPregunta3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/celebracion.png"))); // NOI18N

        btnInicio.setBackground(new java.awt.Color(255, 50, 78));
        btnInicio.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnInicio.setForeground(new java.awt.Color(255, 255, 255));
        btnInicio.setText("Volver al inicio");
        btnInicio.setBorder(null);
        btnInicio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnInicio.setFocusable(false);
        btnInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInicioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(42, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblPregunta2, javax.swing.GroupLayout.PREFERRED_SIZE, 1034, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblJugador, javax.swing.GroupLayout.PREFERRED_SIZE, 1034, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblPregunta, javax.swing.GroupLayout.PREFERRED_SIZE, 1034, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(38, 38, 38))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(lblPregunta3, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(365, 365, 365))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(btnInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(btnInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblPregunta)
                .addGap(53, 53, 53)
                .addComponent(lblJugador)
                .addGap(55, 55, 55)
                .addComponent(lblPregunta2)
                .addGap(32, 32, 32)
                .addComponent(lblPregunta3, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(42, Short.MAX_VALUE))
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

    private void btnInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInicioActionPerformed

        this.dispose();

        VistaPrincipal principal = new VistaPrincipal();

        principal.setVisible(true);

    }//GEN-LAST:event_btnInicioActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnInicio;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblJugador;
    private javax.swing.JLabel lblPregunta;
    private javax.swing.JLabel lblPregunta2;
    private javax.swing.JLabel lblPregunta3;
    // End of variables declaration//GEN-END:variables

    public void obtenerJugador() {

        try {
            String id_jugador = Integer.toString(jController.maxJugador());

            Jugador jugador = jController.obtenerJugador(id_jugador);

            lblJugador.setText(jugador.getNombre());

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al encontrar al jugador!", "Error", JOptionPane.ERROR_MESSAGE);
        }

    }

}
