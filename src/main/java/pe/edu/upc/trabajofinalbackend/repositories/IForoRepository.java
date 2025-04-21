package pe.edu.upc.trabajofinalbackend.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import pe.edu.upc.trabajofinalbackend.entities.Foro;

public interface IForoRepository extends JpaRepository<Foro, Integer> {
}

