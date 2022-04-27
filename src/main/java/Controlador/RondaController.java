package Controlador;

import BD.Conexion;
import Modelo.Ronda;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Alvaro José Tobar Mayorquín
 */
public class RondaController {

    Conexion cc = new Conexion();
    Connection cn;
    PreparedStatement pst;
    String sSql = " ";
    ResultSet rs;
    Statement st;

    public Ronda obtenerRonda(String numRonda) throws SQLException {

        try {

            Ronda ronda = null;

            cn = cc.conectar();

            sSql = "SELECT * FROM rondas WHERE numRonda = '" + numRonda + "' ";
            st = cn.createStatement();
            rs = st.executeQuery(sSql);

            if (rs.next()) {

                ronda = new Ronda(rs.getInt("numRonda"), rs.getInt("premio"));

            }

            return ronda;

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al obtener la ronda!", "Ups", JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }
}
