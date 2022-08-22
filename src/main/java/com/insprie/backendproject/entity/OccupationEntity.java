package com.insprie.backendproject.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity(name = "OccupationDim")
public class OccupationEntity {

    @Id
    private int occupationId;

    @Column
    private String occupationTitle;
}
