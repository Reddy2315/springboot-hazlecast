package com.example.Projectinfocg.controller;

import com.example.Projectinfocg.model.Project;
import com.example.Projectinfocg.service.Projectservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/projectinfo")
public class Projectcontroller {
    @Autowired
    private Projectservice projectService;

    @PostMapping("/addproject")
    public Project addProject(@RequestBody Project project){
        return projectService.addProject(project);
    }
    @PostMapping("/addprojects")
    public List<Project> addProjects(@RequestBody List<Project> projects){
        return projectService.addProjects(projects);
    }

    @GetMapping("/getallprojects")
    public List<Project> getAllProjects(){
        return projectService.getAllProjects();
    }
    @GetMapping("/getprojectbyid/{id}")
    public Project getProjectById(@PathVariable int id){
        return projectService.getProjectById(id);
    }

}
