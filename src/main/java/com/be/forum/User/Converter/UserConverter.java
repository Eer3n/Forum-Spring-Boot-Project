package com.be.forum.User.Converter;

import com.be.forum.User.Entity.User;
import com.be.forum.User.Dto.UserDto;
import lombok.experimental.UtilityClass;

@UtilityClass
public class UserConverter {
    public User convertFromRequest(UserDto userDto) {
        return User.builder()
                .Id(userDto.getId())
                .username(userDto.getUserName())
                .name(userDto.getName())
                .surname(userDto.getSurname())
                .password(userDto.getPassword())
                .mailAddress(userDto.getMailAddress())
                .age(userDto.getAge())
                .level(userDto.getLevel())
                .insDate(userDto.getInsDate())
                .isRegistered(userDto.getIsRegistered())
                .build();
    }
}
