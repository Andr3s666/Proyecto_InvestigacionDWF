package sv.udb.edu.services;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import sv.udb.edu.domain.Atraccion;
import sv.udb.edu.domain.Visitante;
import sv.udb.edu.repository.AtraccionRepository;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

public class CambioAtraccionServiceTest {

    @Mock
    private AtraccionRepository atraccionRepository;

    @InjectMocks
    private AtraccionService atraccionService;

    private Atraccion atraccion;
    private Atraccion nuevaAtraccion;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
        atraccion = new Atraccion("Carrusel", 10, 12, Atraccion.EstadoAtraccion.MANTENIMIENTO);
        nuevaAtraccion = new Atraccion("Montaña Rusa", 15, 15, Atraccion.EstadoAtraccion.ABIERTA);
    }

    @Test
    public void PonerAtraccionEnMantenimientoYReubicarVisitantes() {

        Visitante visitante1 = mock(Visitante.class);
        Visitante visitante2 = mock(Visitante.class);

        when(visitante1.getEdad()).thenReturn(14);
        when(visitante1.getNombre()).thenReturn("Juan");

        when(visitante2.getEdad()).thenReturn(14);
        when(visitante2.getNombre()).thenReturn("Ana");

        List<Visitante> visitantes = Arrays.asList(visitante1, visitante2);

        when(atraccionRepository.findById(1L)).thenReturn(Optional.of(atraccion));
        when(atraccionRepository.findAll()).thenReturn(Arrays.asList(nuevaAtraccion));


        atraccionService.ponerEnMantenimientoYReubicar(1L, visitantes);

        assertEquals(Atraccion.EstadoAtraccion.MANTENIMIENTO, atraccion.getEstado(), "La atracción debería estar en mantenimiento.");

        verify(visitante1, atLeastOnce()).getEdad();
        verify(visitante2, atLeastOnce()).getEdad();
    }
}
