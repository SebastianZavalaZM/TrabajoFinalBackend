package pe.edu.upc.trabajofinalbackend.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.trabajofinalbackend.dtos.TipoSuscripcionDTO;
import pe.edu.upc.trabajofinalbackend.entities.TipoSuscripcion;
import pe.edu.upc.trabajofinalbackend.servicesinterfaces.ITipoSuscripcionService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/tipo_suscripcion")
public class TipoSuscripcionController {
    @Autowired
    private ITipoSuscripcionService tipoSuscripcionService;

    @PostMapping
    public ResponseEntity<TipoSuscripcion> create(@RequestBody TipoSuscripcionDTO tipoSuscripcionDTO) {
        TipoSuscripcion tipoSuscripcion = tipoSuscripcionService.save(tipoSuscripcionDTO);
        return ResponseEntity.ok(tipoSuscripcion);
    }

    @GetMapping
    public ResponseEntity<List<TipoSuscripcion>> getAll() {
        List<TipoSuscripcion> tipoSuscripciones = tipoSuscripcionService.findAll();
        return ResponseEntity.ok(tipoSuscripciones);
    }

    @GetMapping("/{id}")
    public ResponseEntity<TipoSuscripcion> getById(@PathVariable Long id) {
        Optional<TipoSuscripcion> tipoSuscripcion = tipoSuscripcionService.findById(id);
        return tipoSuscripcion.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PutMapping("/{id}")
    public ResponseEntity<TipoSuscripcion> update(@PathVariable Long id, @RequestBody TipoSuscripcionDTO tipoSuscripcionDTO) {
        Optional<TipoSuscripcion> optionalTipoSuscripcion = tipoSuscripcionService.findById(id);
        if (optionalTipoSuscripcion.isPresent()) {
            TipoSuscripcion tipoSuscripcion = tipoSuscripcionService.update(id, tipoSuscripcionDTO);
            return ResponseEntity.ok(tipoSuscripcion);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        if (tipoSuscripcionService.findById(id).isPresent()) {
            tipoSuscripcionService.deleteById(id);
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}

