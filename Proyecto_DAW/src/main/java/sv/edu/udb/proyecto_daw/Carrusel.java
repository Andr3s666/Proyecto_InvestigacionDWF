package sv.edu.udb.proyecto_daw;

public class Carrusel extends Atraccion {
    private String velocidad; // "Lento" o "Rápido"

    public Carrusel(String nombre, int capacidad, int edadMin, boolean estado, String velocidad) {
        super(nombre, capacidad, edadMin, estado);
        if (!velocidad.equalsIgnoreCase("Lento") && !velocidad.equalsIgnoreCase("Rápido")) {
            throw new IllegalArgumentException("Velocidad no válida. Debe ser 'Lento' o 'Rápido'.");
        }
        this.velocidad = velocidad;
    }

    public String getVelocidad() {
        return velocidad;
    }
}
