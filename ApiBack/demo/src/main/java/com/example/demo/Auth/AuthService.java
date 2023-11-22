package com.example.demo.Auth;

import com.example.demo.repository.UsuarioRepository;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.example.demo.Jwt.JwtService;
import com.example.demo.enums.Rol;
import com.example.demo.entities.Usuario;
import com.example.demo.repository.UsuarioRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class AuthService {

    private final UsuarioRepository userRepository;
    private final JwtService jwtService;
    private final PasswordEncoder passwordEncoder;
    private final AuthenticationManager authenticationManager;

    public AuthResponse login(LoginRequest request) {
        authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(request.getUsername(), request.getPassword()));
        UserDetails user=userRepository.findByUsername(request.getUsername()).orElseThrow();
        String token=jwtService.getToken(user);
        Usuario usuario = (Usuario) user;
        return AuthResponse.builder()
            .token(token)
            .id(usuario.getId())
            .rol(usuario.getAuthorities().toString())
            .build();

    }

    public AuthResponse register(RegisterRequest request) {
        Usuario user = Usuario.builder()
                .username(request.getUsername())
                .password(passwordEncoder.encode(request.getPassword()))
                .firstname(request.getFirstname())
                .lastname(request.getLastname())
                .email(request.getEmail())
                .rol(Rol.valueOf(request.getRol()))
                .build();

        userRepository.save(user);

        Usuario usuario = userRepository.findByUsername(user.getUsername()).orElseThrow();

        return AuthResponse.builder()
                .token(jwtService.getToken(user))
                .id(usuario.getId())  // Incluye el ID en la respuesta
                .rol(usuario.getRol().toString())
                .build();
    }

    public AuthResponse registerEmployee(RegisterRequestEmployee request) {
        Usuario user = Usuario.builder()
                .username(request.getUsername())
                .password(passwordEncoder.encode(request.getPassword()))
                .firstname(request.getFirstname())
                .lastname(request.getLastname())  // Asegúrate de corregir el nombre del campo
                .email(request.getEmail())
                .rol(Rol.valueOf(request.getRol()))
                .build();

        userRepository.save(user);

        Usuario usuario = userRepository.findByUsername(user.getUsername()).orElseThrow();
        Long numero_usuario = usuario.getId();
        System.out.println(numero_usuario);

        return AuthResponse.builder()
                .token(jwtService.getToken(user))
                .id(numero_usuario)  // Incluye el ID en la respuesta
                .build();
    }

}
