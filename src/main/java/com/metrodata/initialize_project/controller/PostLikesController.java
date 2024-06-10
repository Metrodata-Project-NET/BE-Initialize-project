package com.metrodata.initialize_project.controller;

import com.metrodata.initialize_project.entity.PostLikes;
import com.metrodata.initialize_project.services.PostLikeService;
import lombok.AllArgsConstructor;

import java.util.List;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
@RequestMapping("/postslike")

public class PostLikesController {
    
    private PostLikeService postlikeService;

    @GetMapping
    public List<PostLikes> getAll() {
        return postlikeService.getAll();
    }

    @GetMapping("/{id}")
    public PostLikes getById(@PathVariable Integer id) {
        return postlikeService.getById(id);
    }

    @PostMapping
    public PostLikes create(@RequestBody PostLikes Postslike) {
        return postlikeService.create(Postslike);
    }

    @PutMapping("/{id}")
    public PostLikes update(@PathVariable Integer id, @RequestBody PostLikes PostLike) {
        return postlikeService.update(id, PostLike);
    }

    @DeleteMapping("/{id}")
    public PostLikes delete(@PathVariable Integer id) {
        return postlikeService.delete(id);
    }
}
