package com.kodilla.rest.controller;

import com.kodilla.rest.domain.BookDto;
import com.kodilla.rest.service.BookService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;


import java.awt.*;
import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
@WebMvcTest(BookController.class)
public class BookControllerMvcTest {
/*
    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private BookService bookService;

    @Test
    public void shouldFetchBooks() throws Exception {
    //given
     List<BookDto> booksList = new ArrayList<>();
        booksList.add(new BookDto("Title 1", "Author 1"));
        booksList.add(new BookDto("Title 2", "Author 2"));
        Mockito.when(bookService.getBooks()).thenReturn(booksList);
    }
    //when&then
    mockMvc.perform(MockMvcRequestBuilders.get("/books").contentType(PageAttributes.MediaType.APPLICATION_JSON))
*/
}

