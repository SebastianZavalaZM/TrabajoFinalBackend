package pe.edu.upc.trabajofinalbackend.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.trabajofinalbackend.dtos.SuscriptionDTO;
import pe.edu.upc.trabajofinalbackend.entities.Suscription;
import pe.edu.upc.trabajofinalbackend.servicesinterfaces.ISuscriptionService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/suscripciones")
public class SuscriptionController {

    @Autowired
    private ISuscriptionService sS;

    @GetMapping("/listar")
    public List<SuscriptionDTO> listar() {
        return sS.list().stream().map(z->{
            ModelMapper m = new ModelMapper();
            return m.map(z, SuscriptionDTO.class);
        }).collect(Collectors.toList());
    }

    @PostMapping("/registrar")
    public void insertar(@RequestBody SuscriptionDTO dto) {
        ModelMapper m = new ModelMapper();
        Suscription a = m.map(dto, Suscription.class);
        sS.insertar(a);

    }

    @GetMapping("/{id}")
    public SuscriptionDTO buscarId(@PathVariable("id") int id){
        ModelMapper m = new ModelMapper();
        SuscriptionDTO dto=m.map(sS.listId(id), SuscriptionDTO.class);
        return dto;
    }

    @PutMapping
    public void modificar(@RequestBody SuscriptionDTO dto){
        ModelMapper m = new ModelMapper();
        Suscription a = m.map(dto, Suscription.class);
        sS.update(a);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") int id){sS.delete(id);
    }


}
