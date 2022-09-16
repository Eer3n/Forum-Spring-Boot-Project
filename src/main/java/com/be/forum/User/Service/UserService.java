package com.be.forum.User.Service;

import com.be.forum.User.Converter.UserConverter;
import com.be.forum.User.Entity.User;
import com.be.forum.User.Repository.UserRepository;
import com.be.forum.User.UserDto.UserRequest.UserRequest;
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

    public User findUserById(Long Id) {
        return userRepository.findUserById(Id);
    }

    public User findByUserName(String userName) {
        return userRepository.findUserByUserName(userName);
    }

    public User findByUserNameAndPassword(String userName, String password) {
        return userRepository.findUserByUserNameAndPassword(userName, password);
    }

    public User findAllByIsRegistered(Boolean isRegistered) {
        return userRepository.findAllByIsRegistered(isRegistered);
    }

    public User createNewUser(UserRequest userRequest) {
        log.info("User with id {} created", userRequest.getId());
        return userRepository.save(UserConverter.convertFromRequest(userRequest));
    }

    public void deleteGivenUser(UserRequest userRequest) {
        log.info("User with id {} deleted", userRequest.getId());
        userRepository.delete(UserConverter.convertFromRequest(userRequest));
    }
}
