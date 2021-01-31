package com.spring.data.repository;

import com.spring.data.dto.UnionKey;
import com.spring.data.entity.IdClassDemo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IdClassDemoRepository extends JpaRepository<IdClassDemo, UnionKey> {
}
