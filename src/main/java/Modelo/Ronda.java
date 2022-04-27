package Modelo;

/**
 *
 * @author Alvaro José Tobar Mayorquín
 */
public class Ronda {

    private int numRonda;
    private int id_premio;

    public Ronda(int numRonda, int id_premio) {
        this.numRonda = numRonda;
        this.id_premio = id_premio;
    }

    public int getNumRonda() {
        return numRonda;
    }

    public void setNumRonda(int numRonda) {
        this.numRonda = numRonda;
    }

    public int getId_premio() {
        return id_premio;
    }

    public void setId_premio(int id_premio) {
        this.id_premio = id_premio;
    }

}
