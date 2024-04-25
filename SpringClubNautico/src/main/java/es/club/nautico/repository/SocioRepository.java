package es.club.nautico.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import es.club.nautico.entities.Socio;

@Repository
public interface SocioRepository extends JpaRepository<Socio, Integer>{

}
