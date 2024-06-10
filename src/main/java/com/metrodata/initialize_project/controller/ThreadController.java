package com.metrodata.initialize_project.controller;

import com.metrodata.initialize_project.entity.Threads;
import com.metrodata.initialize_project.services.ThreadServices;

import lombok.AllArgsConstructor;

import java.util.List;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
@RequestMapping("/thread")
public class ThreadController {

    private ThreadServices ThreadService;

    @GetMapping
    public List<Threads> getAll() {
        return ThreadService.getAll();
    }

    @GetMapping("/{id}")
    public Threads getById(@PathVariable Integer id) {
        return ThreadService.getById(id);
    }

    @PostMapping
    public Threads create(@RequestBody Threads threads) {
        return ThreadService.create(threads);
    }

    @PutMapping("/{id}")
    public Threads update(@PathVariable Integer id, @RequestBody Threads threads) {
        return ThreadService.update(id, threads);
    }

    @DeleteMapping("/{id}")
    public Threads delete(@PathVariable Integer id) {
        return ThreadService.delete(id);
    }
}

 