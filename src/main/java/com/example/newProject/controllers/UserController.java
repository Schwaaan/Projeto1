package com.example.newProject.controllers;

import com.example.newProject.domain.User;
import com.example.newProject.domain.UserRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController{

  @Autowired
  private UserRepository userRepository;

  @PostMapping(path = "/v1/users")
  public User createUser(@RequestBody User user) {
    return userRepository.save(user);
  }

  @GetMapping(path = "/v1/users")
  public List<User> getAllUsers() {
    return userRepository.findAll();
  }

  @GetMapping(path = "/v1/users/{id}")
  public User GetUser(@PathVariable String id) {
    return userRepository.findOneById(id);
  }

  @PutMapping(path = "/v1/users/{id}")
  public User updateUser(@PathVariable String id, @RequestBody User userRequest) {
    User user = userRepository.findOneById(id);
    user.setName(userRequest.getName());
    user.setCpf(userRequest.getCpf());
    user.setDateOfBirth(userRequest.getDateOfBirth());
    user.setNationality(userRequest.getNationality());
    user.setNaturalness(userRequest.getNaturalness());
    user.validateSexy(user.getSexy());
    return userRepository.save(user);
  }

  @DeleteMapping(path = "/v1/users/{id}")
  public User deleteUser(@PathVariable String id) {
    User user = userRepository.findOneById(id);
    user.setDeleted(true);
    return user;
  }
}
