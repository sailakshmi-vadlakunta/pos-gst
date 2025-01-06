package com.sphota.gst.pos.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class ApplicationSecurity {
    @Bean
    public SecurityFilterChain applicationBasicAuthFilterChain(HttpSecurity http) throws Exception {

        http.csrf(c -> c.disable()).authorizeHttpRequests(a -> a.anyRequest().permitAll());

        return http.build();
    }
}
