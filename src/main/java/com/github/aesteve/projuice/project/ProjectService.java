package com.github.aesteve.projuice.project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectService {

  @Autowired
  private ProjectDAO dao;

  public List<Project> list() {
    return dao.list();
  }

  public Project create(ProjectDTO dto) {
    Project proj = new Project();
    proj.setName(dto.getName());
    proj.setDescription(dto.getDescription());
    // discard issues
    return dao.create(proj);
  }

}
