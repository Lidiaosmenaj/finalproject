package com.project.finalproject.entities;

import jakarta.persistence.ManyToOne;

public class Materialet {
    @ManyToOne
    private BlockOfClasess blockOfClasess;
}
