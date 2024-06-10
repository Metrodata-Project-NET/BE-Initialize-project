package com.metrodata.initialize_project.services;

import com.metrodata.initialize_project.entity.posts;
import com.metrodata.initialize_project.repository.PostRepository;
import lombok.AllArgsConstructor;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@AllArgsConstructor
@Service
public class PostService {

    private PostRepository postsRepository;

    public List<posts> getAll() {
        return postsRepository.findAll();
    }

    public posts getById(Integer id) {
        return postsRepository
                .findById(id)
                .orElseThrow(()-> new ResponseStatusException(HttpStatus.NOT_FOUND,"Post not found"));
    }

    public posts create(posts post) {
        return postsRepository.save(post);
    }

    public posts update(Integer id, posts post) {
        getById(id); // method getById
        post.setId(id);
        return postsRepository.save(post);
      }
    
      public posts delete(Integer id) {
        posts post = getById(id);
        postsRepository.delete(post);
        return post;
      }

}   

