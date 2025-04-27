package pe.edu.upc.trabajofinalbackend.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.trabajofinalbackend.entities.Enfermedad;
import pe.edu.upc.trabajofinalbackend.entities.TipoEnfermedad;
import pe.edu.upc.trabajofinalbackend.repositories.IEnfermedadRepository;
import pe.edu.upc.trabajofinalbackend.repositories.ITipoEnfermedadRepository;
import pe.edu.upc.trabajofinalbackend.servicesinterfaces.IEnfermedadService;

import java.util.List;

@Service
public class EnfermedadServiceImplement implements IEnfermedadService {

    @Autowired
    private IEnfermedadRepository enfermedadRepository;

    @Autowired
    private ITipoEnfermedadRepository tipoEnfermedadRepository;

    @Override
    public Enfermedad guardar(Enfermedad enfermedad) {
        int idTipo = enfermedad.getTipoEnfermedad().getIdTipo();

        TipoEnfermedad tipoCompleto = tipoEnfermedadRepository.findById(idTipo)
                .orElseThrow(() -> new RuntimeException("TipoEnfermedad no encontrado con id " + idTipo));

        enfermedad.setTipoEnfermedad(tipoCompleto);
        return enfermedadRepository.save(enfermedad);
    }

    @Override
    public List<Enfermedad> listar() {
        return enfermedadRepository.findAll();
    }
}