package com.spring.data.repository;

import com.spring.data.entity.addr.Province;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProvinceRepository extends JpaRepository<Province, Long> {
}
