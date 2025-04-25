package pe.edu.upc.trabajofinalbackend.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.trabajofinalbackend.entities.Suscription;
import pe.edu.upc.trabajofinalbackend.repositories.ISuscriptionRepository;
import pe.edu.upc.trabajofinalbackend.servicesinterfaces.ISuscriptionService;

import java.util.List;

@Service
public class SuscriptionServiceImplement implements ISuscriptionService {

    @Autowired
    private ISuscriptionRepository sR;

    @Override
    public List<Suscription> list() {
        return sR.findAll();
    }

    @Override
    public void insertar(Suscription s) {
        sR.save(s);
    }

    @Override
    public Suscription listId(int id) {
        return sR.findById(id).orElse(new Suscription());
    }

    @Override
    public void update(Suscription s) {
        sR.save(s);
    }

    @Override
    public void delete(int id) {
        sR.deleteById(id);
    }
}
