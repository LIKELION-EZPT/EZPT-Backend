package dev.likelion.ezpt.EZPT.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {
    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception{
        http
                .csrf().disable()
                .authorizeRequests()
//                .antMatchers("/api/v1/prompt/**")
                .antMatchers("/h2-console/**").permitAll()
                .anyRequest().permitAll()
                .and()
                .formLogin()
        ;
        return http.build();
    }
}
