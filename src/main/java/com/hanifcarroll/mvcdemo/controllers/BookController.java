package com.hanifcarroll.mvcdemo.controllers;

import com.hanifcarroll.mvcdemo.repositories.BookRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/books")
public class BookController {

    private BookRepository bookRepository;

    public BookController(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @GetMapping("/")
    public String getBooks(Model model) {
        model.addAttribute("books", bookRepository.findAll());

        return "books";
    }
}
