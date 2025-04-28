package pe.edu.upc.trabajofinalbackend.servicesinterfaces;

import pe.edu.upc.trabajofinalbackend.entities.Forum;

import java.util.List;

public interface IForumService {


    void insert(Forum f);

    List<Forum> list();

    Forum list(int id);

    void update(Forum f);

    void delete(int id);
}
