package pe.edu.upc.trabajofinalbackend.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.trabajofinalbackend.entities.Enfermedad;
import pe.edu.upc.trabajofinalbackend.repositories.IEnfermedadRepository;
import pe.edu.upc.trabajofinalbackend.servicesinterfaces.IEnfermedadService;

import java.util.List;

@Service
public class EnfermedadServiceImplement implements IEnfermedadService {

    @Autowired
    private IEnfermedadRepository eR;

    @Override
    public List<Enfermedad> list() {
        return eR.findAll();
    }

    @Override
    public void insert(Enfermedad e) {
        eR.save(e);
    }

    @Override
    public Enfermedad listId(int id) {
        return eR.findById(id).orElse(new Enfermedad());
    }

    @Override
    public void update(Enfermedad e) {
        eR.save(e);
    }

    @Override
    public void delete(int id) {
        eR.deleteById(id);
    }
}