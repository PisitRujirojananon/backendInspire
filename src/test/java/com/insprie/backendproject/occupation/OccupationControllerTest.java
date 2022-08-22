package com.insprie.backendproject.occupation;

import com.insprie.backendproject.entity.OccupationEntity;
import com.insprie.backendproject.model.OccupationEntityList;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.test.web.client.TestRestTemplate;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class OccupationControllerTest {

    @MockBean
    OccupationService occupationService;

    @Autowired
    private TestRestTemplate testRestTemplate;

    @Test
    void testOccupationService() {
        OccupationEntityList occupationEntityList = new OccupationEntityList();
        List<OccupationEntity> occupationEntities = new ArrayList<>();
        List<String> occupaionName = new ArrayList<>();
            occupaionName.add("NAVY");
            occupaionName.add("OFFICE");
            occupaionName.add("CONSTRUCTION");
        int couter = 0;

        for (String item : occupaionName) {
            OccupationEntity occupationEntity = new OccupationEntity();
            occupationEntity.setOccupationtitle(item);
            occupationEntity.setOccupationid(couter++);
            occupationEntities.add(occupationEntity);
        }
        occupationEntityList.setOccupationEntityList(occupationEntities);

        when(occupationService.getOccupations()).thenReturn(occupationEntityList);
        OccupationEntityList result = testRestTemplate.getForObject("/occupations", OccupationEntityList.class);
        assertEquals(3, result.getOccupationEntityList().size());
    }
}