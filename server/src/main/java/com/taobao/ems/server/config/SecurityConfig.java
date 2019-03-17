//package com.taobao.ems.server.config;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//
//@Configuration
//@EnableWebSecurity
//public class SecurityConfig extends WebSecurityConfigurerAdapter {
//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//
//        http.authorizeRequests().antMatchers("/css/**", "/js/**", "/fonts/**", "/index", "/layui/**", "/libs/**").permitAll()  //以下目录的资源都可以访问
//                .antMatchers("/users/**").hasRole("ADMIN") //需要相应的角色才能访问
//                .and()
//                .formLogin() //基于表单Form登录验证
//                .loginPage("/login").failureUrl("/login-error"); //自定义登录桌面
//
//
//    }
//    @Autowired
//    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
//        auth
//                .inMemoryAuthentication()
//                .withUser("user").password("123456").roles("ADMIN");
//    }
//
//
//}
