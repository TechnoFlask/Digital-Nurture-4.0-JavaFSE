package com.library.Ex6.repository;

import org.springframework.stereotype.Repository;

@Repository
public class BookRepository {
    public void save() {
        System.out.println("Saving book");
    }
}
