package com.groovyharshamfoundation.bookstore.controller;


import org.springframework.http.ResponseEntity;
import com.groovyharshamfoundation.bookstore.dao.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/v1/books")
public class BookController {

    @GetMapping
    public ResponseEntity<List<BookDAO>> getBooks(){

        BookDAO book = BookDAO.builder().title("FIRST BOOK TITLE").build();

        List<BookDAO> books = new ArrayList<>();
        books.add(book);
        return ResponseEntity.ok(books);

    }
}