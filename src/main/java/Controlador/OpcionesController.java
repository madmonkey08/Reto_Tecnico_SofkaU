package Controlador;

import BD.Conexion;
import Modelo.Opcion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Alvaro José Tobar Mayorquín
 */
public class OpcionesController {

    Conexion cc = new Conexion();
    Connection cn;
    PreparedStatement pst;
    String sSql = " ";
    ResultSet rs;
    Statement st;

    public Opcion[] buscarOpciones(String pregunta) throws SQLException {

        Opcion[] opciones = new Opcion[5];

        cn = cc.conectar();
        sSql = "SELECT * FROM opciones WHERE id_pregunta = '" + pregunta + "' ";
        st = cn.createStatement();
        rs = st.executeQuery(sSql);

        int i = 0;

        while (rs.next()) {

            opciones[i] = new Opcion(rs.getInt("id"), rs.getString("respuesta"), rs.getBoolean("correcta"), rs.getInt("id_pregunta"));
            i++;
        }

        return opciones;
    }

}
