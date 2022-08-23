package com.insprie.backendproject.service;

import com.insprie.backendproject.entity.Occupation;
import com.insprie.backendproject.exception.OccupationException;
import com.insprie.backendproject.repository.OccupationRepository;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

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
    void testOccupationService() throws OccupationException {
        when(occupationRepository.findAll()).thenReturn(List.of(
                new Occupation(1, "NAVY"),
                new Occupation(2, "OFFICE"),
                new Occupation(3, "CONSTRUCTION")
        ));

        List<Occupation> result = occupationService.getOccupations();

        assertEquals(3, result.size());
    }
}
