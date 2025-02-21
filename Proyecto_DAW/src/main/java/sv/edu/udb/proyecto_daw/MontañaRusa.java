package sv.edu.udb.proyecto_daw;

public class MontañaRusa extends Atraccion {
    private int alturaMin; // Altura mínima en cm

    public MontañaRusa(String nombre, int capacidad, int edadMin, boolean estado, int alturaMin) {
        super(nombre, capacidad, edadMin, estado);
        if (alturaMin < 150) {
            throw new IllegalArgumentException("La altura mínima debe ser al menos 150 cm.");
        }
        this.alturaMin = alturaMin;
    }

    public int getAlturaMin() {
        return alturaMin;
    }
}
