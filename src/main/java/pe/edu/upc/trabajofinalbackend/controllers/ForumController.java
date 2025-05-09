package pe.edu.upc.trabajofinalbackend.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.trabajofinalbackend.dtos.ForumDTO;
import pe.edu.upc.trabajofinalbackend.entities.Forum;
import pe.edu.upc.trabajofinalbackend.servicesinterfaces.IForumService;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/Foros")
@Secured("ADMIN")
public class ForumController {

    @Autowired
    private IForumService fS;

    @GetMapping("/Listar")
    public List<ForumDTO> listar() {
        return fS.list().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, ForumDTO.class);
        }).collect(Collectors.toList());
    }

    @PostMapping("/Registrar")
    public void insertar(@RequestBody ForumDTO dto) {
        ModelMapper m = new ModelMapper();
        Forum f = m.map(dto, Forum.class);
        fS.insert(f);
    }

    @GetMapping("/{id}")
    public ForumDTO buscar(@PathVariable("id") int id) {
        ModelMapper m = new ModelMapper();
        ForumDTO dto = m.map(fS.listId(id), ForumDTO.class);
        return dto;
    }

    @PutMapping("/Modificar")
    public void modificar(@RequestBody ForumDTO dto) {
        ModelMapper m = new ModelMapper();
        Forum forum = m.map(dto, Forum.class);
        fS.update(forum);
    }

    @GetMapping("/ListarPorPeriodo")
    public List<ForumDTO> buscarPorPerido(@RequestParam LocalDate fechaInicio, @RequestParam LocalDate fechaFin){
        return fS.buscar(fechaInicio, fechaFin).stream().map(z->{
            ModelMapper m = new ModelMapper();
            return m.map(z, ForumDTO.class);
        }).collect(Collectors.toList());
    }


    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") int id) {
        fS.delete(id);
    }

}