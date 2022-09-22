package com.be.forum.User.Controller;

import com.be.forum.User.Entity.User;
import com.be.forum.User.Service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@CrossOrigin
@RestController
@RequestMapping("/api/v1/user")
public class UserController {

    private final UserService userService;

    @GetMapping("/{username}/{password}")
    public User findByUserNameAndPassword(@PathVariable String username, @PathVariable String password) {
        return userService.findByUsernameAndPassword(username, password);
    }
}