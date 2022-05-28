package com.caloger.social.ladder.Register;

public class RegistrationResponse {
    private String emailError;
    private String passwordError;

    public RegistrationResponse() {
    }

    public RegistrationResponse(String emailError, String passwordError) {
        this.emailError = emailError;
        this.passwordError = passwordError;
    }

    public String getEmailError() {
        return emailError;
    }

    public void setEmailError(String emailError) {
        this.emailError = emailError;
    }

    public String getPasswordError() {
        return passwordError;
    }

    public void setPasswordError(String passwordError) {
        this.passwordError = passwordError;
    }
}
