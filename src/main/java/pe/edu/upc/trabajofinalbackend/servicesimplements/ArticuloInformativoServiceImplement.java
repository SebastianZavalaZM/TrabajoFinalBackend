package pe.edu.upc.trabajofinalbackend.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.trabajofinalbackend.entities.ArticuloInformativo;
import pe.edu.upc.trabajofinalbackend.repositories.IArticuloInformativoRepository;
import pe.edu.upc.trabajofinalbackend.servicesinterfaces.IArticuloInformativoService;

import java.util.List;
@Service
public class ArticuloInformativoServiceImplement implements IArticuloInformativoService {
    @Autowired
    private IArticuloInformativoRepository aR;

    @Override
    public List<ArticuloInformativo> list() {
        return aR.findAll();
    }

    @Override
    public void insert(ArticuloInformativo a) {aR.save(a);}

    @Override
    public ArticuloInformativo listId(int id) {
        return aR.findById(id).orElse(new ArticuloInformativo());
    }

    @Override
    public void update(ArticuloInformativo a) {
        aR.save(a);
    }

    @Override
    public void delete(int id) { aR.deleteById(id); }

    @Override
    public List<ArticuloInformativo> listConReportes() {
        return aR.buscarPorUsuario();
    }

    @Override
    public List<ArticuloInformativo> buscarPorContenidoDeReportes(String keyword) {
        return aR.buscarPorTituloOContenido(keyword);
    }

}
