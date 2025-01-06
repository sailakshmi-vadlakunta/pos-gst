package com.sphota.gst.pos.dto.request;

import lombok.Data;

@Data
public class ProductRequestDTO {
    private Integer categoryId;
    private String prodName;
    private Float price;
    private Integer prodId;
}
