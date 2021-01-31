package com.spring.data.service.impl;

import com.spring.data.entity.Client;
import com.spring.data.repository.ClientRepository;
import com.spring.data.service.api.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientServiceImpl implements ClientService {
    @Autowired
    private ClientRepository clientRepository;

    @Override
    public List<Client> list() {
        return clientRepository.findAll();
    }
}
