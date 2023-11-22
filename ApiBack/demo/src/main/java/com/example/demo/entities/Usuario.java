package com.example.demo.entities;

import com.example.demo.enums.Rol;
import jakarta.persistence.*;
import lombok.*;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import java.util.Collection;
import java.util.List;


@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
@Table(name = "Usuario", uniqueConstraints = {@UniqueConstraint(columnNames = {"username", "email"})})
    public class Usuario extends Base implements UserDetails {

    @Basic
    @Column(nullable = false, name = "username")
    private String username;
    @Column(nullable = false, name = "password")
    private String password;
    @Column(nullable = false, name = "email")
    private String email;
    @Column(nullable = false, name = "nombre")
    private String firstname;
    @Column(nullable = false, name = "apellido")
    private String lastname;
    @Enumerated(EnumType.STRING)
    Rol rol;

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return List.of(new SimpleGrantedAuthority((rol.toString())));
    }

    public Long getId(){return super.getID();}
    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public String getUsername() {
        return username;
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
