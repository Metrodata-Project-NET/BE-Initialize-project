package com.metrodata.initialize_project.service;

import java.util.List;
import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import com.metrodata.initialize_project.entity.Article;
import com.metrodata.initialize_project.entity.Categories;
import com.metrodata.initialize_project.repository.ArticleRepository;
import com.metrodata.initialize_project.repository.CategoriesRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class CategoriesService {

    private final CategoriesRepository categoriesRepository;

    public List<Categories> getAll() {
        return categoriesRepository.findAll();
    }

    // public List<Article> findArticlesByCategoriesId (Long id) {
    //     Optional <Categories> categoriesId  = categoriesRepository.findById(id);
    //     return categoriesId.get().getArticles();
    // }


    public Categories getByIdCategories(Long id) {
        return categoriesRepository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "categories not found"));
    }

    public Categories createCategoriesArticle(Categories categories) {
        // categories.setName(categories.getName());
        return categoriesRepository.save(categories);
    }

    public Categories updateCategories(Categories categories, Long id) {
        getByIdCategories(id);
        categories.setId(id);
        return categoriesRepository.save(categories);
    }

    public Categories deleteByIdCategories(Long id) {
        Categories categories = getByIdCategories(id);
        categoriesRepository.delete(categories);
        
        return categories;
    }

}
