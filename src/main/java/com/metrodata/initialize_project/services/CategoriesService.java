package com.metrodata.initialize_project.services;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import com.metrodata.initialize_project.entity.Categories;
import com.metrodata.initialize_project.models.CategoriesRequest;
import com.metrodata.initialize_project.repository.CategoriesRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class CategoriesService {

    private final CategoriesRepository categoriesRepository;

    public Categories create (CategoriesRequest categoriesRequest){
        //BEAN UTILS
        Categories categories = new Categories();
        BeanUtils.copyProperties(categoriesRequest, categories);

        return categoriesRepository.save(categories);
    }
}
