package es.club.nautico.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import es.club.nautico.entities.Barco;

@Repository
public interface BarcoRepository extends JpaRepository<Barco, Integer>{
	
	
}
