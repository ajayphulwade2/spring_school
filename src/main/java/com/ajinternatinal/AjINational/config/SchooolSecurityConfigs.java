package com.ajinternatinal.AjINational.config;

import static org.springframework.security.config.Customizer.withDefaults;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SchooolSecurityConfigs {
	
	@Bean
	SecurityFilterChain defaultSecurityFilterChain(HttpSecurity http) throws Exception {
		 List<String> publicUrls = new ArrayList<>();
	     
	        publicUrls.add("/about");
	        publicUrls.add("/dashboard");
//		http.authorizeHttpRequests((requests) -> requests.anyRequest().denyAll());
	        http.authorizeHttpRequests(requests -> 
            publicUrls.forEach(url -> requests.requestMatchers(url).authenticated()));
            
		http		
		.authorizeHttpRequests((requests) -> requests 
												  
												 .requestMatchers("/","/home").permitAll()
												 .requestMatchers("/contact").permitAll()
//												 .requestMatchers("/dashboard").authenticated()
												 .requestMatchers("/courses/**").authenticated()
												 .requestMatchers("/saveMsg").permitAll()
												 .requestMatchers("/holidays/**").permitAll()
//												 .requestMatchers("/about").authenticated()
												 .requestMatchers("/assets/**").permitAll()
												 .requestMatchers("/login").permitAll()
													);
		 
	            
		http.csrf(csrf -> csrf.disable()); // To disable CSRF protection applicable only when HTML 
										   // is there i.e. thymeleaf object should not be there 
//		http.formLogin(withDefaults());
//		http.httpBasic(withDefaults());
		http.formLogin().loginPage("/login").defaultSuccessUrl("/dashboard").failureUrl("/login?error=true").permitAll();
		http.logout().logoutSuccessUrl("/login?logout=true").invalidateHttpSession(true).permitAll();
		
		return http.build();
	}
	
	/*
	 * Non-persistent implementation of UserDetailsManager which is backed by
	 * anin-memory map.
	 * 
	 * Mainly intended for testing and demonstration purposes, where a full blown
	 * persistentsystem isn't required.
	 */
	   @Bean
	    public InMemoryUserDetailsManager userDetailsService() {

	        UserDetails user = User.withDefaultPasswordEncoder()
	                .username("user")
	                .password("12345")
	                .roles("USER")
	                .build();
	        UserDetails admin = User.withDefaultPasswordEncoder()
	                .username("admin")
	                .password("54321")
	                .roles("USER", "ADMIN")
	                .build();
	        return new InMemoryUserDetailsManager(user, admin);
	    }

}
