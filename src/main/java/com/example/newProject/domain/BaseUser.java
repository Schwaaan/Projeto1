package com.example.newProject.domain;

import java.io.Serializable;
import java.time.Instant;
import lombok.Data;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;

@Data
class BaseUser implements Serializable {

  @CreatedDate
  @CreatedBy
  private Instant createAt;
  @LastModifiedDate
  @LastModifiedBy
  private Instant updateAt;
  private Boolean deleted;

}
