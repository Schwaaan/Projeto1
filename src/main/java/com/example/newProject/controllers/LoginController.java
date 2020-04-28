package com.example.newProject.controllers;

import com.example.newProject.config.security.service.ImplUserDetailsService;
import com.example.newProject.domain.UserLogin;
import com.example.newProject.domain.UserLoginRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

  @Autowired
  private ImplUserDetailsService userDetailsService;
  @Autowired
  private UserLoginRepository userLoginRepository;

  @GetMapping("/v1/login")
  public String login() {
    return "login";
  }

  @PostMapping("/v1/create/login")
  public UserLogin userLogin(@RequestBody UserLogin userLogin) {
    return userLoginRepository.save(userLogin);
  }
}
