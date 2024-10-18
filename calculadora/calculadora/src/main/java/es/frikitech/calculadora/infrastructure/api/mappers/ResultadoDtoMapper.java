package es.frikitech.calculadora.infrastructure.api.mappers;

import es.frikitech.calculadora.domain.Resultado;
import es.frikitech.calculadora.infrastructure.api.dto.ResultadoDto;
import org.mapstruct.Mapper;


@Mapper(componentModel  = "spring")
public interface ResultadoDtoMapper {

    ResultadoDto toDto(Resultado domain);





}
