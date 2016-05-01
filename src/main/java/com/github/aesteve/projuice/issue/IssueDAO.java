package com.github.aesteve.projuice.issue;

import com.github.aesteve.projuice.utils.BaseDAO;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class IssueDAO extends BaseDAO {

  public List<Issue> list() {
    return select(from(Issue.class));
  }

}
