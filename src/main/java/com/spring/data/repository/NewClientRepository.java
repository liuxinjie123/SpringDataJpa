package com.spring.data.repository;

import com.spring.data.entity.NewClient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NewClientRepository extends JpaRepository<NewClient, Long> {
}
