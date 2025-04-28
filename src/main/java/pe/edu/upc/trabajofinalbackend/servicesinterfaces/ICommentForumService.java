package pe.edu.upc.trabajofinalbackend.servicesinterfaces;

import pe.edu.upc.trabajofinalbackend.entities.CommentForum;

import java.util.List;

public interface ICommentForumService {

    List<CommentForum> list();

    void insert(CommentForum c);

    CommentForum listId(int id);

    void update(CommentForum c);

    void delete(int id);

    List<CommentForum> buscar(String nombre);
}
