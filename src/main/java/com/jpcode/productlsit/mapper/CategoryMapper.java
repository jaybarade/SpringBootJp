package com.jpcode.productlsit.mapper;

import com.jpcode.productlsit.dto.CategoryDto;
import com.jpcode.productlsit.entity.Category;

public class CategoryMapper {

    public  static Category toCategoryEntity(CategoryDto categoryDto){
        Category category = new Category();
        category.setName(categoryDto.getName());
        return  category;
    }

    public  static  CategoryDto toCategoryDTO(Category category){
        if(category==null){
            return  null;
        }
        CategoryDto categoryDto= new CategoryDto();
        categoryDto.setId(category.getId());
        categoryDto.setName(category.getName());
        categoryDto.setProducts(category.getProducts().stream().map(ProductMapper::toProductdto).toList()
        );
        return categoryDto;
    }
}
