package sv.udb.edu.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sv.udb.edu.domain.Atraccion;
import sv.udb.edu.domain.Visitante;
import sv.udb.edu.repository.AtraccionRepository;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

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

    public void ponerEnMantenimientoYReubicar(Long id, List<Visitante> visitantes) {
        Atraccion atraccion = obtenerAtraccionPorId(id);
        atraccion.setEstado(Atraccion.EstadoAtraccion.MANTENIMIENTO);
        atraccionRepository.save(atraccion);


        List<Atraccion> atraccionesDisponibles = atraccionRepository.findAll().stream()
                .filter(a -> a.getEstado() == Atraccion.EstadoAtraccion.ABIERTA)
                .collect(Collectors.toList());

        if (atraccionesDisponibles.isEmpty()) {
            System.out.println("No hay atracciones abiertas para reubicar a los visitantes.");
            return;
        }


        for (Visitante v : visitantes) {
            Optional<Atraccion> atraccionReubicacion = atraccionesDisponibles.stream()
                    .filter(a -> v.getEdad() >= a.getEdadMinima() && a.getCapacidad() > 0)
                    .findFirst();

            if (atraccionReubicacion.isPresent()) {
                System.out.println("Visitante " + v.getNombre() + " reubicado a " + atraccionReubicacion.get().getNombre());
                atraccionReubicacion.get().setCapacidad(atraccionReubicacion.get().getCapacidad() - 1);
            } else {
                System.out.println("Visitante " + v.getNombre() + " no pudo ser reubicado.");
            }
        }
    }

    public boolean ingresarAtraccion(Long id, Visitante visitante) {
        Atraccion atraccion = obtenerAtraccionPorId(id);
        return visitante.getEdad() >= atraccion.getEdadMinima() && atraccion.getCapacidad() > 0;
    }
}
