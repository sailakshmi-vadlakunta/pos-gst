package com.sphota.gst.pos.service;

import com.sphota.gst.pos.dao.CategoryDAO;
import com.sphota.gst.pos.dao.ProductDAO;
import com.sphota.gst.pos.dao.entity.CategoryDE;
import com.sphota.gst.pos.dao.entity.ProductDE;
import com.sphota.gst.pos.dto.request.ProductRequestDTO;
import com.sphota.gst.pos.dto.response.CategoryResponseDTO;
import com.sphota.gst.pos.dto.response.ProductResponseDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
@Service
public class ProductService {

    private final ProductDAO productDAO;
    private final CategoryDAO categoryDAO;

    public void createProduct(ProductRequestDTO productRequestDTO) {
        ProductDE productDE = ProductDE.builder()
                .productName(productRequestDTO.getProdName())
                .price(productRequestDTO.getPrice())
                .category(categoryDAO.getReferenceById(productRequestDTO.getCategoryId()))
                .build();

        //check if product already exists
        productDAO.save(productDE);
        return;
    }


    public List<ProductResponseDTO> fetchProductNameAndId() {
        List<ProductDE> productDES = productDAO.findProductNameAndId();

        List<ProductResponseDTO> productResponseDTOS = new ArrayList<>();

        for (ProductDE productDE : productDES) {
            productResponseDTOS.add(
                    ProductResponseDTO.builder()
                            .prodId(productDE.getId())
                            .prodName(productDE.getProductName())
                            .build());
        }
        return productResponseDTOS;
    }

    public ProductResponseDTO fetchProductById(Integer productId) {
        ProductDE productDE = productDAO.findById(productId).get();

        return ProductResponseDTO.builder()
                .prodName(productDE.getProductName())
                .price(productDE.getPrice())
                .prodId(productDE.getId())
                .category(
                        CategoryResponseDTO.builder()
                                .categoryName(productDE.getCategory().getCategoryName())
                                .gst(productDE.getCategory().getGst())
                                .categoryId(productDE.getCategory().getId())
                                .build()
                )
                .build();
    }
}
