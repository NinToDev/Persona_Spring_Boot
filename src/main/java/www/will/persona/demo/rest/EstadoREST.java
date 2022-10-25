package www.will.persona.demo.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import www.will.persona.demo.model.Estado;
import www.will.persona.demo.model.Pais;
import www.will.persona.demo.repository.EstadoRepository;
import www.will.persona.demo.service.EstadoService;
import www.will.persona.demo.service.PaisService;

import java.util.List;

@RestController
@RequestMapping("/estado/")
public class EstadoREST {

    /*
    Inyeccion de estado service.
     */
    @Autowired
    private EstadoService estadoService;

    @GetMapping("{id}")
    private ResponseEntity<List<Estado>> getAllEstadosByPais(@PathVariable("id") Long idPais) {
        return ResponseEntity.ok(estadoService.findEstadoByPaisId(idPais));
    }
}
