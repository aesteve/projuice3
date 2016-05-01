package com.github.aesteve.projuice.project;

import com.github.aesteve.projuice.utils.BaseDAO;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public class ProjectDAO extends BaseDAO {

  public List<Project> list() {
    return select(from(Project.class));
  }

  @Transactional
  public Project create(Project project) {
    em.persist(project);
    return project;
  }

}
