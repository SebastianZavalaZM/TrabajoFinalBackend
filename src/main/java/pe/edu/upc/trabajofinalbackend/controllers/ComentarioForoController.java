package pe.edu.upc.trabajofinalbackend.controllers;
import jakarta.persistence.GeneratedValue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.trabajofinalbackend.entities.ComentarioForo;
import pe.edu.upc.trabajofinalbackend.servicesinterfaces.IComentarioForoService;
import java.util.List;


@RestController
@RequestMapping("/comentarioforo")
public class ComentarioForoController {

    @Autowired
    private IComentarioForoService comentarioForoService;

    @PostMapping
    public void registrar(@RequestBody ComentarioForo comentarioForo){
        comentarioForoService.insert(comentarioForo);
    }

    @GetMapping
    public List<ComentarioForo> listar(){
        return comentarioForoService.list();
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable int id){
        comentarioForoService.delete(id);
    }
}
