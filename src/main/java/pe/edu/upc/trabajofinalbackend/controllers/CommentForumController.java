package pe.edu.upc.trabajofinalbackend.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.trabajofinalbackend.dtos.CommentForumDTO;
import pe.edu.upc.trabajofinalbackend.entities.CommentForum;
import pe.edu.upc.trabajofinalbackend.servicesinterfaces.ICommentForumService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/Comentarios")
public class CommentForumController {

    @Autowired
    private ICommentForumService cS;


    @GetMapping
    public List<CommentForumDTO> listar() {
        return cS.list().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, CommentForumDTO.class);
        }).collect(Collectors.toList());
    }


    @PostMapping
    public void insertar(@RequestBody CommentForumDTO dto) {
        ModelMapper m = new ModelMapper();
        CommentForum comment = m.map(dto, CommentForum.class);
        cS.insert(comment);
    }


    @GetMapping("/{id}")
    public CommentForumDTO buscarId(@PathVariable("id") Long id) {
        ModelMapper m = new ModelMapper();
        CommentForumDTO dto = m.map(cS.listId(id), CommentForumDTO.class);
        return dto;
    }


    @PutMapping
    public void modificar(@RequestBody CommentForumDTO dto) {
        ModelMapper m = new ModelMapper();
        CommentForum comment = m.map(dto, CommentForum.class);
        cS.update(comment);
    }


    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Long id) {
        cS.delete(id);
    }
}