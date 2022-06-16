package com.caloger.social.ladder.Register;

import com.sun.istack.NotNull;

public class RegistrationRequest {

    @NotNull
    private String email;

    @NotNull
    private String password;

    @NotNull
    private String passwordConfirmation;

    public RegistrationRequest() {
    }

    public RegistrationRequest(String email, String password, String passwordConfirmation) {
        this.email = email;
        this.password = password;
        this.passwordConfirmation = passwordConfirmation;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPasswordConfirmation() {
        return passwordConfirmation;
    }

    public void setPasswordConfirmation(String passwordConfirmation) {
        this.passwordConfirmation = passwordConfirmation;
    }
}
