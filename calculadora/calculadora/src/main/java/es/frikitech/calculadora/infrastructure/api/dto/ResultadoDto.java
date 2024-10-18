package es.frikitech.calculadora.infrastructure.api.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import es.frikitech.calculadora.domain.Resultado;

public class ResultadoDto  {

@JsonProperty( "respuesta")
    private String resultado;
private int suma;


public ResultadoDto (String resultado, int suma){

    this.resultado= resultado;
    this.suma = suma;
}
    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }


    public int getSuma() {
        return suma;
    }

    public void setSuma(int suma) {
        this.suma = suma;
    }




}
