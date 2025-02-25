package sv.udb.edu.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;

@Getter
@Setter
@NoArgsConstructor
public class Boleto {

    private String tipo;
    private double precio;
    private Visitante visitante;


    public Boleto(String tipo, double precio, Visitante visitante) {
        this.tipo = tipo;
        this.precio = precio;
        this.visitante = visitante;
    }
}
