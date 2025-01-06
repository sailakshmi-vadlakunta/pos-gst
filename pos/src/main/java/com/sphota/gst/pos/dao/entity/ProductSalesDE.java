package com.sphota.gst.pos.dao.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

@Entity
@Builder
@Table(name = "ProductSale")
@NoArgsConstructor
@AllArgsConstructor
public class ProductSalesDE {

    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private Integer id;
    private Integer qty;
    @ManyToOne
    private SalesDE sales;

}
