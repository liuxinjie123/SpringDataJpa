package com.spring.data.service.impl;

import com.spring.data.entity.User;
import com.spring.data.repository.UserRepository;
import com.spring.data.service.api.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public List<User> list() {
        return userRepository.findAll();
    }
}
