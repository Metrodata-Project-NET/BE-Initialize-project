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

    @GetMapping("/{id}")
    public Article getByIdArticle(@PathVariable Long id) {
        return articleService.getByIdArticle(id);

    }

    @PostMapping("/create")
    public Article create(@RequestBody Article article) {
        return articleService.createArticle(article);
    }

    @PutMapping("/{id}")
    public Article update(@RequestBody Article article, @PathVariable Long id) {
        return articleService.updateArticle(article, id);
    }

    @DeleteMapping("/{id}")
    public Article deleteByIdArticle(@PathVariable Long id) {
        return articleService.deleteByIdArticle(id);
    }
}
