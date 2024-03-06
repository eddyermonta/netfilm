package org.example.netfilm.domain.service;

import org.example.netfilm.Persistence.crud.MultimediaCrudRepository;
import org.example.netfilm.Persistence.entity.MultimediaEntity;
import org.example.netfilm.domain.dto.MultimediaDTO;
import org.example.netfilm.domain.repository.MultimediaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MultimediaService implements MultimediaRepository<MultimediaDTO> {
    private final MultimediaCrudRepository multimediaCrudRepository;

    @Autowired
    public MultimediaService(MultimediaCrudRepository multimediaCrudRepository) {
        this.multimediaCrudRepository = multimediaCrudRepository;
    }

    @Override
    public MultimediaDTO insertarMultimedia(MultimediaDTO multimediaDTO) {
        MultimediaEntity multimediaEntity = new MultimediaEntity();
        multimediaEntity = multimediaCrudRepository.save(multimediaEntity);
        multimediaDTO.setIdMultimedia(multimediaEntity.getIdMultimedia());
        return multimediaDTO;
    }

    @Override
    public List<MultimediaDTO> buscarAllMultimedia() {
        return null;
    }

    @Override
    public boolean actualizarMultimedia(MultimediaDTO multimediaDTO) {
        return false;
    }

    @Override
    public boolean eliminarMultimedia(Long multimediaID) {
        return false;
    }

    @Override
    public Optional<MultimediaDTO> buscarMultimedia(Long multimediaID) {
        return Optional.empty();
    }
}
