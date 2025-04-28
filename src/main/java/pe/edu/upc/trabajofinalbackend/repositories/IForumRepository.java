package pe.edu.upc.trabajofinalbackend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.upc.trabajofinalbackend.entities.Forum;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface IForumRepository extends JpaRepository<Forum, Integer> {

    @Query("Select f from Forum f where f.fechacreacion between :fechaInicio and :fechaFin")
    public List<Forum> buscarPorPeriodo(@Param("fechaInicio") LocalDate fechaInicio, @Param("fechaFin") LocalDate fechaFin);

}
