package es.frikitech.calculadora.infrastructure.api.repository;


import es.frikitech.calculadora.domain.entities.ResultadoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SumaRepository extends JpaRepository<ResultadoEntity, Integer> {
}
