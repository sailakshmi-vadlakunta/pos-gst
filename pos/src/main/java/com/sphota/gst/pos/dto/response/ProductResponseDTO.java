package com.sphota.gst.pos.dto.response;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class ProductResponseDTO {
    private Integer prodId;
    private String prodName;
    private Float price;
    private CategoryResponseDTO category;
}
