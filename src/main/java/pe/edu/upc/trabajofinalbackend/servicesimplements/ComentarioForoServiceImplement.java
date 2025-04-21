package pe.edu.upc.trabajofinalbackend.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.trabajofinalbackend.entities.ComentarioForo;
import pe.edu.upc.trabajofinalbackend.repositories.IComentarioForoRepository;
import pe.edu.upc.trabajofinalbackend.servicesinterfaces.IComentarioForoService;

import java.util.List;

@Service
public class ComentarioForoServiceImplement implements IComentarioForoService {

    @Autowired
    private IComentarioForoRepository comentarioForoRepository;

    @Override
    public void insert(ComentarioForo comentarioForo){
        comentarioForoRepository.save(comentarioForo);
    }

    @Override
    public void delete(int idComentario){
        comentarioForoRepository.deleteById(idComentario);
    }

    @Override
    public List<ComentarioForo> list() {
        return comentarioForoRepository.findAll();
    }
}
