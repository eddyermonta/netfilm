package org.example.netfilm.Persistence.crud;

import org.example.netfilm.Persistence.entity.MultimediaEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MultimediaCrudRepository extends JpaRepository<MultimediaEntity,Long> {
}
