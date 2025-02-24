package sv.udb.edu.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sv.udb.edu.domain.Visitante;
import sv.udb.edu.repository.VisitanteRepository;

@Service
public class VisitanteService {

    @Autowired
    private VisitanteRepository visitanteRepository;

    public Visitante crearVisitante(Visitante visitante) {
        return visitanteRepository.save(visitante);
    }

    public Visitante obtenerVisitante(Long id) {
        return visitanteRepository.findById(id).orElseThrow(() -> new RuntimeException("Visitante no encontrado"));
    }
}
