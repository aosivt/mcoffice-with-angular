package ru.mobilcard.mcoffice.services;

//import cvr.otus.service.SecurityService;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

//import static cvr.otus.URLs.*;

@EnableWebSecurity
@Configuration
public class SecurityConfiguration
        extends WebSecurityConfigurerAdapter
{
    public static final String LOGIN_PROCESSING_URL = "/login";
    public static final String LOGIN_FAILURE_URL = "/error";
    public static final String LOGIN_URL = "/login";
    public static final String LOGOUT_SUCCESS_URL = "/";

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.csrf().disable().authorizeRequests().antMatchers("**").permitAll();
//        http.csrf().disable()
//                .requestCache()
//                .requestCache(new CustomRequestCache())
//
////                 Restrict access to our application.
//                .and().authorizeRequests()
//                .antMatchers("**").permitAll()
////                 Allow all flow internal requests.
//                .requestMatchers().permitAll()
////
////                 Allow all requests by logged in user.
//                .anyRequest().authenticated()
////
////                 Configure the login page and bad login
//                .and().formLogin().loginPage(LOGIN_URL).permitAll()
////                .loginProcessingUrl(LOGIN_PROCESSING_URL)
//                .failureUrl(LOGIN_FAILURE_URL)
////                 Configure success login
//                .and().logout().logoutSuccessUrl(LOGOUT_SUCCESS_URL)
////
////                 permits by roles
//                .and()
//                .authorizeRequests()
//
        ;
    }

    @Override
    public void configure(WebSecurity web) {
        web.ignoring().antMatchers(
            "**"
//
//                "/login",                             // the standard favicon URI
//                "/error",                              // the robots exclusion standard
//                "/",                              // the robots exclusion standard
//                "/static/index.html",                              // the robots exclusion standard
//                                    web application manifest
//                "/src/main-es5.js",
//                "/src/main-es2015.js",
//                "/src/polyfills-es5.js",
//                "/src/polyfills-es2015.js",
//                "/src/runtime-es5.js",
//                "/src/runtime-es2015.js",
//                "/src/style-es5.js",
//                "/src/style-es2015.js",
//                "/src/vendor-es5.js",
//                "/src/vendor-es2015.js",
//                "/src/favicon.ico"
//                "/offline-page.html",
//                "/icons/**",                                // icons and images
//                "/images/**",
//                "/frontend/**",                             // (development mode) static resources
//                "/webjars/**",                              // (development mode) webjars
//                "/h2-console/**",                           // (development mode) H2 debugging console
//                "/frontend-es5/**", "/frontend-es6/**"
        );    // (production mode) static resources

    }
}