package pe.edu.upc.trabajofinalbackend.servicesinterfaces;
import pe.edu.upc.trabajofinalbackend.entities.ComentarioForo;
import java.util.List;

public interface IComentarioForoService {
    void insert(ComentarioForo comentarioForo);
    List<ComentarioForo> list();
    void delete(int idComentario);
}