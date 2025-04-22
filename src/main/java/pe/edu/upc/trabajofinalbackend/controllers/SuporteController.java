package pe.edu.upc.trabajofinalbackend.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.trabajofinalbackend.dtos.SuporteDTO;
import pe.edu.upc.trabajofinalbackend.entities.Suporte;
import pe.edu.upc.trabajofinalbackend.servicesimplements.SuporteServiceImplement;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("suporte")
public class SuporteController {
    @Autowired
    private SuporteServiceImplement suporteService;


    @PostMapping
    public ResponseEntity<Suporte> createSuporte(@RequestBody SuporteDTO suporteDTO) {
        Suporte suporte = suporteService.save(suporteDTO);
        return ResponseEntity.ok(suporte);
    }


    @GetMapping
    public ResponseEntity<List<Suporte>> getAllSuportes() {
        List<Suporte> suportes = suporteService.findAll();
        return ResponseEntity.ok(suportes);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Suporte> getSuporteById(@PathVariable Long id) {
        Optional<Suporte> suporte = suporteService.findById(id);
        return suporte.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }


    @PutMapping("/{id}")
    public ResponseEntity<Suporte> updateSuporte(@PathVariable Long id, @RequestBody SuporteDTO suporteDTO) {
        Optional<Suporte> optionalSuporte = suporteService.findById(id);
        if (optionalSuporte.isPresent()) {
            Suporte suporte = suporteService.update(id, suporteDTO);
            return ResponseEntity.ok(suporte);
        } else {
            return ResponseEntity.notFound().build();
        }
    }


    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteSuporte(@PathVariable Long id) {
        if (suporteService.findById(id).isPresent()) {
            suporteService.deleteById(id);
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
