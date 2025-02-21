package sv.edu.udb.proyecto_daw;
import java.util.ArrayList;
import java.util.List;

public class Visitante {
    private String nombre;
    private int edad;
    private List<String> listaBoletos;

    public Visitante(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
        this.listaBoletos = new ArrayList<>();
    }
    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public List<String> getListaBoletos() {
        return listaBoletos;
    }
}
