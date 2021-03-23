package com.pg.DemoGraphQL.repository;

import com.pg.DemoGraphQL.model.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> { }

