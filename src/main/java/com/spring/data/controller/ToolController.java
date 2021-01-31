package com.spring.data.controller;

import com.spring.data.entity.addr.Province;
import com.spring.data.service.api.ProvinceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/tool")
public class ToolController {
    @Autowired
    ProvinceService provinceService;

    @GetMapping(value = "/province")
    public Object provinceList() {
        List<Province> list = provinceService.list();
        return list;
    }
}
