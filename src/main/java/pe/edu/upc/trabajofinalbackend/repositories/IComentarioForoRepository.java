package pe.edu.upc.trabajofinalbackend.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import pe.edu.upc.trabajofinalbackend.entities.ComentarioForo;

public interface IComentarioForoRepository extends JpaRepository<ComentarioForo, Integer> {
}