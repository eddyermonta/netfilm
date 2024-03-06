package org.example.netfilm.domain.factory;

import org.example.netfilm.Persistence.entity.SerieEntity;
import org.example.netfilm.domain.dto.SerieDTO;

import java.util.List;

public interface MultimediaFactory<T,U> {
  T crearInstancia(T multimediaDTO);
  T convertirADTO(U multimediaEntitiy);
  U convertirAEntity(T multimediaDTO);
  List<T> convertirADTO(List<U> multimediaEntities);

}
