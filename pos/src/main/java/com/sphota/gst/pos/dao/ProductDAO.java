package com.sphota.gst.pos.dao;

import com.sphota.gst.pos.dao.entity.ProductDE;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductDAO extends JpaRepository<ProductDE, Integer> {

    @Query("SELECT p FROM ProductDE p")
    List<ProductDE> findProductNameAndId();
}
