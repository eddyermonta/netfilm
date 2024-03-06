package org.example.netfilm.domain.repository;

import java.util.List;
import java.util.Optional;

public interface MultimediaRepository<T>{
    T insertarMultimedia(T multimedia);
    List<T> buscarAllMultimedia();
    boolean actualizarMultimedia(T multimedia);
    boolean eliminarMultimedia(Long multimediaID);
    Optional<T> buscarMultimedia(Long multimediaID);
}
