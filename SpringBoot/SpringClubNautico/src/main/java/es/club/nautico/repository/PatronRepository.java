package es.club.nautico.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import es.club.nautico.entities.Patron;

@Repository
public interface PatronRepository extends JpaRepository<Patron, Integer>{

}
