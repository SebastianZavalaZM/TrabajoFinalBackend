package pe.edu.upc.trabajofinalbackend.servicesinterfaces;

import pe.edu.upc.trabajofinalbackend.dtos.SuporteDTO;
import pe.edu.upc.trabajofinalbackend.entities.Suporte;

import java.util.List;
import java.util.Optional;


public interface ISuporteService {
    List<Suporte> list();
    void insertar(Suporte suporte);
    Suporte listId(Long id);
    void update(Suporte suporte);
    void delete(Long id);
}
