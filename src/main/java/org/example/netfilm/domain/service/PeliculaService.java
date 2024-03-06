package org.example.netfilm.domain.service;

import org.example.netfilm.Persistence.crud.PeliculaCrudRepository;
import org.example.netfilm.Persistence.entity.PeliculaEntity;
import org.example.netfilm.domain.dto.PeliculaDTO;
import org.example.netfilm.domain.repository.MultimediaRepository;
import org.example.netfilm.domain.factory.MultimediaFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PeliculaService implements MultimediaRepository<PeliculaDTO> {
    private final PeliculaCrudRepository peliculaRepository;
    private final MultimediaFactory<PeliculaDTO,PeliculaEntity> peliculaFactory;

    @Autowired
    public PeliculaService(PeliculaCrudRepository peliculaRepository, MultimediaFactory<PeliculaDTO,PeliculaEntity> peliculaFactory) {
        this.peliculaRepository = peliculaRepository;
        this.peliculaFactory = peliculaFactory;
    }
    @Override
    public PeliculaDTO insertarMultimedia(PeliculaDTO peliculaDto) {
        PeliculaEntity peliculaEntity = peliculaFactory.convertirAEntity(peliculaDto);
        peliculaDto.setMultimedia(null);
        peliculaRepository.save(peliculaEntity);
        return peliculaDto;
    }


    public List<PeliculaDTO> buscarAllMultimedia() {
        List<PeliculaEntity> peliculaEntities = peliculaRepository.findAll();
        return  peliculaFactory.convertirADTO(peliculaEntities);
    }

    @Override
    public boolean actualizarMultimedia(PeliculaDTO peliculaDto) {
        return  this.buscarMultimedia(peliculaDto.getIdPelicula())
                .map(peliculaDTO -> {
                    //set de nuevos campos probable uso del factoy
                    peliculaRepository.save(peliculaFactory.convertirAEntity(peliculaDTO));
            return true;
        }).orElse(false);
    }

    @Override
    public boolean eliminarMultimedia(Long peliculaID) {
        return  buscarMultimedia(peliculaID).map(
                peliculaDTO -> {
                    peliculaRepository.deleteById(peliculaID);
                    return true;
                }).orElse(false);
    }

    @Override
    public Optional<PeliculaDTO> buscarMultimedia(Long peliculaID) {
        return peliculaRepository.findById(peliculaID)
                .map(peliculaFactory::convertirADTO);
    }
}
