package com.be.forum.User.Service;

import com.be.forum.User.Converter.UserConverter;
import com.be.forum.User.Entity.User;
import com.be.forum.User.Repository.UserRepository;
import com.be.forum.User.Dto.UserDto;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public List<User> findAll() {
        return userRepository.findAll();
    }

    public User findByUsernameAndPassword(String username, String password) {
        return userRepository.findByUsernameAndPassword(username, password);
    }

    public User findByUsername(String username) {
        return userRepository.findByUsername(username);
    }

    public User findUserById(Long Id) {
        return userRepository.findUserById(Id);
    }
}
