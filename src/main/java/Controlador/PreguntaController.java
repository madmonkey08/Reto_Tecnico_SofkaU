package Controlador;

import BD.Conexion;
import Modelo.Pregunta;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Alvaro José Tobar Mayorquín
 */
public class PreguntaController {

    Conexion cc = new Conexion();
    Connection cn;
    PreparedStatement pst;
    String sSql = " ";
    ResultSet rs;
    Statement st;

    public Pregunta[] buscarPregunta(String dificultad) throws SQLException {

        Pregunta preguntas[] = new Pregunta[5];

        cn = cc.conectar();
        sSql = "SELECT * FROM preguntas WHERE id_categoria = '" + dificultad + "' ";
        st = cn.createStatement();
        rs = st.executeQuery(sSql);

        int i = 0;

        while (rs.next()) {

            preguntas[i] = new Pregunta(rs.getInt("id"), rs.getString("pregunta"), rs.getInt("id_categoria"));
            i++;
        }

        return preguntas;
    }

}
