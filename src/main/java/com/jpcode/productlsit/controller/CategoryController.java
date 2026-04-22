package com.jpcode.productlsit.controller;


import com.jpcode.productlsit.dto.CategoryDto;
import com.jpcode.productlsit.service.CategoryService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@AllArgsConstructor
@RequestMapping("/api/categories")
public class CategoryController {

    private final CategoryService categoryService;

    //create Category
    @PostMapping("/create_category")
    public ResponseEntity<CategoryDto> createCategory(@RequestBody CategoryDto categoryDto){
        return  new ResponseEntity<>(categoryService.createCategory(categoryDto), HttpStatus.CREATED);
    }

    // get all category
    @GetMapping("/get_categorylist")
    public ResponseEntity<List<CategoryDto>> getAllCategory(){
        return new  ResponseEntity<>(categoryService.getAllCategory(),HttpStatus.OK);
    }


    //get category by ID

    @GetMapping("/getCategoryById/{id}")
    public  CategoryDto getCategoryById(@PathVariable Long id){
       return categoryService.getcategoryById(id);

    }

    // delete category with product
    @DeleteMapping
    public  String deleteCategory(@RequestParam Long id){
    return categoryService.deleteCategory(id);
    }

    //PUT update  category

//    @PutMapping("/{id")
//    public  CategoryDto updateCategory(){
//
//
//    }


}
