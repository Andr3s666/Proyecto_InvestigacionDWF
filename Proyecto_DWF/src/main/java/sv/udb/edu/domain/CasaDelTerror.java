package sv.udb.edu.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;

@Getter
@Setter
@NoArgsConstructor
public class CasaDelTerror extends Atraccion {

    private boolean tieneEfectosEspeciales;


    public CasaDelTerror(String nombre, int capacidad, int edadMinima, EstadoAtraccion estado, boolean tieneEfectosEspeciales) {
        super(nombre, capacidad, edadMinima, estado);
        this.tieneEfectosEspeciales = tieneEfectosEspeciales;
    }
}
