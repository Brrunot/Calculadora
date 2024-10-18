package es.frikitech.calculadora.infrastructure.api.mappers;

import es.frikitech.calculadora.domain.Resultado;
import es.frikitech.calculadora.infrastructure.api.dto.ResultadoDto;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-10-17T16:56:10+0200",
    comments = "version: 1.6.0, compiler: javac, environment: Java 21 (Oracle Corporation)"
)
@Component
public class ResultadoDtoMapperImpl implements ResultadoDtoMapper {

    @Override
    public ResultadoDto toDto(Resultado domain) {
        if ( domain == null ) {
            return null;
        }

        String resultado = null;

        resultado = domain.getResultado();

        int suma = 0;

        ResultadoDto resultadoDto = new ResultadoDto( resultado, suma );

        return resultadoDto;
    }
}
