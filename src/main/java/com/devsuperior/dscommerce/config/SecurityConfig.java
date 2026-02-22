package com.devsuperior.dscommerce.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

	// habilita o h2 console ... 
    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http
            .csrf(csrf -> csrf.disable()) // Desativa proteção CSRF (necessário para o H2 Console)
            .headers(headers -> headers.frameOptions(frame -> frame.disable())) // Libera uso de frames
            .authorizeHttpRequests(auth -> auth
                .requestMatchers("/h2-console/**").permitAll() // Libera o console
                .anyRequest().permitAll() // Libera todas as demais rotas
                // .anyRequest().authenticated() // Outras rotas requerem login (ajuste conforme o projeto)
            );
        return http.build();
    }

}