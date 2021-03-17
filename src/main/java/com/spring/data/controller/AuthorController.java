package com.spring.data.controller;

import com.spring.data.entity.Author;
import com.spring.data.service.api.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
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
    public Object list(Pageable pageable) {
        Page<Author> list = authorService.list(pageable);
        return list;
    }
}
