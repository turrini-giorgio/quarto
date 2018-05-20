package it.giorgio.quarto.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import it.giorgio.quarto.entity.Commento;

@Repository
public interface CommentoRepository extends JpaRepository<Commento, Integer> {

}
