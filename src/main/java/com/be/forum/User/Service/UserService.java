package com.be.forum.User.Service;

import com.be.forum.User.Entity.User;
import com.be.forum.User.Repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public List<User> findAll() {
        return userRepository.findAll();
    }

    public User findUserById(Long Id) {
        return userRepository.findUserById(Id);
    }

    public User createNewUser(User user) {
        return userRepository.save(user);
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

    public void deleteGivenUser(User user) {
        userRepository.delete(user);
    }
}
