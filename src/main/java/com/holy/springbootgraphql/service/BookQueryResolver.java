package com.holy.springbootgraphql.service;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.holy.springbootgraphql.domain.Author;
import com.holy.springbootgraphql.domain.Book;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wangzhao
 * @version 1.0
 * @date 2020/2/10 23:17
 * @desc
 */
@Component
public class BookQueryResolver implements GraphQLQueryResolver {

    public List<Book> findBooks(){
        Author author = Author.builder()
                .id(1)
                .name("holy")
                .age(30)
                .build();
        Book book = Book.builder()
                .id(1)
                .name("Graghql学习指南")
                .author(author)
                .publisher("电子工业出版社")
                .build();
        List<Book> bookList = new ArrayList<Book>();
        bookList.add(book);
        return bookList;
    }
}
