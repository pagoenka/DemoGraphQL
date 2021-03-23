package com.pg.DemoGraphQL.repository;

import com.pg.DemoGraphQL.model.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> { }

