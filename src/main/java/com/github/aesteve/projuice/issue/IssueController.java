package com.github.aesteve.projuice.issue;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static com.github.aesteve.projuice.utils.Routes.ISSUES_PATH;

@RestController
@RequestMapping(ISSUES_PATH)
public class IssueController {

  @Autowired
  private IssueService issues;

  @RequestMapping(method = RequestMethod.GET)
  public List<Issue> getIssues() {
    return issues.list();
  }

}
