package com.example.newProject.domain;

import java.time.Instant;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.hibernate.validator.constraints.br.CPF;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Slf4j
@Data
@Document
public class User extends BaseUser {

  @Id
  private String id;
  @NotNull
  private String name;
  private String sexy;
  @Email
  private String email;
  private Instant dateOfBirth;
  private String nationality;
  private String naturalness;
  @CPF
  private String cpf;

  public User() {
  }

  public void validateSexy(String sexy) {
    if (sexy.equals("Masculino") || sexy.equals("Feminino")) {
      this.sexy = sexy;
    }
    log.info("Error Because Sexy not Exists");
  }
}
