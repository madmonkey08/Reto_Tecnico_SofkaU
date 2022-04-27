package Vista;

import Controlador.JugadorController;
import Modelo.Jugador;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

/**
 *
 * @author Alvaro José Tobar Mayorquín
 */
public class VistaPrincipal extends javax.swing.JFrame {

    public VistaPrincipal() {
        initComponents();

        this.setLocationRelativeTo(null);
        this.nombreLabel.setVisible(false);
        this.bienvenida1.setVisible(false);
        this.bienvenida2.setVisible(false);
        this.setResizable(false);
        this.setTitle("¿Te la sabes?");

        mostrarJugadores();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tablaJugadores = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        inputNombre = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        bienvenida1 = new javax.swing.JLabel();
        nombreLabel = new javax.swing.JLabel();
        bienvenida2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tablaJugadores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Puntuación"
            }
        ));
        tablaJugadores.setSelectionBackground(new java.awt.Color(96, 151, 253));
        jScrollPane1.setViewportView(tablaJugadores);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 70, -1, 400));

        jButton1.setBackground(new java.awt.Color(255, 50, 78));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Empecemos!");
        jButton1.setBorder(null);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 270, 40));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(153, 153, 153));
        jLabel5.setText("Los más tesos!");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 30, 180, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(153, 153, 153));
        jLabel6.setText("Bienvenido a");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 123, -1));

        inputNombre.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        inputNombre.setForeground(new java.awt.Color(102, 102, 102));
        inputNombre.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        inputNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputNombreActionPerformed(evt);
            }
        });
        inputNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                inputNombreKeyReleased(evt);
            }
        });
        getContentPane().add(inputNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 270, 40));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 153, 153));
        jLabel1.setText("Ingresa tu nombre:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 180, -1));

        bienvenida1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        bienvenida1.setForeground(new java.awt.Color(255, 50, 78));
        bienvenida1.setText("¿te le mides al reto? ");
        getContentPane().add(bienvenida1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, 190, -1));

        nombreLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        nombreLabel.setForeground(new java.awt.Color(96, 151, 253));
        nombreLabel.setText("Sin nombre");
        getContentPane().add(nombreLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 290, 280, -1));

        bienvenida2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        bienvenida2.setForeground(new java.awt.Color(96, 151, 253));
        bienvenida2.setText("Hola!");
        getContentPane().add(bienvenida2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 60, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/titulo.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, 71));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fondo.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 960, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void inputNombreKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_inputNombreKeyReleased

        String nombre = this.inputNombre.getText().trim();

        if (nombre.length() > 0) {

            this.bienvenida1.setVisible(true);
            this.nombreLabel.setText(nombre);
            this.nombreLabel.setVisible(true);
            this.bienvenida2.setVisible(true);
        } else {
            this.bienvenida1.setVisible(false);
            this.nombreLabel.setVisible(false);
            this.nombreLabel.setText("Sin nombre");
            this.bienvenida2.setVisible(false);
        }

    }//GEN-LAST:event_inputNombreKeyReleased

    private void inputNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputNombreActionPerformed
        validarCampos();
    }//GEN-LAST:event_inputNombreActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        validarCampos();
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bienvenida1;
    private javax.swing.JLabel bienvenida2;
    private javax.swing.JTextField inputNombre;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel nombreLabel;
    private javax.swing.JTable tablaJugadores;
    // End of variables declaration//GEN-END:variables

    public void mostrarJugadores() {

        try {

            JugadorController jController = new JugadorController();

            DefaultTableModel modelo;
            modelo = jController.mostrarJugadores();
            DefaultTableCellRenderer tcr = new DefaultTableCellRenderer();
            tablaJugadores.setModel(modelo);
            tcr.setHorizontalAlignment(SwingConstants.LEFT);
            TableColumnModel column = tablaJugadores.getColumnModel();
            column.getColumn(0).setPreferredWidth(150);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ocurrió un error al mostrar los más tesos!", "Que tragedia!", JOptionPane.ERROR_MESSAGE);
        }

    }

    public void validarCampos() {

        String nombre = this.inputNombre.getText().trim();

        if (nombre.length() <= 0) {
            JOptionPane.showMessageDialog(null, "Dinos quién eres! Ingresa tu nombre, por favor", "Uy algo salió mal", JOptionPane.ERROR_MESSAGE);
        } else {

            JugadorController jController = new JugadorController();

            Jugador jugador = new Jugador(this.inputNombre.getText(), 0);

            boolean registrar = jController.CrearJugador(jugador);

            if (!registrar) {
                JOptionPane.showMessageDialog(null, "Err");
            } else {

                this.dispose();

                VistaCuestionario cuestionario = new VistaCuestionario();

                cuestionario.setVisible(true);

            }

        }
    }

}
