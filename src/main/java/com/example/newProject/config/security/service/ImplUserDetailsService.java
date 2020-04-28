package com.example.newProject.config.security.service;

import com.example.newProject.domain.User;
import com.example.newProject.domain.UserLogin;
import com.example.newProject.domain.UserLoginRepository;
import com.example.newProject.domain.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Repository;

@Repository
public class ImplUserDetailsService implements UserDetailsService {

  @Autowired
  private UserLoginRepository userRepository;

  @Override
  public UserDetails loadUserByUsername(String name) throws UsernameNotFoundException {
    UserLogin user  = userRepository.findOneByName(name);
    if(user == null){
      throw new UsernameNotFoundException("Usuario não encontrado!");
    }
    return user;
  }
}
