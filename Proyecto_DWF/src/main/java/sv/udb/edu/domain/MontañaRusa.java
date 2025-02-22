package sv.udb.edu.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;

@Getter
@Setter
@NoArgsConstructor  // Constructor sin parámetros
public class MontañaRusa extends Atraccion {
    private int velocidad;

    // Constructor con parámetros
    public MontañaRusa(String nombre, int capacidad, int edadMinima, EstadoAtraccion estado, int velocidad) {
        super(nombre, capacidad, edadMinima, estado); // Cambié 'estado' a tipo EstadoAtraccion
        this.velocidad = velocidad;
    }
}
