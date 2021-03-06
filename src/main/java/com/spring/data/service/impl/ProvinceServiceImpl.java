package com.spring.data.service.impl;

import com.spring.data.entity.addr.Province;
import com.spring.data.repository.ProvinceRepository;
import com.spring.data.service.api.ProvinceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProvinceServiceImpl implements ProvinceService {
    @Autowired
    private ProvinceRepository provinceRepository;

    @Override
    public List<Province> list() {
        return provinceRepository.findAll();
    }
}
