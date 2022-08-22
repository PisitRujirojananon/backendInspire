package com.insprie.backendproject.service;

import com.insprie.backendproject.entity.OccupationEntity;
import com.insprie.backendproject.model.OccupationEntityList;
import com.insprie.backendproject.repository.OccupationRepository;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class OccupationServiceTest {

    @Mock
    OccupationRepository occupationRepository;

    @Autowired
    OccupationService occupationService;

    @Test
    void testOccupationService() {
        List<OccupationEntity> occupationEntityList = getDataTest();
        when(occupationRepository.findAll()).thenReturn(occupationEntityList);
        OccupationEntityList result = occupationService.getOccupations();
        assertEquals(3, result.getOccupationEntityList().size());
    }

    public List<OccupationEntity> getDataTest() {

        List<OccupationEntity> occupationEntities = new ArrayList<>();
        List<String> occupationName = new ArrayList<>();
        occupationName.add("NAVY");
        occupationName.add("OFFICE");
        occupationName.add("CONSTRUCTION");
        int couter = 0;

        for (String item : occupationName) {
            OccupationEntity occupationEntity = new OccupationEntity();
            occupationEntity.setOccupationtitle(item);
            occupationEntity.setOccupationid(couter++);
            occupationEntities.add(occupationEntity);
        }

        return occupationEntities;
    }
}
