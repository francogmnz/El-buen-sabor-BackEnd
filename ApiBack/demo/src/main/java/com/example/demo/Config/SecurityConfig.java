package com.example.demo.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import com.example.demo.Jwt.JwtAuthenticationFilter;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.autoconfigure.security.servlet.PathRequest;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configurers.HeadersConfigurer;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

@Configuration
@EnableWebSecurity
@RequiredArgsConstructor
public class SecurityConfig{

    private final JwtAuthenticationFilter jwtAuthenticationFilter;
    private final AuthenticationProvider authProvider;

    @Bean
    public SecurityFilterChain configure(HttpSecurity http) throws Exception {
        return http
                .csrf(csrf ->
                        csrf
                                .disable())
                .authorizeHttpRequests(authRequest ->
                                authRequest
                                        .requestMatchers(new AntPathRequestMatcher("/auth/**")).permitAll()
                                        .requestMatchers(new AntPathRequestMatcher(PathRequest.toH2Console().toString())).permitAll()
                                        .requestMatchers(new AntPathRequestMatcher("/**")).hasAuthority("ADMIN")
                                        .requestMatchers(new AntPathRequestMatcher("/api/v1/u/**")).hasAnyAuthority("CLIENTE")
                                        .requestMatchers(new AntPathRequestMatcher("/api/v1/co/**")).hasAnyAuthority("COCINERO")
                                        .requestMatchers(new AntPathRequestMatcher("/api/v1/u.d/**")).hasAnyAuthority("REPARTIDOR","CLIENTE")
                                        .requestMatchers(new AntPathRequestMatcher("/api/v1/u.ca/**")).hasAnyAuthority("CAJERO","CLIENTE")
                                        .requestMatchers(new AntPathRequestMatcher("/api/v1/u.co/**")).hasAnyAuthority("COCINERO","CLIENTE")
                                        .requestMatchers(new AntPathRequestMatcher("/api/v1/e/**")).hasAnyAuthority("COCINERO","CLIENTE","REPARTIDOR","CAJERO")
                        //.anyRequest().authenticated()
                )
                .headers(headers -> headers.frameOptions(HeadersConfigurer.FrameOptionsConfig::disable)) //H2
                .sessionManagement(sessionManager->
                        sessionManager
                                .sessionCreationPolicy(SessionCreationPolicy.STATELESS))
                .authenticationProvider(authProvider)
                .addFilterBefore(jwtAuthenticationFilter, UsernamePasswordAuthenticationFilter.class)
                .build(); }
}