package com.library.Ex3.service;

import com.library.Ex3.repository.BookRepository;

public class BookService {
    private BookRepository bookRepository;

    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public void addBook(String bookName) {
        System.out.println("Adding book: " + bookName);
        bookRepository.save(bookName);
    }

    @Override
    public String toString() {
        return "BookService{}";
    }
}
