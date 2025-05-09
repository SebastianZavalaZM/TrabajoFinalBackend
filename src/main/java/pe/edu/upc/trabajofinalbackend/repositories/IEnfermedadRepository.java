//Es el archivo que maneja las operaciones basicas para enfermedades en la base de datos (crear, listar, buscar, actualizar, borrar).

package pe.edu.upc.trabajofinalbackend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pe.edu.upc.trabajofinalbackend.entities.Enfermedad;

import java.util.List;

public interface IEnfermedadRepository extends JpaRepository<Enfermedad, Integer> {

    // NUEVO QUERY: cuenta enfermedades por nivel de riesgo
    @Query("SELECT e.nivelRiesgo AS nivelRiesgo, COUNT(e) AS cantidad FROM Enfermedad e GROUP BY e.nivelRiesgo")
    List<Object[]> contarPorNivelRiesgo();
}