package com.example.demo.core.generic;

import java.util.UUID;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

@MappedSuperclass
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public abstract class AbstractEntity {

  @Id
  @GeneratedValue(generator = "id2")
  @GenericGenerator(name = "id2", strategy = "id2")
  @Column(columnDefinition = "id", name = "id", updatable = false, nullable = false)
  private String id;

}