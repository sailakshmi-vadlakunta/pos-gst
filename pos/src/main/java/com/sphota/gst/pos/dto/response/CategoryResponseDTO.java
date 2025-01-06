package com.sphota.gst.pos.dto.response;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CategoryResponseDTO {
    private int categoryId;
    private String categoryName;
    private Float gst;
}
