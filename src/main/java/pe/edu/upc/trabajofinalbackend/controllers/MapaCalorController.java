package pe.edu.upc.trabajofinalbackend.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.trabajofinalbackend.dtos.MapaCalorDTO;
import pe.edu.upc.trabajofinalbackend.entities.MapaCalor;
import pe.edu.upc.trabajofinalbackend.servicesinterfaces.IMapaCalorService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/mapacalor")
public class MapaCalorController {
    @Autowired
    private IMapaCalorService mS;

    @GetMapping("/listas")
    public List<MapaCalorDTO> listar(){
        return mS.list().stream().map(z->{
            ModelMapper modelMapper = new ModelMapper();
            return modelMapper.map(z, MapaCalorDTO.class);
        }).collect(Collectors.toList());
    }

    @PostMapping("/registra")
    public void insertar(@RequestBody MapaCalorDTO dto) {
        ModelMapper m = new ModelMapper();
        MapaCalor a = m.map(dto, MapaCalor.class);
        mS.insert(a);

    }

    @GetMapping("/{id}")
    public MapaCalorDTO buscarId(@PathVariable("id") int id){
        ModelMapper m = new ModelMapper();
        MapaCalorDTO dto=m.map(mS.listId(id), MapaCalorDTO.class);
        return dto;
    }

    @PutMapping
    public void modificar(@RequestBody MapaCalorDTO dto){
        ModelMapper m = new ModelMapper();
        MapaCalor a = m.map(dto, MapaCalor.class);
        mS.update(a);
    }
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") int id){
        mS.delete(id);
    }

}
