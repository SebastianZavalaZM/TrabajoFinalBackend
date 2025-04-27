package pe.edu.upc.trabajofinalbackend.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.trabajofinalbackend.entities.TipoEnfermedad;
import pe.edu.upc.trabajofinalbackend.servicesinterfaces.ITipoEnfermedadService;

import java.util.List;

@RestController
@RequestMapping("/api/tipos-enfermedad")
public class TipoEnfermedadController {

    @Autowired
    private ITipoEnfermedadService tipoEnfermedadService;

    @PostMapping
    public TipoEnfermedad guardar(@RequestBody TipoEnfermedad tipoEnfermedad) {
        return tipoEnfermedadService.guardar(tipoEnfermedad);
    }

    @GetMapping
    public List<TipoEnfermedad> listar() {
        return tipoEnfermedadService.listar();
    }
}