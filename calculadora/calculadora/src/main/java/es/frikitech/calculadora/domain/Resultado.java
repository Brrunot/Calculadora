package es.frikitech.calculadora.domain;


import lombok.Data;


@Data

public class Resultado {


    private String resultado;


    public Resultado(String resultado) {
        this.resultado = resultado;

    }

    public String getResultado() {
        return resultado;

    }
}


