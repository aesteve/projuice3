package com.github.aesteve.projuice.project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static com.github.aesteve.projuice.utils.Routes.PROJECT_PATH;
import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

@RestController
@RequestMapping(PROJECT_PATH)
public class ProjectController {

  @Autowired
  private ProjectService projects;

  @RequestMapping(method = GET)
  public List<Project> list() {
    return projects.list();
  }

  @RequestMapping(method = POST)
  public ResponseEntity<ProjectDTO> create(@RequestBody ProjectDTO project) {
    Project newProject = projects.create(project);
    return new ResponseEntity<>(new ProjectDTO(newProject), HttpStatus.CREATED);
  }

}
