package sv.udb.edu.services;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.*;
import sv.udb.edu.domain.Boleto;
import sv.udb.edu.domain.Visitante;
import sv.udb.edu.repository.BoletoRepository;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class BoletoServiceTest {

    @Mock
    private BoletoRepository boletoRepository;

    @InjectMocks
    private BoletoService boletoService;

    private Visitante visitante;

    @BeforeEach
    void setUp() {

        MockitoAnnotations.openMocks(this);

    }

    @Test
    public void testVentaBoletoVIP() {

        Boleto boleto = new Boleto("VIP", 100.0, visitante);


        when(boletoRepository.save(any(Boleto.class))).thenReturn(boleto);


        Boleto resultado = boletoService.comprarBoleto(visitante, "VIP");


        assertEquals("VIP", resultado.getTipo(), "El tipo de boleto no es correcto.");


        assertEquals(100.0, resultado.getPrecio(), "El precio del boleto VIP es incorrecto.");


        verify(boletoRepository, times(1)).save(any(Boleto.class));
    }

    @Test
    public void testVentaBoletoInfantil() {

        Boleto boleto = new Boleto("Infantil", 20.0, visitante);


        when(boletoRepository.save(any(Boleto.class))).thenReturn(boleto);


        Boleto resultado = boletoService.comprarBoleto(visitante, "Infantil");


        assertEquals("Infantil", resultado.getTipo(), "El tipo de boleto no es correcto.");


        assertEquals(20.0, resultado.getPrecio(), "El precio del boleto Infantil es incorrecto.");


        verify(boletoRepository, times(1)).save(any(Boleto.class));
    }

    @Test
    public void testVentaBoletoAdulto() {

        Boleto boleto = new Boleto("Adulto", 50.0, visitante);


        when(boletoRepository.save(any(Boleto.class))).thenReturn(boleto);


        Boleto resultado = boletoService.comprarBoleto(visitante, "Adulto");


        assertEquals("Adulto", resultado.getTipo(), "El tipo de boleto no es correcto.");


        assertEquals(50.0, resultado.getPrecio(), "El precio del boleto Adulto es incorrecto.");


        verify(boletoRepository, times(1)).save(any(Boleto.class));
    }

}
