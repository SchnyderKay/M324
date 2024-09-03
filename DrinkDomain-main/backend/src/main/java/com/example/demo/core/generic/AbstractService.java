package com.example.demo.core.generic;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.UUID;
import org.springframework.data.domain.Pageable;

public interface AbstractService<T extends AbstractEntity> {

  T save(T entity);

  void deleteById(String id) throws NoSuchElementException;

  T updateById(String id, T entity) throws NoSuchElementException;

  List<T> findAll();

  List<T> findAll(Pageable pageable);

  T findById(String id);

  boolean existsById(String id);

}
