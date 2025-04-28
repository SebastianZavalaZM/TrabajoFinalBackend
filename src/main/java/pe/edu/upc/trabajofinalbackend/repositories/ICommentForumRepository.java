package pe.edu.upc.trabajofinalbackend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.upc.trabajofinalbackend.entities.CommentForum;

import java.util.List;

@Repository
public interface ICommentForumRepository extends JpaRepository<CommentForum, Integer> {

    @Query("Select c from CommentForum c where c.forums.titulo like %:nTitulo%")
    public List<CommentForum> buscarForo(@Param("nTitulo") String nTitulo);

}
