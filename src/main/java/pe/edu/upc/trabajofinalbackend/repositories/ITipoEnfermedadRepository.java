//Aqui estan las instrucciones para buscar, guardar, actualizar y borrar tipos de enfermedad. Ademas, agregamos una busqueda especial por palabra.

package pe.edu.upc.trabajofinalbackend.repositories;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.trabajofinalbackend.entities.TipoEnfermedad;
import java.util.List;

@Repository
public interface ITipoEnfermedadRepository extends JpaRepository<TipoEnfermedad, Integer> {

    // QUERY 1: BUSCAR TIPOS DE ENFERMEDAD POR PALABRA
    List<TipoEnfermedad> findByNombreContainingIgnoreCase(String palabra);
}
