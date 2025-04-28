package pe.edu.upc.trabajofinalbackend.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.trabajofinalbackend.entities.Suporte;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.time.LocalDate;
import java.util.List;
@Repository
public interface ISuporteRepository extends JpaRepository<Suporte, Long> {
    // query para buscar soportes dentro de un rango de fechas
    @Query("SELECT s FROM Suporte s WHERE s.fecha BETWEEN :startDate AND :endDate")
    List<Suporte> findByFechaBetween(@Param("startDate") LocalDate startDate, @Param("endDate") LocalDate endDate);

    // query para buscar soportes de un usuario

    @Query("SELECT s FROM Suporte s WHERE s.users.idUsers = :idUsuario")
    List<Suporte> findByUsuarioId(@Param("idUsuario") Long idUsuario);

}

