package com.insprie.backendproject.controller;

import com.insprie.backendproject.entity.OccupationEntity;
import com.insprie.backendproject.service.OccupationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Occupation {

    @Autowired
    OccupationService occupationService;

    @GetMapping("/occupations")
    public ResponseEntity<List<OccupationEntity>> getOccupations() {
        List<OccupationEntity> response = occupationService.getOccupations();
        return ResponseEntity.ok(response);
    }
}
