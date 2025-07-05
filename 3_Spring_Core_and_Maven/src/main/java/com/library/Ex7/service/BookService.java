package com.library.Ex7.service;

import com.library.Ex7.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {
    private BookRepository bookRepository;

    @Autowired
    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
        System.out.println("BookService initialized via constructor injection");
    }

    @Autowired
    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
        System.out.println("BookRepository injected via setter");
    }

    public void printBook() {
        System.out.println("Calling BookService.printBook()");
        bookRepository.printRepo();
    }
}
