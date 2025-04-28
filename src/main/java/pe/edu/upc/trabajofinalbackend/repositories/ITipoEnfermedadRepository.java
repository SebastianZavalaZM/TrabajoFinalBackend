package pe.edu.upc.trabajofinalbackend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.edu.upc.trabajofinalbackend.entities.TipoEnfermedad;
import java.util.List;

public interface ITipoEnfermedadRepository extends JpaRepository<TipoEnfermedad, Integer> {

    // QUERY 1: BUSCAR TIPOS DE ENFERMEDAD POR PALABRA
    List<TipoEnfermedad> findByNombreContainingIgnoreCase(String palabra);
}
