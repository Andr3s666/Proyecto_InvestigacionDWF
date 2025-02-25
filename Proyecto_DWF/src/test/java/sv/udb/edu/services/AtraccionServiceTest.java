package sv.udb.edu.services;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import sv.udb.edu.domain.Atraccion;
import sv.udb.edu.domain.Atraccion.EstadoAtraccion;
import sv.udb.edu.domain.Visitante;
import sv.udb.edu.repository.AtraccionRepository;

import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

public class AtraccionServiceTest {

    @Mock
    private AtraccionRepository atraccionRepository;

    @InjectMocks
    private AtraccionService atraccionService;

    private Atraccion atraccion;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
        atraccion = new Atraccion("Montaña Rusa", 10, 15, EstadoAtraccion.ABIERTA);
    }



    @Test
    public void PermitirIngresoAtraccion() {
        Visitante visitante = mock(Visitante.class);
        when(visitante.getEdad()).thenReturn(16);


        when(atraccionRepository.findById(1L)).thenReturn(java.util.Optional.of(atraccion));
        boolean puedeIngresar = atraccionService.ingresarAtraccion(1L, visitante);

        assertTrue(puedeIngresar, "El niño debería poder ingresar a la montaña rusa.");
    }
}
