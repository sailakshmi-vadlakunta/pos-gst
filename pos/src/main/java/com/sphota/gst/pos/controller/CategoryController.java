package com.sphota.gst.pos.controller;

import com.sphota.gst.pos.dto.request.CategoryRequestDTO;
import com.sphota.gst.pos.dto.response.CategoryResponseDTO;
import com.sphota.gst.pos.service.CategoryService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/category")
@RequiredArgsConstructor
@Log4j2
public class CategoryController
{
    private final CategoryService categoryService;

    @PostMapping("")
    public ResponseEntity<String> createCategory(@RequestBody CategoryRequestDTO categoryRequestDTO)
    {
        log.info("Category Entry");
        categoryService.createCategory(categoryRequestDTO);
        log.info("Category exit");
        return ResponseEntity.ok().build();
    }

    @GetMapping("/categoryNames")
    public ResponseEntity<List<CategoryResponseDTO>> fetchCategoryNameAndId()
    {
        return ResponseEntity.ok(categoryService.fetchCategoryNameAndId());
    }

}
