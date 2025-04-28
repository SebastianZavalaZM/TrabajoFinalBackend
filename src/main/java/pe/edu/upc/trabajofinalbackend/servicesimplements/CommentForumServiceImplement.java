package pe.edu.upc.trabajofinalbackend.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.trabajofinalbackend.entities.CommentForum;
import pe.edu.upc.trabajofinalbackend.repositories.ICommentForumRepository;
import pe.edu.upc.trabajofinalbackend.servicesinterfaces.ICommentForumService;

import java.util.List;

@Service
public class CommentForumServiceImplement implements ICommentForumService {

    @Autowired
    private ICommentForumRepository cR;

    @Override
    public List<CommentForum> list() { return cR.findAll(); }

    @Override
    public void insert(CommentForum c) { cR.save(c); }

    @Override
    public CommentForum listId(int id) { return cR.findById(id).orElse(new CommentForum()); }

    @Override
    public void update(CommentForum c) { cR.save(c); }

    @Override
    public void delete(int id) { cR.deleteById(id); }

    @Override
    public List<CommentForum> buscar(String nombre) {
        return cR.buscarForo(nombre);
    }

}