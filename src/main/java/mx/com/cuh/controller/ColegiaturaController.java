package mx.com.cuh.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import mx.com.cuh.entity.Colegiatura;
import mx.com.cuh.pojo.Response;
import mx.com.cuh.service.ColegiaturaService;

@RestController
@RequestMapping("/colegiaturas")
public class ColegiaturaController {

    @Autowired
    private ColegiaturaService colegiaturaService;

    @GetMapping
    public List<Colegiatura> obtenerColegiaturas() {
        return colegiaturaService.obtenerColegiaturas();
    }

    @PostMapping
    public Response insertarColegiatura(@RequestBody Colegiatura colegiatura) {
        return colegiaturaService.insertarColegiatura(colegiatura);
    }

    @PutMapping("/{colegiaturaId}")
    public Response updateColegiatura(@RequestBody Colegiatura colegiatura, @PathVariable Long colegiaturaId) {
        return colegiaturaService.updateColegiatura(colegiatura, colegiaturaId);
    }

    @DeleteMapping("/{colegiaturaId}")
    public Response deleteColegiatura(@PathVariable Long colegiaturaId) {
        return colegiaturaService.deleteColegiatura(colegiaturaId);
    }
}