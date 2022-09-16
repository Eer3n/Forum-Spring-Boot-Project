package com.be.forum.User.Controller;

import com.be.forum.User.Entity.User;
import com.be.forum.User.Repository.UserRepository;
import com.be.forum.User.Service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@CrossOrigin
@RestController
@RequestMapping("/api/v1/user")
public class UserController {

    private final UserService userService;

    @GetMapping("/hello")
    public String helloWorld() {
        return "Hello World";
    }

    @GetMapping("/{Id}")
    public User findUserById(@PathVariable Long Id) {
        return userService.findUserById(Id);
    }

    @GetMapping("/{username}/{password}")
    public User findByUserNameAndPassword(@PathVariable String username, @PathVariable String password) {
        return userService.findByUserNameAndPassword(username, password);
    }

    @PostMapping("/create")
    public void save(@RequestBody User user) {
        userService.createNewUser(user);
    }

    @PostMapping("/delete")
    public void delete(@RequestBody User user) {
        userService.deleteGivenUser(user);
    }
}
