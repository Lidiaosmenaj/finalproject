package com.project.finalproject.repository;

import com.project.finalproject.entities.BlockOfClasses;

public interface BlockOfClassesRepository {
    BlockOfClasses findByKlasaId(int klasaId);
}
