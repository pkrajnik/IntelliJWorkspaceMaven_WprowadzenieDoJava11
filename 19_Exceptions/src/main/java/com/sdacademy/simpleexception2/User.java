package com.sdacademy.simpleexception2;

public class User {

    private String name;
    private String email;

    public User(String name, String email) throws EmailFormatException {
        this.name = name;
        if (isEmailValidatedOk(email)) {
            this.email = email;
        } else {
            throw new EmailFormatException("Niepoprawny format adresu email!");
        }
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    private boolean isEmailValidatedOk(String email) {
        if (email.contains("@")) {
            return true;
        } else {
            return false;
        }
    }
}
