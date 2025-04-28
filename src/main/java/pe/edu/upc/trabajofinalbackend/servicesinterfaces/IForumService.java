package pe.edu.upc.trabajofinalbackend.servicesinterfaces;

import pe.edu.upc.trabajofinalbackend.entities.Forum;

import java.time.LocalDate;
import java.util.List;

public interface IForumService {
    List<Forum> list();
    void insert(Forum f);
    Forum listId(int id);
    void update(Forum f);
    void delete(int id);
    List<Forum> buscar(LocalDate fechaInicio, LocalDate fechaFin);
}
