
package com.jwt.example.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
public class AppConfig 
{
//    @Bean
//    UserDetailsService userDetailsService() {
//        UserDetails userDetails = User.builder().
//                username("ishika")
//                .password(passwordEncoder().encode("ishika")).roles("ADMIN").
//                build();
//        UserDetails userDetails1 = User.builder().
//                username("satyam")
//                .password(passwordEncoder().encode("satyam")).roles("ADMIN").
//                build();
//        return new InMemoryUserDetailsManager(userDetails, userDetails1);
//    }

    @Bean
    PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
	
	
}
