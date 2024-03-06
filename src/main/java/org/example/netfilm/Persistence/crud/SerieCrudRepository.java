package org.example.netfilm.Persistence.crud;

import org.example.netfilm.Persistence.entity.SerieEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SerieCrudRepository extends JpaRepository<SerieEntity, Long> {
}
