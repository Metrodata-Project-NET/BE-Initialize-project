package com.metrodata.initialize_project.service;

import java.util.List;

import org.springframework.http.HttpStatus;
// import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

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
    public Article getByIdArticle (Long id) {
        return articleRepository.findById(id)
        .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "id not found"));
    }

    public Article createArticle(Article article) {
        article.setTitle(article.getTitle());
        article.setBanner(article.getBanner());
        article.setBody(article.getBody());
        return articleRepository.save(article);
    }
    public Article updateArticle (Article article, Long id){
        getByIdArticle(id);
        article.setId(id);
        // article.setTitle(getByIdArticle(id).getTitle());
        // article.setBody(getByIdArticle(id).getBody());
        // article.setBanner(getByIdArticle(id).getBanner());
        return articleRepository.save(article);
    }

    public Article deleteByIdArticle (Long id){
        Article article = getByIdArticle(id);
        articleRepository.delete(article);;
        return article;
    }

}
