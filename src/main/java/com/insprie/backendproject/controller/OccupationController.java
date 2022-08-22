package com.insprie.backendproject.controller;

import com.insprie.backendproject.model.OccupationEntityList;
import com.insprie.backendproject.service.OccupationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OccupationController {

    @Autowired
    OccupationService occupationService;

    @GetMapping("/occupations")
    public ResponseEntity<OccupationEntityList> getOccupations() {
        OccupationEntityList response = occupationService.getOccupations();
        return ResponseEntity.ok(response);
    }
}
