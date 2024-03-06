package org.example.netfilm.domain.service;


import org.example.netfilm.Persistence.entity.TrailerEntity;
import org.example.netfilm.domain.dto.TrailerDTO;
import org.example.netfilm.domain.repository.MultimediaRepository;

import java.util.List;
import java.util.Optional;

public class TrailerService implements MultimediaRepository<TrailerDTO> {
    @Override
    public TrailerDTO insertarMultimedia(TrailerDTO multimedia) {
        return null;
    }

    @Override
    public List<TrailerDTO> buscarAllMultimedia() {
        return null;
    }

    @Override
    public boolean actualizarMultimedia(TrailerDTO multimediaID) {
        return false;
    }

    @Override
    public boolean eliminarMultimedia(Long multimediaID) {
        return false;
    }

    @Override
    public Optional<TrailerDTO> buscarMultimedia(Long multimediaID) {
        return Optional.empty();
    }
}