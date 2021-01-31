package com.spring.data.service.api;

import com.spring.data.entity.Client;
import com.spring.data.entity.NewClient;

import java.util.List;

public interface ClientService {
    List<Client> list();

    List<NewClient> newList();
}
