package com.caloger.social.ladder.Roles;

public enum UserRole {
    USER("USER"),
    ADMIN("ADMIN");
    private final String roleName;
    private UserRole(final String roleName) {
        this.roleName = roleName;
    }

    public String getRoleName() {
        return roleName;
    }

}
