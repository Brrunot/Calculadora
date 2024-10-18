package es.frikitech.calculadora.application.api;

import es.frikitech.calculadora.domain.entities.ResultadoEntity;
import es.frikitech.calculadora.infrastructure.api.dto.ResultadoDto;
import es.frikitech.calculadora.infrastructure.api.repository.SumaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CalculadoraServiceImpl  implements CalculadoraService {

    @Autowired
    private SumaRepository sumaRepository;

    @Override
    public ResultadoDto sumar(int numero) {
        List<Integer> cifras = new ArrayList<>();
        int solucion = 0;
        int numeroCifras = numero;

        while (numero > 0) {
            int cifra = numero % 10;
            cifras.add(cifra);
            solucion += cifra;
            numero = numero / 10;
        }


        String resultado  =cifras.stream()
                .map(String::valueOf)
                .collect(Collectors.joining(" + ")) + " = " + solucion;

        ResultadoEntity resultadoEntity = new ResultadoEntity();
        resultadoEntity.setNumeroCifras(numeroCifras);
        resultadoEntity.setResultado(solucion);
        sumaRepository.save(resultadoEntity);

        return new ResultadoDto(resultado, solucion);
    }


//    @Override
//    public Resultado restar(double numero1, double numero2) {
//        return new Resultado(numero1 - numero2);
//    }
//
//    @Override
//    public Resultado multiplicar(double numero1, double numero2) {
//        return new Resultado(numero1  * numero2);
//    }
//
//    @Override
//    public Resultado dividir(double numero1, double numero2) {
//        return new Resultado(numero1 / numero2);
//    }

}
