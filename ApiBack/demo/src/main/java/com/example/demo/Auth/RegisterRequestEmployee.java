package com.example.demo.Auth;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RegisterRequestEmployee {
    String username;
    String password;
    String firstname;
    String lastname;
    String email;

    String rol;


}
