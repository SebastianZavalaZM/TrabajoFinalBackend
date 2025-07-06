package pe.edu.upc.trabajofinalbackend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.upc.trabajofinalbackend.entities.ReporteCiudadano;

import java.util.List;

@Repository
public interface IReporteCiudadanoRepository extends JpaRepository<ReporteCiudadano, Integer> {

    @Query("SELECT r FROM ReporteCiudadano r WHERE r.cuidad LIKE :cuidad OR r.enfermedad.nombre LIKE :enfermedad")
    List<ReporteCiudadano> buscarPorCiudadOEnfermedad(@Param("cuidad") String ciudad, @Param("enfermedad") String enfermedad);

}
