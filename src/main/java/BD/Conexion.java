package BD;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author Alvaro José Tobar Mayorquín
 */
public class Conexion {

    private Connection conexion = null;

    public Connection conectar() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/reto_sofkau?characterEncoding=utf8&useSSL=false&useUnicode=true", "root", "root");

        } catch (ClassNotFoundException nf) {
            JOptionPane.showMessageDialog(null, nf.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(null, "¡Error! Ejecute la base de datos primero.", "Error", JOptionPane.ERROR_MESSAGE);
            System.exit(0);
        }
        return conexion;
    }
}
