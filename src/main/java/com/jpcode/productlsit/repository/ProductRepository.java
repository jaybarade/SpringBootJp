package com.jpcode.productlsit.repository;

import com.jpcode.productlsit.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ProductRepository extends JpaRepository<Product ,Long> {
}
