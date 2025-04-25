package pe.edu.upc.trabajofinalbackend.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.trabajofinalbackend.dtos.NotificationDTO;
import pe.edu.upc.trabajofinalbackend.entities.Notification;
import pe.edu.upc.trabajofinalbackend.servicesinterfaces.INotificationService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/notification")
public class NotificationController {

    @Autowired
    private INotificationService nS;

    @GetMapping("/listas")
    public List<NotificationDTO> listar(){
        return nS.list().stream().map(z->{
            ModelMapper modelMapper = new ModelMapper();
            return modelMapper.map(z, NotificationDTO.class);
        }).collect(Collectors.toList());
    }

    @PostMapping("/registra")
    public void insertar(@RequestBody NotificationDTO dto) {
        ModelMapper m = new ModelMapper();
        Notification a = m.map(dto, Notification.class);
        nS.insert(a);
    }

    @GetMapping("/{id}")
    public NotificationDTO buscarId(@PathVariable("id") int id){
        ModelMapper m = new ModelMapper();
        NotificationDTO dto=m.map(nS.listId(id), NotificationDTO.class);
        return dto;
    }

    @PutMapping
    public void modificar(@RequestBody NotificationDTO dto){
        ModelMapper m = new ModelMapper();
        Notification a = m.map(dto, Notification.class);
        nS.update(a);
    }
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") int id){
        nS.delete(id);
    }

}
