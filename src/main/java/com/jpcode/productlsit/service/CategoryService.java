package com.jpcode.productlsit.service;

import com.jpcode.productlsit.dto.CategoryDto;
import com.jpcode.productlsit.entity.Category;
import com.jpcode.productlsit.mapper.CategoryMapper;
import com.jpcode.productlsit.repository.CategoryRepository;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CategoryService {

    //@autowirde se bhi ho jayega
    private  final  CategoryRepository categoryRepository;

    // create category
    public CategoryDto createCategory(CategoryDto categoryDto) {
        Category category = CategoryMapper.toCategoryEntity(categoryDto);
        category = categoryRepository.save(category);
        return CategoryMapper.toCategoryDTO(category);
    }



    //get all categories

    // get category by id

    //delete categories




}
