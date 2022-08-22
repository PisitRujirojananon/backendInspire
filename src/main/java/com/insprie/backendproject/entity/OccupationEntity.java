package com.insprie.backendproject.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity(name = "occupationdim")
public class OccupationEntity {

    @Id
    private int occupationid;

    @Column
    private String occupationtitle;
}
