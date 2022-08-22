package com.insprie.backendproject.service;

import com.insprie.backendproject.entity.OccupationEntity;
import com.insprie.backendproject.repository.OccupationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OccupationService {

    @Autowired
    OccupationRepository occupationRepository;

    public List<OccupationEntity> getOccupations() {
        return occupationRepository.findAll();
    }
}
