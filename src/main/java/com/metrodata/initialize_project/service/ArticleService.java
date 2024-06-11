package com.metrodata.initialize_project.service;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import com.metrodata.initialize_project.entity.Article;
import com.metrodata.initialize_project.repository.ArticleRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ArticleService {

    private final ArticleRepository articleRepository;

    public List<Article> getAll() {
        return articleRepository.findAll();

    }

    public Article createArticle(Article article) {
        article.setTitle(article.getTitle());
        article.setBanner(article.getBanner());
        article.setBody(article.getBody());
        return articleRepository.save(article);
    }

}
