package com.metrodata.initialize_project.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.metrodata.initialize_project.entity.Article;
import com.metrodata.initialize_project.entity.ArticleCategories;
import com.metrodata.initialize_project.service.ArticleCategoriesService;
import com.metrodata.initialize_project.service.ArticleService;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RestController
@RequestMapping("/ArticleCategoriesTr")
public class ArticleCategoriesController {

    private final ArticleCategoriesService articleCategoriesService;

    @GetMapping
    public List<ArticleCategories> getAll() {
        return articleCategoriesService.getAll();
    }

    @GetMapping("/{id}")
    public ArticleCategories getByIdArticle(@PathVariable Long id) {
        return articleCategoriesService.getByIdTransactionArticleCategories(id);

    }

    @PostMapping("/create")
    public ArticleCategories create(@RequestBody ArticleCategories articleCategories) {
        return articleCategoriesService.createCategoriesArticleById(articleCategories);
    }
}
