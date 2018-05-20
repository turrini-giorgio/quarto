package it.giorgio.quarto.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import it.giorgio.quarto.entity.Utente;

@Repository
public interface UtenteRepository extends JpaRepository<Utente, Integer> {

}
