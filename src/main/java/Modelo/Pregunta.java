package Modelo;

import java.util.ArrayList;

/**
 *
 * @author Alvaro José Tobar Mayorquín
 */
public class Pregunta {

    private int id;
    private String pregunta;
    private int id_categoria;

    public Pregunta(int id, String pregunta, int id_categoria) {
        this.id = id;
        this.pregunta = pregunta;
        this.id_categoria = id_categoria;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId_categoria() {
        return id_categoria;
    }

    public void setId_categoria(int id_categoria) {
        this.id_categoria = id_categoria;
    }

    public String getPregunta() {
        return pregunta;
    }

    public void setPregunta(String pregunta) {
        this.pregunta = pregunta;
    }

}
