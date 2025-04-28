package pe.edu.upc.trabajofinalbackend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.trabajofinalbackend.entities.CommentForum;

import java.util.List;

@Repository
public interface ICommentForumRepository extends JpaRepository<CommentForum, Integer> {

}
