package sv.edu.udb.proyecto_daw;

public class Boletos {
    public enum Tipo {
        GENERAL, VIP
    }

    private Tipo tipo;
    private double precio;

    public Boletos(Tipo tipo) {
        this.tipo = tipo;
        this.precio = asignarPrecio(tipo);
    }

    private double asignarPrecio(Tipo tipo) {
        switch (tipo) {
            case GENERAL:
                return 100.00;
            case VIP:
                return 200.00;
            default:
                return 0.00;
        }
    }
    public Tipo getTipo () {
        return tipo;
    }

    public double getPrecio () {
        return precio;
    }
}