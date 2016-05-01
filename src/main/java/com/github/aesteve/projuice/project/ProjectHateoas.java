package com.github.aesteve.projuice.project;

import static com.github.aesteve.projuice.utils.Routes.getProjectPath;

public class ProjectHateoas {

  public final Long id;
  public final String location;

  public ProjectHateoas(Long id) {
    this.id = id;
    location = getProjectPath(id);
  }

}
