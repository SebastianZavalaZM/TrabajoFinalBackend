package pe.edu.upc.trabajofinalbackend.servicesimplements;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.trabajofinalbackend.entities.Foro;
import pe.edu.upc.trabajofinalbackend.repositories.IForoRepository;
import pe.edu.upc.trabajofinalbackend.servicesinterfaces.IForoService;
import java.util.List;

@Service
public class ForoServiceImplement implements IForoService {

    @Autowired
    private IForoRepository foroRepository;

    @Override
    public void insert(Foro foro) {
        foroRepository.save(foro);
    }

    @Override
    public List<Foro> list() {
        return foroRepository.findAll();
    }

    @Override
    public void delete(int idForo) {
        foroRepository.deleteById(idForo);
    }
}