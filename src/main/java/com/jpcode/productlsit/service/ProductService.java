package com.jpcode.productlsit.service;


import com.jpcode.productlsit.dto.ProductDto;
import com.jpcode.productlsit.entity.Category;
import com.jpcode.productlsit.entity.Product;
import com.jpcode.productlsit.mapper.ProductMapper;
import com.jpcode.productlsit.repository.CategoryRepository;
import com.jpcode.productlsit.repository.ProductRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ProductService {

    private final ProductRepository productRepository;

    private final CategoryRepository categoryRepository;

    public ProductDto createProduct(ProductDto productDto){
        /**
         * name, description, price, categoryid
         */
        // check categoryid is available in DB
       Category category=  categoryRepository.findById(productDto.getCategoryid()).orElseThrow(()->
                new RuntimeException("This category not allow")
        );
        // DTO NOT SAVE IN DATABASE  DT0->ENTITY

       Product product=  ProductMapper.toProductEntity(productDto,category);
       //product are entity and save DB
       product = productRepository.save(product);


       //Product entity but return Dto
        // change product entity to dto
       ProductDto  newproductdto =  ProductMapper.toProductdto(product);
       return newproductdto;

    }


    //GetAll product
    public List<ProductDto> getallProduct(){
        return  productRepository.findAll().stream().map(ProductMapper::toProductdto).toList();
    }

    public  ProductDto getproductByid(Long id){
        Product product = productRepository.findById(id).orElseThrow(()-> new  RuntimeException("Product not found"));
        return  ProductMapper.toProductdto(product);
    }


    // update product
    public  ProductDto updateProduct(Long id, ProductDto productDto) {
        Product product = productRepository.findById(id).orElseThrow(() -> new RuntimeException("Product not found"));
        Category category = categoryRepository.findById(productDto.getCategoryid()).orElseThrow(() -> new RuntimeException("Category not found"));
        product.setName(productDto.getName());
        product.setDescription(productDto.getDescription());
        product.setPrice(productDto.getPrice());
        product.setCategory(category);
        productRepository.save(product);
        return ProductMapper.toProductdto(product);
    }



    }




