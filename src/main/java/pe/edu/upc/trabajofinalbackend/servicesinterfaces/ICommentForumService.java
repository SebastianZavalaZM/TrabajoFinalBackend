package pe.edu.upc.trabajofinalbackend.servicesinterfaces;

import pe.edu.upc.trabajofinalbackend.entities.CommentForum;

import java.util.List;

public interface ICommentForumService {

    public List<CommentForum> list();

    public void insert(CommentForum c);

    public CommentForum listId(int id);

    public void update(CommentForum c);

    public void delete(int id);

    public List<CommentForum> buscar(String nombre);
}
