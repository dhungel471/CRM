package com.ceme.spring.controller;

import java.util.Collection;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;

import com.ceme.spring.model.Books;
import com.ceme.spring.service.CemeBooksService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@CrossOrigin
@RequestMapping("/api/books")
public class CemeBooksController {
    @Autowired
    private CemeBooksService cemeBooksService;
    
    @RequestMapping(method = RequestMethod.GET)
    public Collection<Books> getAllBooks() {
        return cemeBooksService.getBooks();
    }

  @RequestMapping(method=RequestMethod.POST)
  public void addNewBooks(@RequestBody Books book) {
      cemeBooksService.addNewBooks(book);
  }

  @RequestMapping(method=RequestMethod.PUT, value="/{id}")
  public void updateBooks(@RequestBody Books book, @PathVariable("id") String id) {
      cemeBooksService.updateBooks(id, book);
  }
  @CrossOrigin
  @RequestMapping(method=RequestMethod.DELETE, value="/{id}")
  public void deleteBooks(@PathVariable("id") String id){
      cemeBooksService.deleteBook(id);
  }
  
}