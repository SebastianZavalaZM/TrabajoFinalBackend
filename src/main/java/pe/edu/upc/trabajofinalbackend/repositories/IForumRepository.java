package pe.edu.upc.trabajofinalbackend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.upc.trabajofinalbackend.entities.Forum;
import pe.edu.upc.trabajofinalbackend.entities.Users;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface IForumRepository extends JpaRepository<Forum, Integer> {

    @Query("Select f from Forum f where f.fechacreacion between :fechaInicio and :fechaFin")
    public List<Forum> buscarPorPeriodo(@Param("fechaInicio") LocalDate fechaInicio, @Param("fechaFin") LocalDate fechaFin);


    @Query(value = "SELECT f.idforum AS idforum, f.titulo AS titulo, COUNT(DISTINCT c.users_id) AS cantidadUsuarios\n" +
            "        FROM foros f\n" +
            "        LEFT JOIN comentariosforos c ON f.idforum = c.idforum\n" +
            "        GROUP BY f.idforum, f.titulo\n" +
            "        ORDER BY f.idforum", nativeQuery = true)
    List<Object[]> obtenerCantidadUsuariosPorForo();
}
