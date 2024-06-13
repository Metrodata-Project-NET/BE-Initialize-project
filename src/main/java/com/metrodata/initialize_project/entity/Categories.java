package com.metrodata.initialize_project.entity;

import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Categories
 */

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "tb_m_categories")
@Builder
public class Categories {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @JoinTable(name = "tb_tr_article_categories", joinColumns = {
            @JoinColumn(name = "categories_id", referencedColumnName = "id") }, inverseJoinColumns = {
                    @JoinColumn(name = "article_id", referencedColumnName = "id") })
    @ManyToMany
    private List<Article> articles;

}