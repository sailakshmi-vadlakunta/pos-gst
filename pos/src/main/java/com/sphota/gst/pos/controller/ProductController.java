package com.sphota.gst.pos.controller;

import com.sphota.gst.pos.dto.request.ProductRequestDTO;
import com.sphota.gst.pos.dto.response.CategoryResponseDTO;
import com.sphota.gst.pos.dto.response.ProductResponseDTO;
import com.sphota.gst.pos.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/v1/product")
public class ProductController {

    private final ProductService productService;

    @PostMapping("")
    public ResponseEntity<String> createProduct(@RequestBody ProductRequestDTO productRequestDTO)
    {
        productService.createProduct(productRequestDTO);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/productNames")
    public ResponseEntity<List<ProductResponseDTO>> fetchCategoryNameAndId()
    {
        return ResponseEntity.ok(productService.fetchProductNameAndId());
    }

    @GetMapping("/productDetails")
    public ResponseEntity<ProductResponseDTO> fetchProductById(@RequestParam Integer productId){
        return ResponseEntity.ok(productService.fetchProductById(productId));
    }

}
