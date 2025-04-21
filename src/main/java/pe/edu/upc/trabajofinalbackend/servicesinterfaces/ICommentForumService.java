package pe.edu.upc.trabajofinalbackend.servicesinterfaces;

import pe.edu.upc.trabajofinalbackend.entities.CommentForum;

import java.util.List;

public interface ICommentForumService {

    List<CommentForum> list();

    void insert(CommentForum c);

    CommentForum listId(Long id);

    void update(CommentForum c);

    void delete(Long id);
}
