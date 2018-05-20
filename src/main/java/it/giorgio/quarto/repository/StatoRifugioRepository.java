package it.giorgio.quarto.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import it.giorgio.quarto.entity.StatoRifugio;

@Repository
public interface StatoRifugioRepository extends JpaRepository<StatoRifugio, Integer> {

}
