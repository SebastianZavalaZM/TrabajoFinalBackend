package pe.edu.upc.trabajofinalbackend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.edu.upc.trabajofinalbackend.entities.TipoSuscripcion;

public interface ITipoSuscripcionRepository extends JpaRepository<TipoSuscripcion, Long> {
}
