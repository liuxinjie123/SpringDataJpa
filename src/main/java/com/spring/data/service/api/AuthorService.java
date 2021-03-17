package com.spring.data.service.api;

import com.spring.data.entity.Author;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface AuthorService {
    Page<Author> list(Pageable pageable);
}
