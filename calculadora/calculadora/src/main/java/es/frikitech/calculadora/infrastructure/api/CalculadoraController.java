package es.frikitech.calculadora.infrastructure.api;


import es.frikitech.calculadora.application.api.CalculadoraService;
import es.frikitech.calculadora.infrastructure.api.dto.ResultadoDto;
import es.frikitech.calculadora.infrastructure.api.mappers.ResultadoDtoMapper;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;


@RestController
@RequestMapping("/calculadora")   //prefijos

public class CalculadoraController {

    private final CalculadoraService service;

    private final ResultadoDtoMapper mapper;


    private CalculadoraController(CalculadoraService service, ResultadoDtoMapper mapper) {
        this.service = service;
        this.mapper = mapper;

    }



    @GetMapping(value = "/suma", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<ResultadoDto> suma(
            @RequestParam int numero

    ){
        try{
            ResultadoDto resultado = service.sumar(numero);
            return ResponseEntity.ok(resultado);
        }catch (Exception e){
            throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR, e.getMessage(), e);




        }

    }

//
//    @GetMapping(value = "/resta", produces = MediaType.APPLICATION_JSON_VALUE)
//    public ResponseEntity<ResultadoDto> restar(
//            @RequestParam double numero1,
//            @RequestParam double numero2
//    ){
//
//        try{
//            return ResponseEntity.ok(mapper.toDto(service.restar(numero1, numero2)));
//        }catch (Exception e){
//            throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR, e.getMessage(), e);
//
//
//
//        }
//    }
//
//
//    @GetMapping(value = "/multiplicacion", produces = MediaType.APPLICATION_JSON_VALUE)
//    public ResponseEntity<ResultadoDto> multiplicar(
//            @RequestParam double numero1,
//            @RequestParam double numero2
//    ){
//
//        try{
//            return ResponseEntity.ok(mapper.toDto(service.multiplicar(numero1, numero2)));
//        }catch (Exception e){
//            throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR, e.getMessage(), e);
//
//        }
//
//    }
//
//
//    @GetMapping(value = "/division", produces = MediaType.APPLICATION_JSON_VALUE)
//    public ResponseEntity<ResultadoDto> dividir(
//            @RequestParam double numero1,
//            @RequestParam double numero2
//    ){
//
//        try{
//            return ResponseEntity.ok(mapper.toDto(service.dividir(numero1, numero2)));
//        }catch (Exception e){
//            throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR, e.getMessage(), e);
//
//        }
//
//    }


}
