package pe.edu.upc.trabajofinalbackend.repositories;

import pe.edu.upc.trabajofinalbackend.entities.TipoEnfermedad;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ITipoEnfermedadRepository extends JpaRepository<TipoEnfermedad, Integer> {
}