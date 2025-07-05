package com.library.Ex2.repository;

public class BookRepository {
    public void save(String bookName) {
        System.out.println("Saving book: " + bookName);
    }

    @Override
    public String toString() {
        return "BookRepository{}";
    }
}
