package com.sphota.gst.pos.dao.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Builder
@Table(name = "sales")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class SalesDE {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String customerName;
    private Float totalBill;
    private Date createDate;
}
