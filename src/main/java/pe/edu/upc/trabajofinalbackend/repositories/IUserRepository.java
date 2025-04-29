package pe.edu.upc.trabajofinalbackend.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pe.edu.upc.trabajofinalbackend.entities.Users;

import java.util.List;

@Repository
public interface IUserRepository extends JpaRepository<Users, Integer> {

    @Query(value = "SELECT f.idforum AS idforum, f.titulo AS titulo, COUNT(DISTINCT c.users_id) AS cantidadUsuarios\n" +
            "        FROM foros f\n" +
            "        LEFT JOIN comentariosforos c ON f.idforum = c.idforum\n" +
            "        GROUP BY f.idforum, f.titulo\n" +
            "        ORDER BY f.idforum", nativeQuery = true)
    List<Object[]> obtenerCantidadUsuariosPorForo();

}