package com.insprie.backendproject.service;

import com.insprie.backendproject.entity.Occupation;
import com.insprie.backendproject.exception.OccupationException;
import com.insprie.backendproject.repository.OccupationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OccupationService {

    @Autowired
    OccupationRepository occupationRepository;

    public List<Occupation> getOccupations() throws OccupationException {
        List<Occupation> occupationEntities = occupationRepository.findAll();
        if(occupationEntities.isEmpty()){
            throw OccupationException.occupationIsNull();
        }
        return occupationEntities;
    }
}
