package pe.edu.upc.trabajofinalbackend.servicesinterfaces;

import pe.edu.upc.trabajofinalbackend.dtos.TipoSuscripcionDTO;
import pe.edu.upc.trabajofinalbackend.entities.TipoSuscripcion;

import java.util.List;
import java.util.Optional;

public interface ITipoSuscripcionService {
    TipoSuscripcion save(TipoSuscripcionDTO tipoSuscripcionDTO);
    List<TipoSuscripcion> findAll();
    Optional<TipoSuscripcion> findById(Long id);
    TipoSuscripcion update(Long id, TipoSuscripcionDTO tipoSuscripcionDTO);
    void deleteById(Long id);
}

