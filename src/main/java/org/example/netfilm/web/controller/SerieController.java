package org.example.netfilm.web.controller;


import org.example.netfilm.domain.dto.SerieDTO;
import org.example.netfilm.domain.service.MultimediaService;
import org.example.netfilm.domain.service.SerieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/serie")
public class SerieController  implements MultimediaController<SerieDTO> {
    private final SerieService serieService;
    private final MultimediaService multimediaService;

    @Autowired
    public SerieController(SerieService serieService, MultimediaService multimediaService) {
        this.serieService = serieService;
        this.multimediaService = multimediaService;
    }

    @Override
    @PostMapping("/guardar")
    public ResponseEntity<SerieDTO> guardarMultimedia(@RequestParam SerieDTO serieDTO) {

        return new ResponseEntity<>(serieService.insertarMultimedia(serieDTO), HttpStatus.OK);
    }

    @GetMapping("/buscarTodo")
    @Override
    public ResponseEntity<List<SerieDTO>> buscarMultimedias() {
        return new ResponseEntity<>(serieService.buscarAllMultimedia(), HttpStatus.OK);
    }

    @PutMapping("/actualizar/")
    @Override
    public ResponseEntity<String> actualizarMultimedia(@RequestParam SerieDTO serieDTO) {
        return (serieService.actualizarMultimedia(serieDTO))?
                new ResponseEntity<>(HttpStatus.OK):
                new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @DeleteMapping("/borrar/{id}")
    @Override
    public ResponseEntity<String> eliminarMultimedia(Long serieID) {
        return (serieService.eliminarMultimedia(serieID))?
                new ResponseEntity<>(HttpStatus.OK):
                new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @GetMapping("/{id}")
    @Override
    public ResponseEntity<SerieDTO> buscarMultimedia(Long serieID) {
        return serieService.buscarMultimedia(serieID)
                .map(pelicula -> new ResponseEntity<>(pelicula,HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }
}
