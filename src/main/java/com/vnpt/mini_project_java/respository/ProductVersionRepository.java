package com.vnpt.mini_project_java.respository;

import com.vnpt.mini_project_java.entity.Product;
import com.vnpt.mini_project_java.entity.ProductVersion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ProductVersionRepository extends JpaRepository<ProductVersion,Long>{

    @Query(value = "SELECT * FROM product_version WHERE product_id = :productID", nativeQuery = true)
    List<ProductVersion> findAllByProductId(long productID);
}