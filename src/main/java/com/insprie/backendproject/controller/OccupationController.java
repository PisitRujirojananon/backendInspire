package com.insprie.backendproject.controller;

import com.insprie.backendproject.entity.Occupation;
import com.insprie.backendproject.exception.OccupationException;
import com.insprie.backendproject.service.OccupationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OccupationController {

    @Autowired
    OccupationService occupationService;

    @GetMapping("/occupations")
    public ResponseEntity<List<Occupation>> getOccupations() throws OccupationException {
        List<Occupation> response = occupationService.getOccupations();
        return ResponseEntity.ok(response);
    }
}
