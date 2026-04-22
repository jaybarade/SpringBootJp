package com.jpcode.productlsit.service;

import com.jpcode.productlsit.dto.CategoryDto;
import com.jpcode.productlsit.entity.Category;
import com.jpcode.productlsit.mapper.CategoryMapper;
import com.jpcode.productlsit.repository.CategoryRepository;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

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



    //get all categorie
    public List<CategoryDto> getAllCategory(){
        return  categoryRepository.findAll().stream().map(
                CategoryMapper::toCategoryDTO
        ).toList();

    }

    // get category by id

    public  CategoryDto getcategoryById(Long id){
       Category category = categoryRepository.findById(id).orElseThrow(()-> new RuntimeException("Category not found"));
        return CategoryMapper.toCategoryDTO(category);

    }




    //delete categories
public String deleteCategory(Long id){
        Category category = categoryRepository.findById(id).orElseThrow(()->new RuntimeException("Categpory not found0"));

     categoryRepository.deleteById(id);
     return "Category"+id+"deleted";
}
//
//   public  CategoryDto updateCategory(Long id){
//        Category category = categoryRepository.findById(id).orElseThrow(()->new RuntimeException("Category Not found"));
//
//   }



}
