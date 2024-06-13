package com.metrodata.initialize_project.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.metrodata.initialize_project.entity.Categories;

public interface CategoriesRepository extends JpaRepository<Categories, Long> {
    Optional<Categories> findByname(String name);
}
