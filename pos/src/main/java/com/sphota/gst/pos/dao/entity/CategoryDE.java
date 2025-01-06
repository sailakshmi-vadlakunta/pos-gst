package com.sphota.gst.pos.dao.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "category")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CategoryDE {
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private int id;
    private String categoryName;
    private Float gst;
}
