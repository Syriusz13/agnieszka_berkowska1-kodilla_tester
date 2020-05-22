package com.kodilla.rest.controller;

import com.kodilla.rest.domain.BookDto;
import com.kodilla.rest.service.BookService;
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> 788efa91d522ca5e29359c0978e32ecd69348c06
>>>>>>> d5db1d77d1d2a23cec34b547c4dd5f76633b46ac
import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.ArgumentMatchers;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.json.GsonJsonParser;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.http.converter.json.GsonBuilderUtils;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
=======
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
>>>>>>> 6c4285215d117ec8fec6c0b1482d803e23d38054
>>>>>>> 788efa91d522ca5e29359c0978e32ecd69348c06
>>>>>>> d5db1d77d1d2a23cec34b547c4dd5f76633b46ac
import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
@WebMvcTest(BookController.class)
<<<<<<< HEAD
class BookControllerMvcTest {

=======
<<<<<<< HEAD
class BookControllerMvcTest {

=======
<<<<<<< HEAD
class BookControllerMvcTest {

=======
public class BookControllerMvcTest {
/*
>>>>>>> 6c4285215d117ec8fec6c0b1482d803e23d38054
>>>>>>> 788efa91d522ca5e29359c0978e32ecd69348c06
>>>>>>> d5db1d77d1d2a23cec34b547c4dd5f76633b46ac
    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private BookService bookService;

    @Test
    public void shouldFetchBooks() throws Exception {
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> 788efa91d522ca5e29359c0978e32ecd69348c06
>>>>>>> d5db1d77d1d2a23cec34b547c4dd5f76633b46ac
        //given
        List<BookDto> booksList = new ArrayList<>();
        booksList.add(new BookDto("title 1", "author 1"));
        booksList.add(new BookDto("title 2", "author 2"));
        Mockito.when(bookService.getBooks()).thenReturn(booksList);

        //when&then
        mockMvc.perform(MockMvcRequestBuilders.get("/books").contentType(MediaType.APPLICATION_JSON))
                .andExpect(MockMvcResultMatchers.status().is(200))
                .andExpect(MockMvcResultMatchers.jsonPath("$", Matchers.hasSize(2)));
    }

    @Test
    public void shouldAddBooks() throws Exception {
        //given
        //when
        mockMvc.perform(MockMvcRequestBuilders.post("/books").contentType(MediaType.APPLICATION_JSON).content(
                "{\"title\":\"Title1\",\"author\":\"Author1\"}"
        ))
                .andExpect(MockMvcResultMatchers.status().is(200));
        //then
        Mockito.verify(bookService,Mockito.times(1)).addBook(ArgumentMatchers.any(BookDto.class));
    }
<<<<<<< HEAD
}
=======
<<<<<<< HEAD
}
=======
}
=======
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

>>>>>>> 6c4285215d117ec8fec6c0b1482d803e23d38054
>>>>>>> 788efa91d522ca5e29359c0978e32ecd69348c06
>>>>>>> d5db1d77d1d2a23cec34b547c4dd5f76633b46ac
