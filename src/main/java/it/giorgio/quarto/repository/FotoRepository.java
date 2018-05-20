package it.giorgio.quarto.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import it.giorgio.quarto.entity.Foto;

@Repository
public interface FotoRepository extends JpaRepository<Foto, Integer> {

}
