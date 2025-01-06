package com.sphota.gst.pos.dao;

import com.sphota.gst.pos.dao.entity.ProductSalesDE;
import jakarta.persistence.Entity;
import lombok.Builder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductSalesDAO extends JpaRepository<ProductSalesDE, Integer> {
}
