package pe.edu.upc.trabajofinalbackend.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.trabajofinalbackend.entities.Forum;
import pe.edu.upc.trabajofinalbackend.repositories.IForumRepository;
import pe.edu.upc.trabajofinalbackend.servicesinterfaces.IForumService;

import java.time.LocalDate;
import java.util.List;

@Service
public class ForumServiceImplement implements IForumService {

    @Autowired
    private IForumRepository forumRepository;

    @Override
    public List<Forum> list() { return forumRepository.findAll(); }

    @Override
    public void insert(Forum f) { forumRepository.save(f); }

    @Override
    public Forum listId(int id) { return forumRepository.findById(id).orElse(new Forum()); }

    @Override
    public void update(Forum f) { forumRepository.save(f); }

    @Override
    public void delete(int id) { forumRepository.deleteById(id); }

    @Override
    public List<Forum> buscarPorPeriodo(LocalDate fechaInicio, LocalDate fechaFin) { return forumRepository.buscarPorPeriodo(fechaInicio, fechaFin); }



}
