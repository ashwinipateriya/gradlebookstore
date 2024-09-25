package com.groovyharshamfoundation.bookstore.dao;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder                    //ENABLE BUILDER DESIGN PATTERN
@AllArgsConstructor
@NoArgsConstructor
public class BookDAO {

    private String title;
}