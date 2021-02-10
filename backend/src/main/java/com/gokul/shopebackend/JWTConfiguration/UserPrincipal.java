package com.gokul.shopebackend.JWTConfiguration;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.gokul.shopebackend.model.User;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.Objects;

public class UserPrincipal implements UserDetails {
    private Long id;

    @JsonIgnore
    private String mobile;

    @JsonIgnore
    private String password;

    private Collection<? extends GrantedAuthority>authorities;

    public UserPrincipal(Long id, String mobile, String password){
        this.id=id;

        this.mobile=mobile;
        this.password=password;
    }

    public static UserPrincipal create(User user){
        return new UserPrincipal(
                user.getId(),
                user.getEmail(),
                user.getPassword()
        );
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserPrincipal that = (UserPrincipal) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    public Long getId() {
        return id;
    }



    public String getMobile() {
        return mobile;
    }



    @Override
    public String getPassword() {
        return password;
    }



    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return authorities;
    }


    @Override
    public String getUsername() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public boolean isAccountNonExpired() {
        return false;
    }

    @Override
    public boolean isAccountNonLocked() {
        return false;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return false;
    }

    @Override
    public boolean isEnabled() {
        return false;
    }
}
