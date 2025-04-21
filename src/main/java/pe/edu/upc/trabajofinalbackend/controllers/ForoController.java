package pe.edu.upc.trabajofinalbackend.controllers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.trabajofinalbackend.entities.Foro;
import pe.edu.upc.trabajofinalbackend.servicesinterfaces.IForoService;
import java.util.List;

@RestController
@RequestMapping("/foro")


public class ForoController {
    @Autowired
    private IForoService foroService;

    @PostMapping
    public void registrar(@RequestBody Foro f) {
        foroService.insert(f);
    }

    @GetMapping
    public List<Foro> listar() {
        return foroService.list();
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id) {
        foroService.delete(id);
    }
}
