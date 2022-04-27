package Controlador;

import BD.Conexion;
import Modelo.Premio;
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
public class PremioController {
    
    Conexion cc = new Conexion();
    Connection cn;
    PreparedStatement pst;
    String sSql = " ";
    ResultSet rs;
    Statement st;
    
    public Premio obtenerPremio(String id_premio) throws SQLException {
        
        try {
            
            Premio premio = null;
            
            cn = cc.conectar();
            
            sSql = "SELECT * FROM premios WHERE id = '" + id_premio + "' ";
            st = cn.createStatement();
            rs = st.executeQuery(sSql);
            
            if (rs.next()) {
                
                premio = new Premio(rs.getInt("id"), rs.getInt("puntos"));
                
            }
            
            return premio;
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al obtener la ronda!", "Ups", JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }
}
