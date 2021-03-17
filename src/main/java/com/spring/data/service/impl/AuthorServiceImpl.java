package com.spring.data.service.impl;

import com.spring.data.entity.Author;
import com.spring.data.repository.AuthorRepository;
import com.spring.data.service.api.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class AuthorServiceImpl implements AuthorService {
    @Autowired
    private AuthorRepository authorRepository;

    @Override
    public Page<Author> list(Pageable pageable) {
        return authorRepository.findAll(pageable);
    }
}
