package com.github.aesteve.projuice.issue;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IssueService {

  @Autowired
  private IssueDAO dao;

  public List<Issue> list() {
    return dao.list();
  }

}
