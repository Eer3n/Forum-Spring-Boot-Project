package com.be.forum.User.Converter;

import com.be.forum.User.Entity.User;
import com.be.forum.User.UserDto.UserRequest.UserRequest;
import lombok.experimental.UtilityClass;

@UtilityClass
public class UserConverter {
    public User convertFromRequest(UserRequest userRepository) {
        return User.builder()
                .Id(userRepository.getId())
                .userName(userRepository.getUserName())
                .name(userRepository.getName())
                .surname(userRepository.getSurname())
                .password(userRepository.getPassword())
                .mailAddress(userRepository.getMailAddress())
                .age(userRepository.getAge())
                .level(userRepository.getLevel())
                .insDate(userRepository.getInsDate())
                .isRegistered(userRepository.getIsRegistered())
                .userType(userRepository.getUserType())
                .build();
    }
}
