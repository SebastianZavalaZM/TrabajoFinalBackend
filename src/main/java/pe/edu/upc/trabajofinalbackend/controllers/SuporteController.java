package pe.edu.upc.trabajofinalbackend.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.trabajofinalbackend.dtos.SuporteDTO;
import pe.edu.upc.trabajofinalbackend.entities.Suporte;

import pe.edu.upc.trabajofinalbackend.servicesinterfaces.ISuporteService;


import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;


@RestController
@RequestMapping("/suportes")
//@PreAuthorize("hasAuthority('ADMIN')")
//@PreAuthorize("!hasAuthority('ADMIN')")
public class SuporteController {

    @Autowired
    private ISuporteService suporteService;

    @GetMapping("/listas")
    public List<SuporteDTO> listar() {
        return suporteService.list().stream().map(x -> {
            ModelMapper modelMapper = new ModelMapper();
            return modelMapper.map(x, SuporteDTO.class);
        }).collect(Collectors.toList());
    }

    @PostMapping("/registra")
    public void insertar(@RequestBody SuporteDTO suporteDTO) {
        ModelMapper modelMapper = new ModelMapper();
        Suporte suporte = modelMapper.map(suporteDTO, Suporte.class);
        suporteService.insertar(suporte);
    }

    @GetMapping("/{id}")
    public SuporteDTO buscarPorId(@PathVariable("id") Long id) {
        ModelMapper modelMapper = new ModelMapper();
        SuporteDTO suporteDTO = modelMapper.map(suporteService.listId(id), SuporteDTO.class);
        return suporteDTO;
    }

    @PutMapping
    public void modificar(@RequestBody SuporteDTO suporteDTO) {
        ModelMapper modelMapper = new ModelMapper();
        Suporte suporte = modelMapper.map(suporteDTO, Suporte.class);
        suporteService.update(suporte);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Long id) {
        suporteService.delete(id);
    }

    @GetMapping("/buscar-fechas")
    public List<SuporteDTO> buscarPorFechas(@RequestParam String startDate, @RequestParam String endDate) {
        LocalDate start = LocalDate.parse(startDate);
        LocalDate end = LocalDate.parse(endDate);

        return suporteService.buscarPorRangoDeFechas(start, end).stream().map(suporte -> {
            ModelMapper modelMapper = new ModelMapper();
            return modelMapper.map(suporte, SuporteDTO.class);
        }).collect(Collectors.toList());
    }
    @GetMapping("/buscar-usuario")
    public List<SuporteDTO> buscarPorUsuario(@RequestParam Long idUsuario) {
        return suporteService.buscarPorUsuarioId(idUsuario).stream().map(suporte -> {
            ModelMapper modelMapper = new ModelMapper();
            return modelMapper.map(suporte, SuporteDTO.class);
        }).collect(Collectors.toList());
    }


}

