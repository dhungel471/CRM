package com.ceme.spring.service;

import java.util.Collection;

import com.ceme.spring.data.CemeBooksRepository;
import com.ceme.spring.model.Books;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CemeBooksService {
    @Autowired
    private CemeBooksRepository booksRepo;

    //Get List of Books
    public Collection<Books> getBooks() {
        return booksRepo.findAll();
    }

    //Add new Books
    public void addNewBooks(Books book){
        booksRepo.insert(book);
    }

    //Update Books
    public void updateBooks(String id, Books book){
        booksRepo.save(book);
    }

    //Delete Books
    public void deleteBook(String id){
        booksRepo.deleteById(id);
    }

}