package es.frikitech.calculadora.infrastructure.api.mappers;

import es.frikitech.calculadora.application.api.CalculadoraServiceImpl;
import es.frikitech.calculadora.domain.Resultado;

import es.frikitech.calculadora.infrastructure.api.dto.ResultadoDto;
import es.frikitech.calculadora.infrastructure.api.repository.SumaRepository;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import static org.junit.jupiter.api.Assertions.assertEquals;


@SpringBootTest
public class CalculadoraServiceTest {


    @MockBean
    private SumaRepository sumaRepository;

    @Autowired
    private CalculadoraServiceImpl calculadoraService;

    @Test
    public void testSumar(){



        Mockito.when(sumaRepository.save(Mockito.any())).thenReturn(null);

        ResultadoDto resultado = calculadoraService.sumar(687);

        System.out.println(resultado.getResultado());

        assertEquals("6 + 8 + 7 = 21", resultado.getResultado());

//       int numero=3;
//
//
//
//       ResultadoDto resultado = calculadoraService.sumar(numero);
//       assertEquals(5, resultado.getResultado());
    }

//
//    @Test
//    public void testRestar(){
//
//        double numero1=3;
//        double numero2 =2;
//
//
//        Resultado resultado = calculadoraService.restar(numero1,numero2);
//        assertEquals(1, resultado.getResultado());
//    }
//
//
//    @Test
//    public void testMultiplicar(){
//
//        double numero1=3;
//        double numero2 =2;
//
//
//        Resultado resultado = calculadoraService.multiplicar(numero1,numero2);
//        assertEquals(6, resultado.getResultado());
//    }
//
//
//    @Test
//    public void testDividir(){
//
//        double numero1=3;
//        double numero2 =2;
//
//
//        Resultado resultado = calculadoraService.dividir(numero1,numero2);
//        assertEquals(1.5, resultado.getResultado());
//    }
}
