package com.be.forum.User.Enum;

public enum UserType {
    Admin("Admin"), Default("Default"), Moderator("Moderator");

    private final String userType;

    UserType(String userType) {
        this.userType = userType;
    }

    public String getUserType() {
        return userType;
    }

    @Override
    public String toString() {
        return "UserType{" + "userType='" + userType + '\'' + '}';
    }
}