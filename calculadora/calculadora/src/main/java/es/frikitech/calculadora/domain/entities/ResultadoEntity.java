package es.frikitech.calculadora.domain.entities;


import jakarta.persistence.*;
import lombok.Data;


@Entity
@Table(name="calculadora")
@Data
public class ResultadoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private int numeroCifras;
    private int resultado;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getNumeroCifras() {
        return numeroCifras;
    }

    public void setNumeroCifras(int numeroCifras) {
        this.numeroCifras = numeroCifras;
    }

    public int getResultado() {
        return resultado;
    }

    public void setResultado(int resultado) {
        this.resultado = resultado;
    }
}
