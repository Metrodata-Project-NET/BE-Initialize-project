package com.metrodata.initialize_project.repository;
import com.metrodata.initialize_project.entity.Threads;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


    @Repository
    public interface ThreadRepository extends JpaRepository<Threads, Integer> {
    }
