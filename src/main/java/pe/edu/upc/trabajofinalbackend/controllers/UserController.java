package pe.edu.upc.trabajofinalbackend.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.trabajofinalbackend.dtos.EstadisticasporusuariocalorDTO;
import pe.edu.upc.trabajofinalbackend.dtos.UserDTO;
import pe.edu.upc.trabajofinalbackend.dtos.distribuciondesuscriptoresuruarioDTO;
import pe.edu.upc.trabajofinalbackend.entities.Users;
import pe.edu.upc.trabajofinalbackend.servicesinterfaces.IUserService;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/Usuarios")
@Secured("ADMIN")
@PreAuthorize("!hasAuthority('FREE') and !hasAuthority('PREMIUM')")
public class UserController {
    @Autowired
    private IUserService uS;

    @GetMapping
    public List<UserDTO> listar(){

        return uS.list().stream().map(x->{
            ModelMapper m = new ModelMapper();
            return m.map(x, UserDTO.class);
        }).collect(Collectors.toList());
    }
    @PostMapping
    public void insertar(@RequestBody UserDTO dto){
        ModelMapper m = new ModelMapper();
        Users ue = m.map(dto, Users.class);
        uS.insert(ue);
    }
    @GetMapping("/{id}")
    public UserDTO buscarId(@PathVariable("id") int id){
        ModelMapper m = new ModelMapper();
        UserDTO dto=m.map(uS.listId(id), UserDTO.class);
        return dto;
    }

    @PutMapping
    public void modificar(@RequestBody UserDTO dto){
        ModelMapper m = new ModelMapper();
        Users ue  = m.map(dto, Users.class);
        uS.update(ue);
    }
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") int id){
        uS.delete(id);
    }


    @GetMapping("/estadisticasporusuariocalor")
    public List<EstadisticasporusuariocalorDTO> Query01() {
        List<String[]> filaLista = uS.estadisticasporusuariocalor();
        List<EstadisticasporusuariocalorDTO> dtoLista = new ArrayList<>();
        for (String[] columna : filaLista) {
            EstadisticasporusuariocalorDTO dto = new EstadisticasporusuariocalorDTO();
            dto.setName(columna[0]);
            dto.setCorreo(columna[1]);
            dto.setCantidad_registros(Integer.parseInt(columna[2]));
            dto.setPromedio_concentracion(Double.parseDouble(columna[3]));
            dtoLista.add(dto);
        }
        return dtoLista;
    }

    @GetMapping("/distribuciondesuscriptoresuruario")
    public List<distribuciondesuscriptoresuruarioDTO> Query02() {
        List<String[]> filaLista = uS.distribuciondesuscriptoresuruario();
        List<distribuciondesuscriptoresuruarioDTO> dtoLista = new ArrayList<>();
        for (String[] columna : filaLista) {
            distribuciondesuscriptoresuruarioDTO dto = new distribuciondesuscriptoresuruarioDTO();
            dto.setName_susxription(columna[0]);
            dto.setCantidad(Integer.parseInt(columna[1]));
            dto.setPorcentaje(Double.parseDouble(columna[2]));
            dtoLista.add(dto);
        }
        return dtoLista;
    }


}