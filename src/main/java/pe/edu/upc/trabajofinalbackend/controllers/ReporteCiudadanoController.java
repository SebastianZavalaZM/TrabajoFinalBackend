package pe.edu.upc.trabajofinalbackend.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.trabajofinalbackend.dtos.ReporteCiudadanoDTO;
import pe.edu.upc.trabajofinalbackend.entities.ReporteCiudadano;
import pe.edu.upc.trabajofinalbackend.servicesinterfaces.IReporteCiudadanoService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/reporteciudadano")
public class ReporteCiudadanoController {

    @Autowired
    private IReporteCiudadanoService rS;

    @GetMapping("/listas")
    public List<ReporteCiudadanoDTO> listar(){

        return rS.list().stream().map(x->{
            ModelMapper m = new ModelMapper();
            return m.map(x, ReporteCiudadanoDTO.class);
        }).collect(Collectors.toList());
    }
    @PostMapping
    public void insertar(@RequestBody ReporteCiudadanoDTO dto){
        ModelMapper m = new ModelMapper();
        ReporteCiudadano ae = m.map(dto, ReporteCiudadano.class);
        rS.insert(ae);
    }
    @GetMapping("/{id}")
    public ReporteCiudadanoDTO buscarId(@PathVariable("id") int id){
        ModelMapper m = new ModelMapper();
        ReporteCiudadanoDTO dto=m.map(rS.listId(id), ReporteCiudadanoDTO.class);
        return dto;
    }

    @PutMapping
    public void modificar(@RequestBody ReporteCiudadanoDTO dto){
        ModelMapper m = new ModelMapper();
        ReporteCiudadano re  = m.map(dto, ReporteCiudadano.class);
        rS.update(re);
    }
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") int id){
        rS.delete(id);
    }
}
