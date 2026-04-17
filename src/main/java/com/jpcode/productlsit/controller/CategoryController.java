package com.jpcode.productlsit.controller;


import com.jpcode.productlsit.dto.CategoryDto;
import com.jpcode.productlsit.service.CategoryService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
@RequestMapping("/api/categories")
public class CategoryController {


    private final CategoryService categoryService;

    //getproducts
    //CREATE PRODUCT
    //UPDATE PRODUCT
    @PostMapping("/create_category")
    public ResponseEntity<CategoryDto> createCategory(@RequestBody CategoryDto categoryDto){
        return  new ResponseEntity<>(categoryService.createCategory(categoryDto), HttpStatus.CREATED);
    }



}
