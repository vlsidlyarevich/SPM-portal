package com.itibo.spm_portal.login_form.config;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {


    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception{

        auth.inMemoryAuthentication().withUser("Vladik").password("7788").roles("ADMIN");
        auth.inMemoryAuthentication().withUser("Nikitka").password("1111").roles("USER");
        auth.inMemoryAuthentication().withUser("Dimka").password("2222").roles("USER");
        auth.inMemoryAuthentication().withUser("DrugoiDimka").password("3333").roles("USER");
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception{
        http.authorizeRequests()
                .antMatchers("/admin/**").access("hasRole('ROLE_ADMIN')")
                .and().formLogin();
    }


}
