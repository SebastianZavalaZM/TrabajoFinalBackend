package pe.edu.upc.trabajofinalbackend.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.trabajofinalbackend.dtos.TipoEnfermedadDTO;
import pe.edu.upc.trabajofinalbackend.entities.TipoEnfermedad;
import pe.edu.upc.trabajofinalbackend.servicesinterfaces.ITipoEnfermedadService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/tipoenfermedades")
public class TipoEnfermedadController {

    @Autowired
    private ITipoEnfermedadService tipoEnfermedadService;

    @GetMapping("/listas")
    public List<TipoEnfermedadDTO> listar() {
        return tipoEnfermedadService.list().stream().map(t -> {
            ModelMapper modelMapper = new ModelMapper();
            return modelMapper.map(t, TipoEnfermedadDTO.class);
        }).collect(Collectors.toList());
    }

    @PostMapping("/registra")
    public void insertar(@RequestBody TipoEnfermedadDTO dto) {
        ModelMapper modelMapper = new ModelMapper();
        TipoEnfermedad tipoEnfermedad = modelMapper.map(dto, TipoEnfermedad.class);
        tipoEnfermedadService.insert(tipoEnfermedad);
    }

    @GetMapping("/{id}")
    public TipoEnfermedadDTO buscarId(@PathVariable("id") int id) {
        ModelMapper modelMapper = new ModelMapper();
        TipoEnfermedadDTO dto = modelMapper.map(tipoEnfermedadService.listId(id), TipoEnfermedadDTO.class);
        return dto;
    }

    @PutMapping
    public void modificar(@RequestBody TipoEnfermedadDTO dto) {
        ModelMapper modelMapper = new ModelMapper();
        TipoEnfermedad tipoEnfermedad = modelMapper.map(dto, TipoEnfermedad.class);
        tipoEnfermedadService.update(tipoEnfermedad);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") int id) {
        tipoEnfermedadService.delete(id);
    }
}