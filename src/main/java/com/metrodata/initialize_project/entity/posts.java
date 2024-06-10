package com.metrodata.initialize_project.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import jakarta.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "tb_m_posts")
    public class posts {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "Post_id")
        private  Integer id;

        @Column(name = "body", columnDefinition = "TEXT", nullable = false)
        private String body;

        @Column(name = "title", length = 100, nullable = false)
        private String title;

        @ManyToOne
        @JoinColumn(name = "thread_id", nullable = false)
        private Threads thread;


        // getters and setters
    }
