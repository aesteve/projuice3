package com.github.aesteve.projuice.issue;

import com.github.aesteve.projuice.project.ProjectHateoas;

public class IssueDTO {

  private Long id;
  private String name;
  private String description;
  private ProjectHateoas project;

  public IssueDTO(Issue issue) {
    id = issue.getId();
    name = issue.getName();
    description = issue.getDescription();
    project = new ProjectHateoas(issue.getProject());
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public ProjectHateoas getProject() {
    return project;
  }

  public void setProject(ProjectHateoas project) {
    this.project = project;
  }

}
