package com.library.Ex1;


import com.library.Ex1.repository.BookRepository;
import com.library.Ex1.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Ex1 {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        BookService service = context.getBean("bookService", BookService.class);
        BookRepository repo = context.getBean("bookRepository", BookRepository.class);

        System.out.println(service);
        System.out.println(repo);
    }
}
