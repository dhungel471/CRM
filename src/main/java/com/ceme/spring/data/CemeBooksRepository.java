package com.ceme.spring.data;

import java.util.List;

import com.ceme.spring.model.Books;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface CemeBooksRepository extends MongoRepository<Books, String>{

    public List<Books> findByTitle(String title);
    
}