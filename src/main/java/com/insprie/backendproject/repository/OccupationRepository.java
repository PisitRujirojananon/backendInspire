package com.insprie.backendproject.repository;

import com.insprie.backendproject.entity.OccupationEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OccupationRepository extends JpaRepository<OccupationEntity, Integer> {
}
