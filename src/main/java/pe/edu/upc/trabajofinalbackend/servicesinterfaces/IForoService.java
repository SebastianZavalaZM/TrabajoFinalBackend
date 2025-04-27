package pe.edu.upc.trabajofinalbackend.servicesinterfaces;

import pe.edu.upc.trabajofinalbackend.entities.Foro;
import java.util.List;

public interface IForoService {
    void insert(Foro foro);
    List<Foro> list();
    void delete(int idForo);
}