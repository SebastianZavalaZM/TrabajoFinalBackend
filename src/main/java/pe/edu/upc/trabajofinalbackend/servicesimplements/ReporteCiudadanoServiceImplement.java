package pe.edu.upc.trabajofinalbackend.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.trabajofinalbackend.entities.ReporteCiudadano;
import pe.edu.upc.trabajofinalbackend.repositories.IReporteCiudadanoRepository;
import pe.edu.upc.trabajofinalbackend.servicesinterfaces.IReporteCiudadanoService;

import java.util.List;
@Service
public class ReporteCiudadanoServiceImplement implements IReporteCiudadanoService {

    @Autowired
    private IReporteCiudadanoRepository rR;

    @Override
    public List<ReporteCiudadano> list() {
        return rR.findAll();
    }

    @Override
    public void insert(ReporteCiudadano r) {rR.save(r);}

    @Override
    public ReporteCiudadano listId(int id) {
        return rR.findById(id).orElse(new ReporteCiudadano());
    }

    @Override
    public void update(ReporteCiudadano r) {
        rR.save(r);
    }

    @Override
    public void delete(int id) { rR.deleteById(id); }

}
