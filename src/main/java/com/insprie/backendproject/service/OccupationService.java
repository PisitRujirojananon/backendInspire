package com.insprie.backendproject.service;

import com.insprie.backendproject.exception.OccupationException;
import com.insprie.backendproject.model.OccupationEntityList;
import com.insprie.backendproject.repository.OccupationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OccupationService {

    @Autowired
    OccupationRepository occupationRepository;

    public OccupationEntityList getOccupations() throws OccupationException {
        OccupationEntityList occupationEntityList = new OccupationEntityList();
        occupationEntityList.setOccupationEntityList(occupationRepository.findAll());
        if(occupationEntityList.getOccupationEntityList().isEmpty()){
            throw OccupationException.occupationIsNull();
        }
        return occupationEntityList;
    }
}
