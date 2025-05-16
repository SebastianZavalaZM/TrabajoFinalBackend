package pe.edu.upc.trabajofinalbackend.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.trabajofinalbackend.dtos.RoleDTO;
import pe.edu.upc.trabajofinalbackend.entities.Role;
import pe.edu.upc.trabajofinalbackend.servicesinterfaces.IRoleService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/Roles")
//@Secured("ADMIN")
//@PreAuthorize("!hasAuthority('FREE') or !hasAuthority('PREMIUM')")
public class RoleController {

    @Autowired
    private IRoleService rS;

    @PostMapping
    public  void registrar(@RequestBody RoleDTO dto){
        ModelMapper m = new ModelMapper();
        Role r = m.map(dto, Role.class);
        rS.insert(r);
    }

    @GetMapping
    public List<RoleDTO> listar(){
        return rS.list().stream().map(x->{
            ModelMapper m = new ModelMapper();
            return m.map(x,RoleDTO.class);
        }).collect(Collectors.toList());
    }

    @DeleteMapping("/eliminar/{id}")
    public void eliminar(@PathVariable("id") Long id){
        rS.delete(id);
    }


}