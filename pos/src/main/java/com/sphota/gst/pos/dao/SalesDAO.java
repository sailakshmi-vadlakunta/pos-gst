package com.sphota.gst.pos.dao;

import com.sphota.gst.pos.dao.entity.SalesDE;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SalesDAO extends JpaRepository<SalesDE, Integer> {
}
