package com.metrodata.initialize_project.service;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import com.metrodata.initialize_project.entity.Article;
import com.metrodata.initialize_project.entity.ArticleCategories;
import com.metrodata.initialize_project.entity.Categories;
import com.metrodata.initialize_project.repository.ArticleCategoriesRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ArticleCategoriesService {


    private final ArticleCategoriesRepository articleCategoriesRepository;

    public List<ArticleCategories> getAll() {
        return articleCategoriesRepository.findAll();
    }
    public ArticleCategories getByIdTransactionArticleCategories (Long id) {
        return articleCategoriesRepository.findById(id)
        .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "id not found"));
    }
     public ArticleCategories createCategoriesArticleById(ArticleCategories articleCategories) {
        articleCategories.setCategoriesId(articleCategories.getCategoriesId());
        articleCategories.setArticleId(articleCategories.getArticleId());
        return articleCategoriesRepository.save(articleCategories);
    }

}
