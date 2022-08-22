package com.insprie.backendproject.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.jupiter.api.Assertions.*;

class OccupationServiceTest {

    @Autowired
    OccupationService occupationService;

    @Test
    void testOccupationService() {
        occupationService.getOccupations();
    }
}