package com.sphota.gst.pos.dao.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Builder
@Table(name = "Product")
@NoArgsConstructor
@AllArgsConstructor
public class ProductDE {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String productName;
    private Float price;
    @ManyToOne(cascade = CascadeType.DETACH)
    @JoinColumn(name = "categoryId")
    private CategoryDE category;
}
