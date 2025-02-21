package sv.edu.udb.proyecto_daw;

public class Departamento {
        private String nombre;

        public Departamento(String nombre) {
            this.nombre = nombre;
        }

        public String getNombre() {
            return nombre;
        }

        @Override
        public String toString() {
            return "Departamento{" +
                    "nombre='" + nombre + '\'' +
                    '}';
        }
}
