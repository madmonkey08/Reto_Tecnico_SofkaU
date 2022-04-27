package Controlador;

import BD.Conexion;
import Modelo.Categoria;
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
public class CategoriasController {

    Conexion cc = new Conexion();
    Connection cn;
    PreparedStatement pst;
    String sSql = " ";
    ResultSet rs;
    Statement st;

    public Categoria obtenerCategoria(String id_categoria) throws SQLException {

        try {

            Categoria categoria = null;

            cn = cc.conectar();

            sSql = "SELECT * FROM categorias WHERE id = '" + id_categoria + "' ";
            st = cn.createStatement();
            rs = st.executeQuery(sSql);

            if (rs.next()) {

                categoria = new Categoria(rs.getInt("id"), rs.getString("nombre"), rs.getInt("dificultad"));

            }

            return categoria;

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al obtener la categoría!", "Ups", JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }

    public boolean crearCategoria(Categoria c) {

        try {

            cn = cc.conectar();

            sSql = "INSERT INTO categorias(id, nombre, dificultad)"
                    + " values (?, ?, ?)";

            pst = cn.prepareStatement(sSql);

            pst.setInt(0, c.getId());
            pst.setString(1, c.getNombre());
            pst.setInt(2, c.getDificultad());

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
