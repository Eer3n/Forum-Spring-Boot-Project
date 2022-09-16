package com.be.forum.User.Controller;

import com.be.forum.User.Entity.User;
import com.be.forum.User.Service.UserService;
import com.be.forum.User.UserDto.UserRequest.UserDto;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@CrossOrigin
@RestController
@RequestMapping("/api/v1/user")
public class UserController {

    private final UserService userService;

    @GetMapping("/{Id}")
    public User findUserById(@PathVariable Long Id) {
        return userService.findUserById(Id);
    }

    @GetMapping("/{username}/{password}")
    public User findByUserNameAndPassword(@PathVariable String username, @PathVariable String password) {
        return userService.findByUserNameAndPassword(username, password);
    }

    @RequestMapping(path = {"/create"}, method = {RequestMethod.POST})
    @ResponseStatus(HttpStatus.CREATED)
    public void createNewUser(@RequestBody UserDto userDto) {
        userService.createNewUser(userDto);
    }

    @RequestMapping(path = {"/delete"}, method = {RequestMethod.POST})
    public void deleteGivenUser(@RequestBody UserDto userDto) {
        userService.deleteGivenUser(userDto);
    }
}