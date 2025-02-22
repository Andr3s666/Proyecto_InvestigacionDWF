package sv.udb.edu.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;

@Getter
@Setter
@NoArgsConstructor  // Constructor sin parámetros
public class CasaDelTerror extends Atraccion {
    private boolean tieneEfectosEspeciales;

    // Constructor con parámetros
    public CasaDelTerror(String nombre, int capacidad, int edadMinima, EstadoAtraccion estado, boolean tieneEfectosEspeciales) {
        super(nombre, capacidad, edadMinima, estado); // Cambié 'estado' a tipo EstadoAtraccion
        this.tieneEfectosEspeciales = tieneEfectosEspeciales;
    }
}
