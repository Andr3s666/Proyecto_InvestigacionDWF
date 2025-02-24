package sv.udb.edu.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;

@Getter
@Setter
@NoArgsConstructor
public class MontañaRusa extends Atraccion {
    private int velocidad;


    public MontañaRusa(String nombre, int capacidad, int edadMinima, EstadoAtraccion estado, int velocidad) {
        super(nombre, capacidad, edadMinima, estado); // Cambié 'estado' a tipo EstadoAtraccion
        this.velocidad = velocidad;
    }
}
