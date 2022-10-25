package www.will.persona.demo.rest;

import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import www.will.persona.demo.model.Persona;
import www.will.persona.demo.service.PersonaService;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/personas/")
public class PersonaREST {

    /*
    Inyeccion. @Autowired
     */
    @Autowired
    private PersonaService personaService;

    /*
    Endpoint en donde vamos a listar todas las personas disponibles en la BD.
     */
    @GetMapping
    private List<Persona> getAllPersonas() {
        return personaService.findAll();
    }

    /*
    Endpoint donde vamos a registrar una persona en la BD.
     */
    @PostMapping
    private ResponseEntity<Persona> SavePersona(@RequestBody Persona persona) {
        try {
            Persona oPersona = personaService.save(persona);
            return ResponseEntity.created(new URI("/personas/" + persona.getId())).body(persona);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }

    }

    @DeleteMapping(value = "delete/{id}")
    private ResponseEntity<Boolean> EliminarPersona(@PathVariable("id") Long id) {
        personaService.deleteById(id);
        return ResponseEntity.ok(personaService.findById(id)!= null);
    }
}
