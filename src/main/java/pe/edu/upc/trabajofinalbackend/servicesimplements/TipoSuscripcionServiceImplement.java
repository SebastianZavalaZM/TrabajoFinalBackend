package pe.edu.upc.trabajofinalbackend.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.trabajofinalbackend.dtos.TipoSuscripcionDTO;
import pe.edu.upc.trabajofinalbackend.entities.TipoSuscripcion;
import pe.edu.upc.trabajofinalbackend.repositories.ITipoSuscripcionRepository;
import pe.edu.upc.trabajofinalbackend.servicesinterfaces.ITipoSuscripcionService;

import java.util.List;
import java.util.Optional;

@Service
public class TipoSuscripcionServiceImplement implements ITipoSuscripcionService {
    @Autowired
    private ITipoSuscripcionRepository tipoSuscripcionRepository;

    @Override
    public TipoSuscripcion save(TipoSuscripcionDTO tipoSuscripcionDTO) {
        TipoSuscripcion tipoSuscripcion = new TipoSuscripcion();
        tipoSuscripcion.setCodigo(tipoSuscripcionDTO.getCodigo());
        tipoSuscripcion.setDescripcion(tipoSuscripcionDTO.getDescripcion());
        tipoSuscripcion.setFechaInicio(tipoSuscripcionDTO.getFechaInicio());
        tipoSuscripcion.setFechaFin(tipoSuscripcionDTO.getFechaFin());
        tipoSuscripcion.setUsuario(tipoSuscripcionDTO.getUsuario());
        return tipoSuscripcionRepository.save(tipoSuscripcion);
    }

    @Override
    public List<TipoSuscripcion> findAll() {
        return tipoSuscripcionRepository.findAll();
    }

    @Override
    public Optional<TipoSuscripcion> findById(Long id) {
        return tipoSuscripcionRepository.findById(id);
    }

    @Override
    public TipoSuscripcion update(Long id, TipoSuscripcionDTO tipoSuscripcionDTO) {
        Optional<TipoSuscripcion> tipoSuscripcionOptional = tipoSuscripcionRepository.findById(id);

        if (tipoSuscripcionOptional.isPresent()) {
            TipoSuscripcion tipoSuscripcionToUpdate = tipoSuscripcionOptional.get();
            tipoSuscripcionToUpdate.setCodigo(tipoSuscripcionDTO.getCodigo());
            tipoSuscripcionToUpdate.setDescripcion(tipoSuscripcionDTO.getDescripcion());
            tipoSuscripcionToUpdate.setFechaInicio(tipoSuscripcionDTO.getFechaInicio());
            tipoSuscripcionToUpdate.setFechaFin(tipoSuscripcionDTO.getFechaFin());
            tipoSuscripcionToUpdate.setUsuario(tipoSuscripcionDTO.getUsuario());
            return tipoSuscripcionRepository.save(tipoSuscripcionToUpdate);
        }
        return null;
    }

    @Override
    public void deleteById(Long id) {
        tipoSuscripcionRepository.deleteById(id);
    }
}
