package com.insprie.backendproject.service;

import com.insprie.backendproject.model.OccupationEntityList;
import com.insprie.backendproject.repository.OccupationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OccupationService {

    @Autowired
    OccupationRepository occupationRepository;

    public OccupationEntityList getOccupations() {
        OccupationEntityList occupationEntityList = new OccupationEntityList();
        occupationEntityList.setOccupationEntityList(occupationRepository.findAll());
        return occupationEntityList;
    }
}
