package sv.udb.edu.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sv.udb.edu.domain.Boleto;
import sv.udb.edu.domain.Visitante;
import sv.udb.edu.repository.BoletoRepository;

@Service
public class BoletoService {

    @Autowired
    private BoletoRepository boletoRepository;

    public Boleto comprarBoleto(Visitante visitante, String tipo) {
        double precio = calcularPrecio(tipo);
        Boleto boleto = new Boleto(tipo, precio, visitante);
        return boletoRepository.save(boleto);
    }

    private double calcularPrecio(String tipo) {
        switch (tipo) {
            case "VIP":
                return 100.0;
            case "Infantil":
                return 20.0;
            case "Adulto":
                return 50.0;
            default:
                throw new IllegalArgumentException("Tipo de boleto no válido");
        }
    }
}
