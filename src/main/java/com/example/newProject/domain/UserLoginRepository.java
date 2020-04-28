package com.example.newProject.domain;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserLoginRepository extends MongoRepository<UserLogin,String> {

  UserLogin findOneByName(String s);
}
