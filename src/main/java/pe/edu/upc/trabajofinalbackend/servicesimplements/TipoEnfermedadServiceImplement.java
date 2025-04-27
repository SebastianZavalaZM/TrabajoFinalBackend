package pe.edu.upc.trabajofinalbackend.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.trabajofinalbackend.entities.TipoEnfermedad;
import pe.edu.upc.trabajofinalbackend.repositories.ITipoEnfermedadRepository;
import pe.edu.upc.trabajofinalbackend.servicesinterfaces.ITipoEnfermedadService;

import java.util.List;

@Service
public class TipoEnfermedadServiceImplement implements ITipoEnfermedadService {

    @Autowired
    private ITipoEnfermedadRepository tipoEnfermedadRepository;

    @Override
    public TipoEnfermedad guardar(TipoEnfermedad tipoEnfermedad) {
        return tipoEnfermedadRepository.save(tipoEnfermedad);
    }

    @Override
    public List<TipoEnfermedad> listar() {
        return tipoEnfermedadRepository.findAll();
    }
}