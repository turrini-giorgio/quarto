package it.giorgio.quarto.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import it.giorgio.quarto.entity.Elemento;

@Repository
public interface ElementoRepository extends JpaRepository<Elemento, Integer> {

}
