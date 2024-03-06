package org.example.netfilm.web.controller;

import org.example.netfilm.domain.dto.MultimediaDTO;
import org.example.netfilm.domain.dto.PeliculaDTO;
import org.example.netfilm.domain.repository.MultimediaRepository;
import org.example.netfilm.domain.service.MultimediaService;
import org.example.netfilm.domain.service.PeliculaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/peliculas")
public class PeliculaController implements MultimediaController<PeliculaDTO> {
    private final PeliculaService peliculaService;
    private final MultimediaService multimediaService;

    @Autowired
    public PeliculaController(PeliculaService peliculaService, MultimediaService multimediaService) {
        this.peliculaService = peliculaService;
        this.multimediaService = multimediaService;
    }

    @Override
    @PostMapping("/guardar")
    public ResponseEntity<PeliculaDTO> guardarMultimedia(@RequestBody PeliculaDTO peliculaDTO) {
        peliculaDTO.setMultimedia(multimediaService.insertarMultimedia(new MultimediaDTO()));
        return new ResponseEntity<>(peliculaService.insertarMultimedia(peliculaDTO),HttpStatus.CREATED);
    }

    @Override
    @GetMapping("/buscarTodo")
    public ResponseEntity<List<PeliculaDTO>> buscarMultimedias() {
        return new ResponseEntity<>(peliculaService.buscarAllMultimedia(), HttpStatus.OK);
    }

    @Override
    @PutMapping("/actualizar/")
    public ResponseEntity<String> actualizarMultimedia(@RequestBody PeliculaDTO peliculaDto) {
        return (peliculaService.actualizarMultimedia(peliculaDto))?
                new ResponseEntity<>(HttpStatus.OK):
                new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @Override
    @DeleteMapping("/borrar/{id}")
    public ResponseEntity<String> eliminarMultimedia(@PathVariable("id")Long peliculaID) {
        return (peliculaService.eliminarMultimedia(peliculaID))?
                new ResponseEntity<>(HttpStatus.OK):
                new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @Override
    @GetMapping("/buscar/{id}")
    public ResponseEntity<PeliculaDTO> buscarMultimedia(@PathVariable("id")Long peliculaID) {
        return peliculaService.buscarMultimedia(peliculaID)
                .map(pelicula -> new ResponseEntity<>(pelicula,HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }
}
