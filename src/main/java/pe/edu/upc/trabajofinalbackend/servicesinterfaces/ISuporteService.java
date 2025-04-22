package pe.edu.upc.trabajofinalbackend.servicesinterfaces;

import pe.edu.upc.trabajofinalbackend.dtos.SuporteDTO;
import pe.edu.upc.trabajofinalbackend.entities.Suporte;

import java.util.List;
import java.util.Optional;


public interface ISuporteService {
    Suporte save(SuporteDTO suporteDTO);
    List<Suporte> findAll();
    Optional<Suporte> findById(Long id);
    Suporte update(Long id, SuporteDTO suporteDTO);
    void deleteById(Long id);
}
