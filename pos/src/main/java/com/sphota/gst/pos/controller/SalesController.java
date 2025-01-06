package com.sphota.gst.pos.controller;

import com.sphota.gst.pos.dto.request.BillDetailsRequestDTO;
import com.sphota.gst.pos.service.SalesService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/v1/sales")
public class SalesController {
    private final SalesService salesService;

    @PostMapping("/generateBill")
    public ResponseEntity<String> generateBill(@RequestBody BillDetailsRequestDTO billDetailsRequestDTO){
        Float totalBill = salesService.totalBill(billDetailsRequestDTO);
        salesService.createSales(billDetailsRequestDTO, totalBill);
        return ResponseEntity.ok(String.valueOf(totalBill));
    }

}
