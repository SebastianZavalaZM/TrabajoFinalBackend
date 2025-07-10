package pe.edu.upc.trabajofinalbackend.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import pe.edu.upc.trabajofinalbackend.entities.Users;

import java.util.List;

@Repository
public interface IUserRepository extends JpaRepository<Users, Integer> {
    public Users findOneByUsername(String username);

    //BUSCAR POR NOMBRE
    @Query("select count(u.username) from Users u where u.username =:username")
    public int buscarUsername(@Param("username") String nombre);

    //INSERTAR ROLES
    @Transactional
    @Modifying
    @Query(value = "insert into roles (rol, users_id) VALUES (:rol, :users_id)", nativeQuery = true)
    public void insRol(@Param("rol") String authority, @Param("users_id") Long users_id);


    @Query( value = "SELECT u.username, u.correo,\n" +
            " COUNT(m.idmapacalor) AS cantidad_registros,\n" +
            " AVG(m.concentraciondecalor) AS promedio_concentracion\n" +
            " FROM users u\n" +
            " JOIN MapaCalor m ON u.id_users = m.users_id\n" +
            " GROUP BY u.username, u.correo;", nativeQuery = true)
    List<String[]> estadisticasporusuariocalor();


    @Query(value = "SELECT ts.name_suscription,\n" +
            " COUNT(ts.id_suscription) AS cantidad,\n" +
            " COUNT(ts.id_suscription) * 100.0 / (SELECT COUNT(*) FROM users) AS porcentaje\n" +
            " FROM users u\n" +
            " LEFT JOIN suscription ts ON u.id_users = ts.users_id\n" +
            " GROUP BY ts.name_suscription;", nativeQuery = true)
    List<String[]> distribuciondesuscriptoresuruario();
}