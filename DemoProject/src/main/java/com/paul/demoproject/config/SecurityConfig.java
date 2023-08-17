package com.paul.demoproject.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;

import static org.springframework.security.config.Customizer.withDefaults;


@Configuration
@EnableWebSecurity
@EnableMethodSecurity
public class SecurityConfig {
    //authentication
    @Bean
    public UserDetailsService userDetailsService(PasswordEncoder passwordEncoder){
/*    UserDetails admin = User.withUsername("Paul")
            .password(passwordEncoder().encode("1234"))
            .roles("ADMIN")
            .build();
        UserDetails student = User.withUsername("Tomal")
            .password(passwordEncoder().encode("1234"))
            .roles("STUDENT")
            .build();
        return new InMemoryUserDetailsManager(admin,student);*/
return new StudentDetails(studentRepository);
    }
    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity httpSecurity) throws Exception {
        httpSecurity.csrf(AbstractHttpConfigurer::disable)
                .authorizeHttpRequests(authz -> authz
                        .requestMatchers(  "HSCSubjects", "/authenticate","/getRole", "/getId").permitAll()
                        .requestMatchers("/addStudent","/students","/Grades", "/**").authenticated()

                );
                return httpSecurity.formLogin(withDefaults()).build();
    }
    @Bean
    public PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }

}
