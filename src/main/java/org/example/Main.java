package org.example;

import java.math.BigDecimal;
import org.example.config.AppConfig;
import org.example.model.Book;
import org.example.service.BookService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book();
        book1.setAuthor("F. Gerbert");
        book1.setTitle("Dune");
        book1.setPrice(BigDecimal.valueOf(200));
        book1.setDescription("Great");
        book1.setId(1L);
        book1.setIsbn("9v37h");
        book1.setCoverImage("f873ghf");

        Book book2 = new Book();
        book2.setAuthor("F. Gerbert");
        book2.setTitle("Mua D'ib");
        book2.setPrice(BigDecimal.valueOf(250));
        book2.setDescription("Cool");
        book2.setId(2L);
        book2.setIsbn("9v37h2");
        book2.setCoverImage("f873gh3f");

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);
        BookService bookService = context.getBean(BookService.class);

        bookService.save(book1);
        bookService.save(book2);

        System.out.println(bookService.findAll());
    }
}
