package www.will.persona.demo.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import www.will.persona.demo.model.Pais;
import www.will.persona.demo.service.PaisService;

import java.util.List;

@RequestMapping("/pais/")
@RestController
public class PaisREST {
    @Autowired
    private PaisService paisService;

    @GetMapping
    private List<Pais> getAllPais (){
        return paisService.findAll();
    }
}
