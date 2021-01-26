package com.example.irshad.IrshadTesting.Service;

import com.example.irshad.IrshadTesting.Domain.User;
import com.example.irshad.IrshadTesting.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public List<User> fetchUserList() {
        return userRepository.findAll();
    }
}
