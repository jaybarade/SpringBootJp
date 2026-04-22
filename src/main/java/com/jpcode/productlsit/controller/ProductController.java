package com.jpcode.productlsit.controller;


import com.jpcode.productlsit.dto.ProductDto;
import com.jpcode.productlsit.service.ProductService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/products")
@AllArgsConstructor

public class ProductController {


    private final ProductService productService;

    //Create Product
    @PostMapping("/create_product")
    public ProductDto createProduct(@RequestBody ProductDto productDto) {
        return productService.createProduct(productDto);

    }

    //Get all product
    @GetMapping("/getAllProductList")
    public List<ProductDto> getAllProduct() {
        return productService.getallProduct();
    }

    // get product by id
    @GetMapping("/{id}")
    public ProductDto getByIdproduct(@PathVariable Long id) {
        return productService.getproductByid(id);
    }

//    //update product
//    @PutMapping("/{id}")//id to help find product and update
//    public ProductDto updateProduct(@PathVariable Long id, @RequestBody ProductDto upproductDto) {  // upproductdto new data
//
//
//    }

}
