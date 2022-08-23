package com.insprie.backendproject.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity(name = "occupationdim")
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Occupation {

    @Id
    private int occupationid;

    @Column
    private String occupationtitle;
}
