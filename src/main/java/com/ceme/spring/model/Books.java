package com.ceme.spring.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.util.List;

@Document
public class Books {
    @Id
    private String isbn;
    private String status;
    private List<String> authors;
    private String title;

    public Books() {
    }

    public Books(String status, List<String> authors, String title) {
		this.status = status;
		this.authors = authors;
		this.title = title;
	}

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

   

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

	public List<String> getAuthors() {
		return authors;
	}

	public void setAuthors(List<String> authors) {
		this.authors = authors;
	}  
    
}