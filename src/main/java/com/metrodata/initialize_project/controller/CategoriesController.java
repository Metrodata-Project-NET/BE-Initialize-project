package com.metrodata.initialize_project.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.metrodata.initialize_project.entity.Categories;
import com.metrodata.initialize_project.models.CategoriesRequest;
import com.metrodata.initialize_project.services.CategoriesService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/categories")
@RequiredArgsConstructor
public class CategoriesController {

    private final CategoriesService categoriesService;


    @PostMapping
    public ResponseEntity<Categories> createCategories(@RequestBody CategoriesRequest categoriesRequest){
        return new ResponseEntity<>(categoriesService.create(categoriesRequest),HttpStatus.CREATED);
    }

}
