package com.project.finalproject.repository;

import com.project.finalproject.entities.BlockOfClasses;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public interface BlockOfClassesRepository extends JpaRepository<BlockOfClasses, Long> {
    BlockOfClasses findByKlasaId(int klasaId);
}
