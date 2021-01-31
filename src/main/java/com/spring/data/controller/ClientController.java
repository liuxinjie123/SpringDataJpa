package com.spring.data.controller;

import com.spring.data.entity.Client;
import com.spring.data.entity.NewClient;
import com.spring.data.service.api.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "client")
public class ClientController {
    @Autowired
    private ClientService clientService;

    @GetMapping
    public Object list() {
        List<Client> list = clientService.list();
        return list;
    }

    @GetMapping(value = "new")
    public Object newList() {
        List<NewClient> list = clientService.newList();
        return list;
    }

}
