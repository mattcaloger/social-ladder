package com.caloger.social.ladder.UserDetails;

import com.caloger.social.ladder.Users.UserModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.Arrays;
import java.util.Collection;

public class UserDetail implements UserDetails {

    private String username;
    private String password;

    @Autowired
    private PasswordEncoder passwordEncoder;

    public UserDetail(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public UserDetail() {
    }

    public UserDetail(UserModel userModel) {
        this.username = userModel.getUsername();
        this.password = userModel.getPassword();
    }


    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return Arrays.asList(new SimpleGrantedAuthority("ROLE_USER"));
    }

    @Override
    public String getPassword() {
        return this.password;
    }

    @Override
    public String getUsername() {
        return this.username;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}
