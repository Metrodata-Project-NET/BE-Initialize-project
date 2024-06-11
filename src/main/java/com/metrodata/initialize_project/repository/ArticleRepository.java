package com.metrodata.initialize_project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.metrodata.initialize_project.entity.Article;

public interface ArticleRepository extends JpaRepository <Article, Long> {

}
