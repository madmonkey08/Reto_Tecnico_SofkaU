package Modelo;

/**
 *
 * @author Alvaro José Tobar Mayorquín
 */
public class Premio {

    private int id;
    private int puntos;

    public Premio(int id, int puntos) {
        this.id = id;
        this.puntos = puntos;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

}
