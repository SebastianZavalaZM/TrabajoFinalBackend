package pe.edu.upc.trabajofinalbackend.servicesinterfaces;


import pe.edu.upc.trabajofinalbackend.entities.ReporteCiudadano;

import java.util.List;

public interface IReporteCiudadanoService {
    public List<ReporteCiudadano> list();
    public void insert(ReporteCiudadano reporteCiudadano);
    public ReporteCiudadano listId(int id);
    public void update(ReporteCiudadano reporteCiudadano);
    public void delete(int id);

    List<ReporteCiudadano> buscarPorCiudadOEnfermedad(String cuidad, String enfermedad);

}
