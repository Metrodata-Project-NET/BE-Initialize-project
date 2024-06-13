package com.metrodata.initialize_project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.metrodata.initialize_project.entity.ArticleCategories;


public interface ArticleCategoriesRepository extends JpaRepository <ArticleCategories, Long>{

}
