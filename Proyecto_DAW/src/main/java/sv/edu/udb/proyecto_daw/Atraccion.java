package sv.edu.udb.proyecto_daw;

public class Atraccion {
    private String nombre;
    private int capacidad;
    private int edadMin;
    private boolean estado;

    public Atraccion(String nombre, int capacidad, int edadMin, boolean estado) {
        this.nombre = nombre;
        this.capacidad = capacidad;
        this.edadMin = edadMin;
        this.estado = estado;
}
    public String getNombre() {
        return nombre;
    }

    public int getCapacidad() {
        return capacidad;
    }
    public int getEdadMin() {
        return edadMin;
    }

    public boolean isEstado() {
        return estado;
    }
}
