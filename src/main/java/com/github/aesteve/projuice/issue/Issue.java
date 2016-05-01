package com.github.aesteve.projuice.issue;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Issue {

  @Id
  private Long id;

  private String name;

  private String description;

  private Long project;

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

  public Long getProject() {
    return project;
  }

  public void setProject(Long project) {
    this.project = project;
  }

}
