package es.club.nautico.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import es.club.nautico.entities.Amarre;

@Repository
public interface AmarreRepository extends JpaRepository<Amarre, Integer> {

}
