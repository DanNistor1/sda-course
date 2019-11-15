package com.sda.spring.data.jpa.book;

import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
    // In CrudRepository este definita semnatura metodelor CRUD: findAll(), findBYId(), save(), delete(), etc.
    // Vom obtine obiecte de tip Optional.
}