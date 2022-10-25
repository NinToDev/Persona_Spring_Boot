package www.will.persona.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import www.will.persona.demo.model.Estado;

public interface EstadoRepository extends JpaRepository<Estado, Long> {
}
