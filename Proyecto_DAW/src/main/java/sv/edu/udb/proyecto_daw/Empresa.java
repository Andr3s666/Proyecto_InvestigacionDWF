package sv.edu.udb.proyecto_daw;
import java.util.ArrayList;
import java.util.List;

public class Empresa {
    private String nombre;
    private List<Departamento> departamentos;
    private List<String> historialEventos;

    public Empresa(String nombre) {
        this.nombre = nombre;
        this.departamentos = new ArrayList<>();
        this.historialEventos = new ArrayList<>();
}
    public void agregarDepartamento(Departamento departamento) {
        departamentos.add(departamento);
        historialEventos.add("Departamento agregado: " + departamento.getNombre());
    }

    public void registrarEvento(String evento) {
        historialEventos.add(evento);
    }

    public void mostrarHistorialEventos() {
        System.out.println("Historial de eventos de " + nombre + ":");
        for (String evento : historialEventos) {
            System.out.println("- " + evento);
        }
    }

    public void mostrarDepartamentos() {
        System.out.println("Departamentos en " + nombre + ":");
        for (Departamento dep : departamentos) {
            System.out.println("- " + dep.getNombre());
        }
    }

    @Override
    public String toString() {
        return "Empresa{" +
                "nombre='" + nombre + '\'' +
                ", departamentos=" + departamentos.size() +
                ", historialEventos=" + historialEventos.size() +
                '}';
    }
}
