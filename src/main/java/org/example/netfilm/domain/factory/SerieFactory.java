package org.example.netfilm.domain.factory;


import org.example.netfilm.Persistence.entity.SerieEntity;
import org.example.netfilm.domain.dto.CapituloDTO;
import org.example.netfilm.domain.dto.SerieDTO;
import org.example.netfilm.domain.dto.TemporadaDTO;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class SerieFactory implements MultimediaFactory<SerieDTO, SerieEntity> {

    @Override
    public SerieDTO crearInstancia(SerieDTO serieDTO) {
        return new SerieDTO(
                serieDTO.getRuta(),
                serieDTO.getResolucion(),
                serieDTO.isHDR(),
                new ArrayList<>()
        );
    }


    public TemporadaDTO crearInstancia(TemporadaDTO temporadaDTO){
        return  new TemporadaDTO(
                temporadaDTO.getNombre(),
                temporadaDTO.getCantidadCapitulos(),
                temporadaDTO.getAnoLanzamiento(),
                new ArrayList<>()
        );
    }

    public CapituloDTO crearInstancia(CapituloDTO capituloDTO){
        return new CapituloDTO(
                capituloDTO.getNombre(),
                capituloDTO.getDuracion()
        );
    }
    @Override
    public List<SerieDTO>convertirADTO(List<SerieEntity>serieEntities){
        return serieEntities.stream()
                .map(this::convertirADTO)
                .collect(Collectors.toList());
    }
    @Override
    public SerieEntity convertirAEntity(SerieDTO serieDTO) {
        return new SerieEntity(
                serieDTO.getIdSerie(),
                serieDTO.getRuta(),
                serieDTO.getResolucion(),
                serieDTO.isHDR()
        );
    }
    @Override
    public SerieDTO convertirADTO(SerieEntity serieEntity){
        SerieDTO serieDTO = crearInstancia(new SerieDTO());
        BeanUtils.copyProperties(serieEntity, serieDTO);
        return serieDTO;
    }


}
