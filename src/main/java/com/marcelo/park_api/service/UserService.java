package com.marcelo.park_api.service;

import com.marcelo.park_api.entity.User;
import com.marcelo.park_api.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class UserService {
    private final UserRepository userRepository;



}
