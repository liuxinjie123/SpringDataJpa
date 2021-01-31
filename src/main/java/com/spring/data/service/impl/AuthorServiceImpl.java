package com.spring.data.service.impl;

import com.spring.data.entity.Author;
import com.spring.data.repository.AuthorRepository;
import com.spring.data.service.api.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthorServiceImpl implements AuthorService {
    @Autowired
    private AuthorRepository authorRepository;

    @Override
    public List<Author> list() {
        return authorRepository.findAll();
    }
}
