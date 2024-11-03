package com.project.finalproject.controller;

import com.project.finalproject.entities.BlockOfClasses;
import com.project.finalproject.service.BlockOfClassesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/blocks")
public class BlockOfClassesController {

    @Autowired
    private BlockOfClassesService blockOfClassesService;

    @GetMapping
    public List<BlockOfClasses> getAllBlocks() {
        return blockOfClassesService.getAllBlocks();
    }

    @GetMapping("/{id}")
    public ResponseEntity<BlockOfClasses> getBlockById(@PathVariable Long id) {
        return ResponseEntity.ok(blockOfClassesService.getBlockById(id));
    }

    @PostMapping("/save")
    public BlockOfClasses createBlock(@RequestBody BlockOfClasses blockOfClasses) {
        return blockOfClassesService.saveBlock(blockOfClasses);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteBlock(@PathVariable Long id) {
        blockOfClassesService.deleteBlock(id);
        return ResponseEntity.noContent().build();
    }


}