package com.insprie.backendproject.repository;

import com.insprie.backendproject.entity.Occupation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OccupationRepository extends JpaRepository<Occupation, Integer> {
}
