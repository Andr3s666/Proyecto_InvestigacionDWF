package sv.udb.edu.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;

@Getter
@Setter
@NoArgsConstructor
public class Atraccion {
    private String nombre;
    private int capacidad;
    private int edadMinima;
    private EstadoAtraccion estado; // Usar la enumeración aquí

    // Constructor con parámetros
    public Atraccion(String nombre, int capacidad, int edadMinima, EstadoAtraccion estado) {
        this.nombre = nombre;
        this.capacidad = capacidad;
        this.edadMinima = edadMinima;
        this.estado = estado;
    }

    // Enumeración de los posibles estados de la atracción
    public enum EstadoAtraccion {
        ABIERTA,
        CERRADA,
        MANTENIMIENTO
    }
}
