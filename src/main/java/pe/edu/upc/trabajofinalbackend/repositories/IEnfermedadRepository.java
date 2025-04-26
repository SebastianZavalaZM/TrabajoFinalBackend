package pe.edu.upc.trabajofinalbackend.repositories;

import pe.edu.upc.trabajofinalbackend.entities.Enfermedad;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IEnfermedadRepository extends JpaRepository<Enfermedad, Integer> {
}