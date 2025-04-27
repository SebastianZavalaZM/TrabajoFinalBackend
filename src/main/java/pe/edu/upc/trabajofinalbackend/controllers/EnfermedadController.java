package pe.edu.upc.trabajofinalbackend.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.trabajofinalbackend.entities.Enfermedad;
import pe.edu.upc.trabajofinalbackend.servicesinterfaces.IEnfermedadService;

import java.util.List;

@RestController
@RequestMapping("/api/enfermedades")
public class EnfermedadController {

    @Autowired
    private IEnfermedadService enfermedadService;

    @PostMapping
    public Enfermedad guardar(@RequestBody Enfermedad enfermedad) {
        return enfermedadService.guardar(enfermedad);
    }

    @GetMapping
    public List<Enfermedad> listar() {
        return enfermedadService.listar();
    }
}