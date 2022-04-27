package Modelo;

/**
 *
 * @author Alvaro José Tobar Mayorquín
 */
public class Categoria {

    private int id;
    private String nombre;
    private int dificultad;

    public Categoria(int id, String nombre, int dificultad) {
        this.id = id;
        this.nombre = nombre;
        this.dificultad = dificultad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDificultad() {
        return dificultad;
    }

    public void setDificultad(int dificultad) {
        this.dificultad = dificultad;
    }

}
