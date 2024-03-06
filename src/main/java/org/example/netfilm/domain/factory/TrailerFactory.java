package org.example.netfilm.domain.factory;

import org.example.netfilm.Persistence.entity.TrailerEntity;
import org.example.netfilm.domain.dto.TrailerDTO;

import java.util.List;

public class TrailerFactory implements MultimediaFactory<TrailerDTO,TrailerEntity> {

    @Override
    public TrailerDTO crearInstancia(TrailerDTO trailerDTO) {
        return new TrailerDTO(
                trailerDTO.getRuta(),
                trailerDTO.getResolucion(),
                trailerDTO.getDuracion(),
                false

        );
    }
    @Override
    public List<TrailerDTO> convertirADTO(List<TrailerEntity> multimediaEntities) {
        return null;
    }

    @Override
    public TrailerEntity convertirAEntity(TrailerDTO multimediaDTO) {
        return null;
    }

    @Override
    public TrailerDTO convertirADTO(TrailerEntity multimediaEntitiy) {
        return null;
    }




}
