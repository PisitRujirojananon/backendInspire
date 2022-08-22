package com.insprie.backendproject.model;

import com.insprie.backendproject.entity.OccupationEntity;
import lombok.Data;

import java.util.List;

@Data
public class OccupationEntityList {
    private List<OccupationEntity> occupationEntityList;
}
