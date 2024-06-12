package com.metrodata.initialize_project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.metrodata.initialize_project.entity.Categories;

public interface CategoriesRepository extends JpaRepository<Categories, Integer>{

}
