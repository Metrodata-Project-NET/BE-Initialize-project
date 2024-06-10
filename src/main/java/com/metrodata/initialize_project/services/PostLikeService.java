package com.metrodata.initialize_project.services;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import com.metrodata.initialize_project.entity.PostLikes;
import com.metrodata.initialize_project.repository.PostLikeRepository;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class PostLikeService {

    
    private PostLikeRepository postlikeRepository;

    public List<PostLikes> getAll() {
        return postlikeRepository.findAll();
    }

    public PostLikes getById(Integer id) {
        return postlikeRepository
                .findById(id)
                .orElseThrow(()-> new ResponseStatusException(HttpStatus.NOT_FOUND,"PostLikes not found"));
    }

    public PostLikes create(PostLikes postlikes) {
        return postlikeRepository.save(postlikes);
    }

    public PostLikes update(Integer id, PostLikes postLike) {
        getById(id); // method getById
        postLike.setId(id);
        return postlikeRepository.save(postLike);
      }
    
      public PostLikes delete(Integer id) {
        PostLikes postLike = getById(id);
        postlikeRepository.delete(postLike);
        return postLike;
      }
}  
