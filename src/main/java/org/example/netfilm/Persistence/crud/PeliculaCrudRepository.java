package org.example.netfilm.Persistence.crud;

import org.example.netfilm.Persistence.entity.PeliculaEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PeliculaCrudRepository extends JpaRepository<PeliculaEntity, Long> {

}
