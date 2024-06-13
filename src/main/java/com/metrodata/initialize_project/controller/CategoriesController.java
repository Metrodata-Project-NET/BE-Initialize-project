package com.metrodata.initialize_project.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.metrodata.initialize_project.entity.Article;
import com.metrodata.initialize_project.entity.Categories;
import com.metrodata.initialize_project.service.CategoriesService;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RestController
@RequestMapping("/Categories")
public class CategoriesController {

    private final CategoriesService categoriesService;
    
     @GetMapping
    public List<Categories> getAll() {
        return categoriesService.getAll();
    }

    @GetMapping("/{id}")
    public Categories getByIdCategories(@PathVariable Long id) {
        return categoriesService.getByIdCategories(id);

    }

    @PostMapping("/create")
    public Categories create(@RequestBody Categories categories) {
        return categoriesService.createCategoriesArticle(categories);
    }

    @PutMapping("/{id}")
    public Categories update(@RequestBody Categories categories, @PathVariable Long id) {
        return categoriesService.updateCategories(categories, id);
    }

    @DeleteMapping("/{id}")
    public Categories deleteByIdCategories(@PathVariable Long id) {
        return categoriesService.deleteByIdCategories(id);
    }
    
}
