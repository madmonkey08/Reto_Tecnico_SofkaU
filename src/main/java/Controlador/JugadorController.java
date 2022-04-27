package Controlador;

import BD.Conexion;
import Modelo.Jugador;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Alvaro José Tobar Mayorquín
 */
public class JugadorController {

    Conexion cc = new Conexion();
    Connection cn;
    PreparedStatement pst;
    String sSql = " ";
    ResultSet rs;
    Statement st;

    public int maxJugador() throws SQLException {

        int maxId = 0;

        cn = cc.conectar();

        sSql = "SELECT MAX(id) FROM jugadores ";
        st = cn.createStatement();
        rs = st.executeQuery(sSql);

        if (rs.next()) {

            maxId = rs.getInt(1);

        }

        return maxId;
    }

    public Jugador obtenerJugador(String id_jugador) throws SQLException {

        try {

            Jugador jugador = null;

            cn = cc.conectar();

            sSql = "SELECT * FROM jugadores WHERE id = '" + id_jugador + "' ";
            st = cn.createStatement();
            rs = st.executeQuery(sSql);

            if (rs.next()) {

                jugador = new Jugador(rs.getString("nombre"), rs.getInt("puntos"));

            }

            return jugador;

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al obtener el jugador!", "Ups", JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }

    public boolean CrearJugador(Jugador j) {

        try {

            cn = cc.conectar();

            sSql = "INSERT INTO jugadores(nombre, puntos)"
                    + " values (?, ?)";

            pst = cn.prepareStatement(sSql);

            pst.setString(1, j.getNombre());
            pst.setInt(2, j.getPuntos());

            int n = pst.executeUpdate();

            if (n != 0) {
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(null, "Uy, algo salió mal!", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        } finally {
            close(cn);
            close(pst);
        }
    }

    public boolean actualizarPuntaje(int id_jugador, int acomulado) {

        try {

            cn = cc.conectar();

            sSql = "UPDATE jugadores SET puntos = '" + acomulado + "' WHERE id = '" + id_jugador + "'";

            pst = cn.prepareStatement(sSql);

            int n = pst.executeUpdate();

            if (n != 0) {
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(null, "Uy, algo salió mal!", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        } finally {
            close(cn);
            close(pst);
        }
    }

    public DefaultTableModel mostrarJugadores() {
        try {

            cn = cc.conectar();

            DefaultTableModel modelo;

            String[] titulos = {"Nombre", "Puntos"};

            String[] registro = new String[2];

            modelo = new DefaultTableModel(null, titulos) {

                @Override
                public boolean isCellEditable(int row, int column) {
                    return false;
                }

            };

            sSql = "SELECT * FROM jugadores ORDER BY puntos DESC ;";

            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sSql);

            while (rs.next()) {
                registro[0] = rs.getString("nombre");
                registro[1] = rs.getString("puntos");

                modelo.addRow(registro);

            }
            return modelo;

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            return null;
        } finally {
            close(cn);
        }
    }

    private static void close(Connection con) {
        if (con != null) {
            try {
                con.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
    }

    private static void close(Statement stmt) {
        if (stmt != null) {
            try {
                stmt.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
    }

}
