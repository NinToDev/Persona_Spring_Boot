package www.will.persona.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import www.will.persona.demo.model.Persona;

/**
 * En este caso estamos usando JPA, por ende no es necesario crear los metodos que iriamos a usar.
 */
public interface PersonaRepository extends JpaRepository<Persona, Long>{
}
