package com.project.finalproject.service;

import com.project.finalproject.entities.BlockOfClasses;
import com.project.finalproject.repository.AppUserRepository;
import com.project.finalproject.repository.BlockOfClassesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BlockOfClassesService {

    @Autowired
    private BlockOfClassesRepository blockOfClassesRepository;
    @Autowired
    private AppUserRepository appUserRepository;

    public List<BlockOfClasses> getAllBlocks() {
        return blockOfClassesRepository.findAll();
    }

    public BlockOfClasses getBlockById(Long id) {
        Optional<BlockOfClasses> blockOfClassesByID = blockOfClassesRepository.findById(id);
        if (blockOfClassesByID.isPresent()) {
            return blockOfClassesByID.get();
        } else {
            throw new IllegalArgumentException("BlockOfClasses does not exist");
        }

    }

    public BlockOfClasses saveBlock(BlockOfClasses blockOfClasses) {
        return blockOfClassesRepository.save(blockOfClasses);
    }

    public void deleteBlock(Long id) {
        blockOfClassesRepository.deleteById(id);
    }

}