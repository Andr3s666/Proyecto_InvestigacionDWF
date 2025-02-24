package sv.udb.edu.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sv.udb.edu.domain.Atraccion;
import sv.udb.edu.domain.Visitante;
import sv.udb.edu.repository.AtraccionRepository;

@Service
public class AtraccionService {

    @Autowired
    private AtraccionRepository atraccionRepository;

    public Atraccion obtenerAtraccionPorId(Long id) {
        return atraccionRepository.findById(id).orElseThrow(() -> new RuntimeException("Atracción no encontrada"));
    }

    public void iniciarAtraccion(Long id) {
        Atraccion atraccion = obtenerAtraccionPorId(id);
        atraccion.setEstado(Atraccion.EstadoAtraccion.ABIERTA);
        atraccionRepository.save(atraccion);
    }

    public void ponerEnMantenimiento(Long id) {
        Atraccion atraccion = obtenerAtraccionPorId(id);
        atraccion.setEstado(Atraccion.EstadoAtraccion.MANTENIMIENTO);
        atraccionRepository.save(atraccion);
    }


    public boolean ingresarAtraccion(Long id, Visitante visitante) {
        Atraccion atraccion = obtenerAtraccionPorId(id);


        if (visitante.getEdad() >= atraccion.getEdadMinima()) {
            return true;
        } else {
            return false;
        }
    }
}
