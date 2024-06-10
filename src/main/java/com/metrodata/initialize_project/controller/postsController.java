package com.metrodata.initialize_project.controller;
  

import com.metrodata.initialize_project.entity.posts;
import com.metrodata.initialize_project.services.PostService;
import lombok.AllArgsConstructor;

import java.util.List;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
@RequestMapping("/posts")
public class postsController {

    private PostService postService;

    @GetMapping
    public List<posts> getAll() {
        return postService.getAll();
    }

    @GetMapping("/{id}")
    public posts getById(@PathVariable Integer id) {
        return postService.getById(id);
    }

    @PostMapping
    public posts create(@RequestBody posts Post) {
        return postService.create(Post);
    }

    @PutMapping("/{id}")
    public posts update(@PathVariable Integer id, @RequestBody posts Post) {
        return postService.update(id, Post);
    }

    @DeleteMapping("/{id}")
    public posts delete(@PathVariable Integer id) {
        return postService.delete(id);
    }
}
