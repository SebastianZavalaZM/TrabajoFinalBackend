package pe.edu.upc.trabajofinalbackend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.edu.upc.trabajofinalbackend.entities.Enfermedad;

public interface IEnfermedadRepository extends JpaRepository<Enfermedad, Integer> {
}