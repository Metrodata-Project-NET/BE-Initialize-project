package com.metrodata.initialize_project.repository;

import com.metrodata.initialize_project.entity.PostLikes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

       @Repository
       public interface PostLikeRepository extends JpaRepository<PostLikes, Integer> {
           // tambahkan metode tambahan sesuai kebutuhan
       }
