package Modelo;

/**
 *
 * @author Alvaro José Tobar Mayorquín
 */
public class Opcion {

    private int id;
    private String respuesta;
    private boolean correcta;
    private int id_pregunta;

    public Opcion(int id, String respuesta, boolean correcta, int id_pregunta) {
        this.id = id;
        this.respuesta = respuesta;
        this.correcta = correcta;
        this.id_pregunta = id_pregunta;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRespuesta() {
        return respuesta;
    }

    public void setRespuesta(String respuesta) {
        this.respuesta = respuesta;
    }

    public boolean isCorrecta() {
        return correcta;
    }
        
    public void setCorrecta(boolean correcta) {
        this.correcta = correcta;
    }

    public int getId_pregunta() {
        return id_pregunta;
    }

    public void setId_pregunta(int id_pregunta) {
        this.id_pregunta = id_pregunta;
    }

}
