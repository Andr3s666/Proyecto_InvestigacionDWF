package sv.udb.edu.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;

@Getter
@Setter
@NoArgsConstructor
public class Carrusel extends Atraccion {
    private int numeroDeCaballos;


    public Carrusel(String nombre, int capacidad, int edadMinima, EstadoAtraccion estado, int numeroDeCaballos) {
        super(nombre, capacidad, edadMinima, estado); // Pasar EstadoAtraccion en lugar de String
        this.numeroDeCaballos = numeroDeCaballos;
    }
}
