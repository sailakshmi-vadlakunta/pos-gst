package com.sphota.gst.pos.dao;

import com.sphota.gst.pos.dao.entity.CategoryDE;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CategoryDAO extends JpaRepository<CategoryDE, Integer> {

    @Query("SELECT c FROM CategoryDE c")
    List<CategoryDE> fetchCategoryNameAndId();

}
