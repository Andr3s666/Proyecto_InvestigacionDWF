package sv.udb.edu.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class Visitante {
    private String nombre;
    private int edad;
    private List<Boleto> listaDeBoletos;

   
    public Visitante(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
        this.listaDeBoletos = new ArrayList<>();
    }

    public void agregarBoleto(Boleto boleto) {
        this.listaDeBoletos.add(boleto);
    }
}
