package org.example.netfilm.domain.service;


import org.example.netfilm.Persistence.crud.SerieCrudRepository;
import org.example.netfilm.Persistence.entity.SerieEntity;
import org.example.netfilm.domain.dto.SerieDTO;
import org.example.netfilm.domain.repository.MultimediaRepository;
import org.example.netfilm.domain.factory.SerieFactory;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SerieService implements MultimediaRepository<SerieDTO> {
    private final SerieCrudRepository serieRepository;
    private final SerieFactory serieFactory;

    public SerieService(SerieCrudRepository serieRepository, SerieFactory serieFactory) {
        this.serieRepository = serieRepository;
        this.serieFactory = serieFactory;
    }
    @Override
    public SerieDTO insertarMultimedia(SerieDTO serieDTO) {
        SerieEntity serieEntity = serieFactory.convertirAEntity(serieDTO);
        serieRepository.save(serieEntity);
        return serieFactory.convertirADTO(serieEntity);
    }

    @Override
    public List<SerieDTO> buscarAllMultimedia() {
        List<SerieEntity> serieEntities = serieRepository.findAll();
        return serieFactory.convertirADTO(serieEntities);
    }

    @Override
    public boolean actualizarMultimedia(SerieDTO serieDTO) {
        return  this.buscarMultimedia(serieDTO.getIdSerie()).
                map(serie -> {
                    //set de nuevos campos probable uso del factoy
                    serieRepository.save(serieFactory.convertirAEntity(serieDTO));
            return true;
        }).orElse(false);
    }

    @Override
    public boolean eliminarMultimedia(Long serieID) {
        return  this.buscarMultimedia(serieID)
                .map(serieDTO -> {
                serieRepository.delete(serieFactory.convertirAEntity(serieDTO));
                return true;
                }
                ).orElse(false);
    }

    @Override
    public Optional<SerieDTO> buscarMultimedia(Long serieID) {
        return serieRepository.findById(serieID).map(serieFactory::convertirADTO);
    }
}