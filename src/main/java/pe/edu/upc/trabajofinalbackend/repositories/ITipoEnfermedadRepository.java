package pe.edu.upc.trabajofinalbackend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.edu.upc.trabajofinalbackend.entities.TipoEnfermedad;

public interface ITipoEnfermedadRepository extends JpaRepository<TipoEnfermedad, Integer> {
}