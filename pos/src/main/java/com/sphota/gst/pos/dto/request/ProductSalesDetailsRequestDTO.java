package com.sphota.gst.pos.dto.request;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class ProductSalesDetailsRequestDTO {
    private Integer prodId;
    private Integer qty;
    private Float totalPrice;
    private Float totalGstAmount;
}
