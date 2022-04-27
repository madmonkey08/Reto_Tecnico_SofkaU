package Vista;

/**
 *
 * @author Alvaro José Tobar Mayorquín
 */
public class VistaDerrota extends javax.swing.JFrame {

    public VistaDerrota() {
        initComponents();
        this.setLocationRelativeTo(null);

    }


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblPregunta = new javax.swing.JLabel();
        lblPregunta2 = new javax.swing.JLabel();
        btnInicio = new javax.swing.JButton();
        lblPregunta4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        lblPregunta.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblPregunta.setForeground(new java.awt.Color(102, 102, 102));
        lblPregunta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPregunta.setText("Uy! Has perdido");

        lblPregunta2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblPregunta2.setForeground(new java.awt.Color(102, 102, 102));
        lblPregunta2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPregunta2.setText("Pero ahí no acaba todo! vuelve a intentarlo, nunca te rindas!");

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

        lblPregunta4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblPregunta4.setForeground(new java.awt.Color(102, 102, 102));
        lblPregunta4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPregunta4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/triste.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(btnInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(42, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblPregunta, javax.swing.GroupLayout.PREFERRED_SIZE, 1034, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblPregunta2, javax.swing.GroupLayout.PREFERRED_SIZE, 1034, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(38, 38, 38))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(lblPregunta4, javax.swing.GroupLayout.PREFERRED_SIZE, 667, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(218, 218, 218))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(btnInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(76, 76, 76)
                .addComponent(lblPregunta)
                .addGap(18, 18, 18)
                .addComponent(lblPregunta2)
                .addGap(18, 18, 18)
                .addComponent(lblPregunta4, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(47, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
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
    private javax.swing.JLabel lblPregunta;
    private javax.swing.JLabel lblPregunta2;
    private javax.swing.JLabel lblPregunta4;
    // End of variables declaration//GEN-END:variables

}
