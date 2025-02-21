package sv.edu.udb.proyecto_daw;

public class CasaTerror extends Atraccion {
    private int nivelMiedo; //Niveles

    public CasaTerror(String nombre, int capacidad, boolean estado, int nivelMiedo) {
        super(nombre, capacidad, 18, estado); // Edad
        if (nivelMiedo < 1 || nivelMiedo > 3) {
            throw new IllegalArgumentException("El nivel de miedo debe estar entre 1 y 3.");
        }
        this.nivelMiedo = nivelMiedo;
    }

    public int getNivelMiedo() {
        return nivelMiedo;
    }
}
