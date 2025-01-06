package com.sphota.gst.pos.service;

import com.sphota.gst.pos.dao.ProductSalesDAO;
import com.sphota.gst.pos.dao.SalesDAO;
import com.sphota.gst.pos.dao.entity.ProductSalesDE;
import com.sphota.gst.pos.dao.entity.SalesDE;
import com.sphota.gst.pos.dto.request.BillDetailsRequestDTO;
import com.sphota.gst.pos.dto.request.ProductSalesDetailsRequestDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
@RequiredArgsConstructor
public class SalesService {

    private final SalesDAO salesDAO;
    private final ProductSalesDAO productSalesDAO;

    public void createSales(BillDetailsRequestDTO billDetailsRequestDTO, Float totalBill) {
        SalesDE salesDE = SalesDE.builder()
                .customerName(billDetailsRequestDTO.getCustomerName())
                .totalBill(totalBill)
                .createDate(new Date())
                .build();
        Integer salesId = salesDAO.save(salesDE).getId();

        for (ProductSalesDetailsRequestDTO ele : billDetailsRequestDTO.getProductSalesDetailsRequestDTO()) {
            ProductSalesDE productSalesDE = ProductSalesDE.builder()
                    .sales(salesDAO.getReferenceById(salesId))
                    .qty(ele.getQty())
                    .build();
            productSalesDAO.save(productSalesDE);
        }
    }

    public Float totalBill(BillDetailsRequestDTO billDetailsRequestDTO) {

        return billDetailsRequestDTO.getProductSalesDetailsRequestDTO()
                .stream()
                .map(e -> e.getTotalPrice() + e.getTotalGstAmount())
                .reduce(Float::sum).get();
    }
}
