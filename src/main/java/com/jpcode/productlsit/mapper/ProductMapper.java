package com.jpcode.productlsit.mapper;

import com.jpcode.productlsit.dto.ProductDto;
import com.jpcode.productlsit.entity.Category;
import com.jpcode.productlsit.entity.Product;

public class ProductMapper {
    //entity to dto
    //toproductDTO
    public  static ProductDto toProductdto(Product product){
        return  new ProductDto(
                product.getId(),
                product.getName(),
                product.getDescription(),
                product.getPrice(),
                product.getCategory().getId()
        );
    }

    // DTO TO ENTITY

    public  static  Product toProductEntity(ProductDto productDto, Category category){
        Product product = new Product();
       product.setName(productDto.getName());
       product.setDescription(productDto.getDescription());
       product.setPrice(productDto.getPrice());
       product.setCategory(category);
       return product;
    }



}
