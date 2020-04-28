package com.example.newProject.domain;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestBody;

@Repository
public interface UserRepository extends MongoRepository<User,String> {

  User findOneById(String id);
}
