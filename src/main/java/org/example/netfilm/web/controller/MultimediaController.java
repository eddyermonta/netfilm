package org.example.netfilm.web.controller;

import org.springframework.http.ResponseEntity;

import java.util.List;

public interface MultimediaController<T> {
    public ResponseEntity<T> guardarMultimedia(T multimedia);
    public ResponseEntity<List<T>> buscarMultimedias();
    public ResponseEntity<String> actualizarMultimedia(T multimedia);
    public ResponseEntity<String> eliminarMultimedia(Long peliculaID);
    public ResponseEntity<T> buscarMultimedia(Long peliculaID);
}
