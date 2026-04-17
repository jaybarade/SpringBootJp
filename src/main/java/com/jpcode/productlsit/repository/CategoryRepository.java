package com.jpcode.productlsit.repository;

import com.jpcode.productlsit.entity.Category;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public  interface CategoryRepository  extends JpaRepository<Category, Long> {

}