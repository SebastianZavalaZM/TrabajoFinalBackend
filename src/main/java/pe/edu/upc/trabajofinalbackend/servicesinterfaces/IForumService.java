package pe.edu.upc.trabajofinalbackend.servicesinterfaces;

import pe.edu.upc.trabajofinalbackend.entities.Forum;
import pe.edu.upc.trabajofinalbackend.entities.Users;

import java.time.LocalDate;
import java.util.List;

public interface IForumService {
    public List<Forum> list();
    public void insert(Forum f);
    public Forum listId(int id);
    public void update(Forum f);
    public void delete(int id);
    public List<Forum> buscar(LocalDate fechaInicio, LocalDate fechaFin);
}
