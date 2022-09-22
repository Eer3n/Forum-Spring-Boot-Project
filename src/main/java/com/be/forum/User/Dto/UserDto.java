package com.be.forum.User.Dto;

import com.be.forum.User.Enum.UserType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserDto {
    private Long Id;
    private String userName;
    private String name;
    private String surname;
    private String password;
    private String mailAddress;
    private int age;
    private Long level;
    Date insDate;
    private Boolean isRegistered;
    private UserType userType;
}