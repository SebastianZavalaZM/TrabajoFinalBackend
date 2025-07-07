package pe.edu.upc.trabajofinalbackend.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.trabajofinalbackend.dtos.ArticuloInformativoDTO;
import pe.edu.upc.trabajofinalbackend.entities.ArticuloInformativo;
import pe.edu.upc.trabajofinalbackend.servicesinterfaces.IArticuloInformativoService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/articuloinformativo")
//@PreAuthorize("hasAuthority('ADMIN')")
public class ArticuloInformativoController {

    @Autowired
    private IArticuloInformativoService aS;

    @GetMapping("/listas")
    public List<ArticuloInformativoDTO> listar(){

        return aS.list().stream().map(x->{
            ModelMapper m = new ModelMapper();
            return m.map(x, ArticuloInformativoDTO.class);
        }).collect(Collectors.toList());
    }
    @PostMapping("/registra")
    public void insertar(@RequestBody ArticuloInformativoDTO dto){
        ModelMapper m = new ModelMapper();
        ArticuloInformativo ae = m.map(dto, ArticuloInformativo.class);
        aS.insert(ae);
    }
    @GetMapping("/{id}")
    public ArticuloInformativoDTO buscarId(@PathVariable("id") int id){
        ModelMapper m = new ModelMapper();
        ArticuloInformativoDTO dto=m.map(aS.listId(id), ArticuloInformativoDTO.class);
        return dto;
    }

    @PutMapping
    public void modificar(@RequestBody ArticuloInformativoDTO dto){
        ModelMapper m = new ModelMapper();
        ArticuloInformativo ae  = m.map(dto, ArticuloInformativo.class);
        aS.update(ae);
    }
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") int id){
        aS.delete(id);
    }

    @GetMapping("/listarreportes")
    public List<ArticuloInformativoDTO> buscarPorUsuario() {
        return aS.listConReportes().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, ArticuloInformativoDTO.class);
        }).collect(Collectors.toList());
    }

    @GetMapping("/buscartitulo")
    public List<ArticuloInformativoDTO> buscarPorTituloOContenido(@RequestParam("keyword") String keyword) {
        return aS.buscarPorTitulo(keyword).stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, ArticuloInformativoDTO.class);
        }).collect(Collectors.toList());
    }

}
