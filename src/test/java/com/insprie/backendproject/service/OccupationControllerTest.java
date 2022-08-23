package com.insprie.backendproject.service;

import com.insprie.backendproject.controller.OccupationController;
import com.insprie.backendproject.entity.Occupation;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import java.util.List;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(OccupationController.class)
class OccupationControllerTest {

    @MockBean
    OccupationService occupationService;

    @Autowired
    private MockMvc mockMvc;

    @Test
    void testOccupationController() throws Exception {

        when(occupationService.getOccupations()).thenReturn(List.of(
                new Occupation(1, "Navy"),
                new Occupation(2, "Construction Worker"),
                new Occupation(3, "Office Worker")
        ));

        mockMvc.perform(MockMvcRequestBuilders
                        .get("/occupations")
                        .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.size()", Matchers.is(3)))
                .andExpect(jsonPath("$.[2].occupationtitle", Matchers.is("Office Worker")));

    }
}