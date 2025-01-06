package com.sphota.gst.pos.dto.request;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class BillDetailsRequestDTO {
    private String customerName;
    private List<ProductSalesDetailsRequestDTO> productSalesDetailsRequestDTO;
}
