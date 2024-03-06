package org.example.netfilm.web.controller;


import org.example.netfilm.Persistence.entity.TrailerEntity;
import org.example.netfilm.domain.dto.TrailerDTO;
import org.springframework.http.ResponseEntity;

import java.util.List;

public class TrailerController implements MultimediaController<TrailerDTO> {
    @Override
    public ResponseEntity<TrailerDTO> guardarMultimedia(TrailerDTO multimedia) {
        return null;
    }

    @Override
    public ResponseEntity<List<TrailerDTO>> buscarMultimedias() {
        return null;
    }

    @Override
    public ResponseEntity<String> actualizarMultimedia(TrailerDTO trailerDTO) {
        return null;
    }

    @Override
    public ResponseEntity<String> eliminarMultimedia(Long peliculaID) {
        return null;
    }

    @Override
    public ResponseEntity<TrailerDTO> buscarMultimedia(Long peliculaID) {
        return null;
    }
}