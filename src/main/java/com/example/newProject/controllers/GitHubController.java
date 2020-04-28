package com.example.newProject.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GitHubController {

  @GetMapping("/github")
  public String getGitHub() {
    return "https://github.com/";
  }
}
