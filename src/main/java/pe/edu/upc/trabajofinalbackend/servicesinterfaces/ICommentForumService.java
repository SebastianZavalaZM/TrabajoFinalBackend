package pe.edu.upc.trabajofinalbackend.servicesinterfaces;

import org.springframework.data.repository.query.Param;
import pe.edu.upc.trabajofinalbackend.entities.CommentForum;

import java.util.List;

public interface ICommentForumService {

    List<CommentForum> list();
    void insert(CommentForum c);
    CommentForum listId(int id);
    void update(CommentForum c);
    void delete(int id);
    public List<CommentForum> buscarForo(String nTitulo);
}
