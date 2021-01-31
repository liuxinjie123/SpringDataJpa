package com.spring.data.controller;

import com.spring.data.entity.Author;
import com.spring.data.service.api.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/author")
public class AuthorController {
    @Autowired
    private AuthorService authorService;

    @GetMapping
    public Object list() {
        List<Author> list = authorService.list();
        return list;
    }
}
