package es.club.nautico.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import es.club.nautico.entities.Barco;
import es.club.nautico.entities.Salida;

@Repository
public interface SalidaRepository extends JpaRepository<Salida, Integer>{

	@Query("select s from  Salida s where s.barco = ?1")
	public List<Salida> findByBarco(Barco barco);
}
