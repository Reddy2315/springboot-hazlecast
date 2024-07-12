package com.example.Projectinfocg.service;

import com.example.Projectinfocg.model.Project;
import com.example.Projectinfocg.repository.projectrepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Projectservice {
    @Autowired
    private projectrepo repo;
    public Project addProject(Project project) {
        return repo.save(project);
    }
    @Cacheable(cacheNames = {"project-cache"})
    public List<Project> getAllProjects() {
        System.out.println("Fetching from database for 1st time ");
        return repo.findAll();
    }
    @Cacheable(cacheNames = "project", key = "#id", unless = "#result == null")
    public Project getProjectById(int id) {
        System.out.println("Fetching from database fron the 1st time ");
        return repo.findById(id).orElse(null);
    }


    public List<Project> addProjects(List<Project> projects) {
        return repo.saveAll(projects);
    }
}
