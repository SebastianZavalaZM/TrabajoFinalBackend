package pe.edu.upc.trabajofinalbackend.controllers;

import org.apache.catalina.User;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.trabajofinalbackend.dtos.UserDTO;
import pe.edu.upc.trabajofinalbackend.entities.Users;
import pe.edu.upc.trabajofinalbackend.servicesinterfaces.IUserService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/Usuarios")
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



}