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
    private ITipoEnfermedadRepository tR;

    @Override
    public List<TipoEnfermedad> list() {
        return tR.findAll();
    }

    @Override
    public void insert(TipoEnfermedad t) {
        tR.save(t);
    }

    @Override
    public TipoEnfermedad listId(int id) {
        return tR.findById(id).orElse(new TipoEnfermedad());
    }

    @Override
    public void update(TipoEnfermedad t) {
        tR.save(t);
    }

    @Override
    public void delete(int id) {
        tR.deleteById(id);
    }

    // QUERY 1
    @Override
    public List<TipoEnfermedad> buscarPorNombreContiene(String palabra) {
        return tR.findByNombreContainingIgnoreCase(palabra);
    }

    //  QUERY 2
    @Override
    public Long contarTiposDeEnfermedad() {
        return tR.count();
    }
}