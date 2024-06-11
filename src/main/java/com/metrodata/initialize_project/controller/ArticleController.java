package com.metrodata.initialize_project.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.metrodata.initialize_project.entity.Article;
import com.metrodata.initialize_project.service.ArticleService;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RestController
@RequestMapping("/Article")
public class ArticleController {

    private final ArticleService articleService;

    @GetMapping
    public List<Article> getAll() {
        return articleService.getAll();
    }

    @PostMapping
    public Article create(@RequestBody Article article) {
        return articleService.createArticle(article);
    }
}
