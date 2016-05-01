package com.github.aesteve.projuice.project;

import com.github.aesteve.projuice.issue.IssueDTO;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ProjectDTO {

  private Long id;
  private String name;
  private String description;
  private List<IssueDTO> issues;

  public ProjectDTO() {
    issues = new ArrayList<>();
  }

  public ProjectDTO(Project project) {
    id = project.getId();
    name = project.getName();
    description = project.getDescription();
    issues = project.getIssues().stream().map(IssueDTO::new).collect(Collectors.toList());
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

  public List<IssueDTO> getIssues() {
    return issues;
  }

  public void setIssues(List<IssueDTO> issues) {
    this.issues = issues;
  }

}
