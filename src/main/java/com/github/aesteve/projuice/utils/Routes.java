package com.github.aesteve.projuice.utils;

public interface Routes { // NOSONAR (I'm using constants in an interface for now)

  String API_PREFIX = "/api";
  String CURRENT_API = "/1";
  String PROJECT_PATH = API_PREFIX + CURRENT_API + "/projects";
  String ISSUES_PATH = API_PREFIX + CURRENT_API + "/issues";

  static String getProjectPath(Long projectId) {
    return PROJECT_PATH + "/" + projectId;
  }

}
