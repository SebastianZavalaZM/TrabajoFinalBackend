package pe.edu.upc.trabajofinalbackend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.edu.upc.trabajofinalbackend.entities.ReporteCiudadano;

public interface IReporteCiudadanoRepository extends JpaRepository<ReporteCiudadano, Integer> {
}
