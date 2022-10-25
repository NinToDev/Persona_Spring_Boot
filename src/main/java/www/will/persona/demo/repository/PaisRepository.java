package www.will.persona.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import www.will.persona.demo.model.Pais;

public interface PaisRepository extends JpaRepository<Pais, Long> {
}
