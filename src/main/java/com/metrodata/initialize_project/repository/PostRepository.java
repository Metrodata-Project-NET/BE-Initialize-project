package com.metrodata.initialize_project.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.metrodata.initialize_project.entity.posts;

       @Repository
       public interface PostRepository extends JpaRepository<posts, Integer> {
           // tambahkan metode tambahan sesuai kebutuhan
       }

