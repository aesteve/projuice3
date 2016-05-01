package com.github.aesteve.projuice.project;

import com.github.aesteve.projuice.issue.Issue;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Project {

  public Project() {
    issues = new ArrayList<>();
  }

  @Id
  private Long id;

  private String name;

  private String description;

  @OneToMany(mappedBy = "project")
  private List<Issue> issues;

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

  public List<Issue> getIssues() {
    return issues;
  }

  public void setIssues(List<Issue> issues) {
    this.issues = issues;
  }

}
