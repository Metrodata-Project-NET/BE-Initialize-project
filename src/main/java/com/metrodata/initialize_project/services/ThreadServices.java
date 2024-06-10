package com.metrodata.initialize_project.services;

import com.metrodata.initialize_project.entity.Threads;
import com.metrodata.initialize_project.repository.ThreadRepository;

import lombok.AllArgsConstructor;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@AllArgsConstructor
@Service
public class ThreadServices {
    
    private ThreadRepository threadRepository;

    public List<Threads> getAll() {
        return threadRepository.findAll();
    }

    public Threads getById(Integer id) {
        return threadRepository
                .findById(id)
                .orElseThrow(()-> new ResponseStatusException(HttpStatus.NOT_FOUND,"Thread not found"));
    }

    public Threads create(Threads thread) {
        return threadRepository.save(thread);
    }

    public Threads update(Integer id, Threads thread) {
        getById(id); // method getById
        thread.setId(id);
        return threadRepository.save(thread);
      }
    
      public Threads delete(Integer id) {
        Threads thread = getById(id);
        threadRepository.delete(thread);
        return thread;
      }
}