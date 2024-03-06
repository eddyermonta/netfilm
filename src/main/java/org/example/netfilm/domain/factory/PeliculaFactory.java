package org.example.netfilm.domain.factory;

import org.example.netfilm.Persistence.entity.MultimediaEntity;
import org.example.netfilm.Persistence.entity.PeliculaEntity;
import org.example.netfilm.domain.dto.PeliculaDTO;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class PeliculaFactory implements MultimediaFactory<PeliculaDTO,PeliculaEntity> {
    @Override
    public PeliculaDTO crearInstancia(PeliculaDTO peliculaDto) {
        return  new PeliculaDTO(
                peliculaDto.getRuta(),
                peliculaDto.getDuracion(),
                peliculaDto.getResolucion(),
                peliculaDto.isHDR()
        );
    }
    public PeliculaDTO crearInstancia(PeliculaEntity peliculaEntity) {
        return  new PeliculaDTO(
                peliculaEntity.getRuta(),
                peliculaEntity.getDuracion(),
                peliculaEntity.getResolucion(),
                peliculaEntity.isHDR()
        );
    }
    @Override
    public PeliculaDTO convertirADTO(PeliculaEntity peliculaEntity){
        return crearInstancia(peliculaEntity);
    }
    @Override
    public PeliculaEntity convertirAEntity(PeliculaDTO peliculaDTO) {
        return new PeliculaEntity(
//                peliculaDTO.getIdPelicula(),
                new MultimediaEntity(peliculaDTO.getMultimedia().getIdMultimedia()),
                peliculaDTO.getRuta(),
                peliculaDTO.getDuracion(),
                peliculaDTO.getResolucion(),
                peliculaDTO.isHDR()
        );
    }
    @Override
    public List<PeliculaDTO> convertirADTO(List<PeliculaEntity> peliculaEntities) {
        return peliculaEntities.stream()
                .map(this::crearInstancia)
                .collect(Collectors.toList());
    }
}