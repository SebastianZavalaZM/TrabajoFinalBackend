package pe.edu.upc.trabajofinalbackend.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.trabajofinalbackend.dtos.EnfermedadDTO;
import pe.edu.upc.trabajofinalbackend.entities.Enfermedad;
import pe.edu.upc.trabajofinalbackend.servicesinterfaces.IEnfermedadService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/enfermedades")
public class EnfermedadController {

    @Autowired
    private IEnfermedadService enfermedadService;

    @GetMapping("/listas")
    public List<EnfermedadDTO> listar() {
        return enfermedadService.list().stream().map(e -> {
            ModelMapper modelMapper = new ModelMapper();
            return modelMapper.map(e, EnfermedadDTO.class);
        }).collect(Collectors.toList());
    }

    @PostMapping("/registra")
    public void insertar(@RequestBody EnfermedadDTO dto) {
        ModelMapper modelMapper = new ModelMapper();
        Enfermedad enfermedad = modelMapper.map(dto, Enfermedad.class);
        enfermedadService.insert(enfermedad);
    }

    @GetMapping("/{id}")
    public EnfermedadDTO buscarId(@PathVariable("id") int id) {
        ModelMapper modelMapper = new ModelMapper();
        EnfermedadDTO dto = modelMapper.map(enfermedadService.listId(id), EnfermedadDTO.class);
        return dto;
    }

    @PutMapping
    public void modificar(@RequestBody EnfermedadDTO dto) {
        ModelMapper modelMapper = new ModelMapper();
        Enfermedad enfermedad = modelMapper.map(dto, Enfermedad.class);
        enfermedadService.update(enfermedad);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") int id) {
        enfermedadService.delete(id);
    }
}