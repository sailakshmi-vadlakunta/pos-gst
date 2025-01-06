package com.sphota.gst.pos.service;

import com.sphota.gst.pos.dao.CategoryDAO;
import com.sphota.gst.pos.dao.entity.CategoryDE;
import com.sphota.gst.pos.dto.request.CategoryRequestDTO;
import com.sphota.gst.pos.dto.response.CategoryResponseDTO;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Log4j2
@RequiredArgsConstructor
public class CategoryService {

    private final CategoryDAO categoryDAO;
    public void createCategory(CategoryRequestDTO categoryRequestDTO) {
        CategoryDE categoryDE = CategoryDE.builder()
                .categoryName(categoryRequestDTO.getCategoryName())
                .gst(categoryRequestDTO.getGst())
                .build();

        log.info(categoryDAO.save(categoryDE));
    }

    public List<CategoryResponseDTO> fetchCategoryNameAndId() {
        List<CategoryDE> categoryDES = categoryDAO.fetchCategoryNameAndId();
        List<CategoryResponseDTO> categoryResponseDTOS = new ArrayList<>();

        for (CategoryDE categoryDE : categoryDES) {
            categoryResponseDTOS.add(
                    CategoryResponseDTO.builder()
                            .categoryId(categoryDE.getId())
                            .categoryName(categoryDE.getCategoryName())
                            .build());
        }
        return categoryResponseDTOS;
    }
}
