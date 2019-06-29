/*
package ac.ke.egerton.egerton.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import javax.sql.DataSource;


@EnableWebSecurity
public class SecurityConfig  extends WebSecurityConfigurerAdapter {
    @Configuration
    @EnableWebSecurity
    public class SecurityConfiguration extends WebSecurityConfigurerAdapter {
        @Autowired
        private DataSource dataSource;


        @Override
        protected void configure(AuthenticationManager auth) throws Exception {
            auth.jdbcAuthentication().dataSource(dataSource)
                    .usersByUsernameQuery("select  payrollid as principal, password as credentials, true from user where  payrollid=?")
                    .authoritiesByUsernameQuery("select payrollid as principal, role_name as role from user_roles where payrollid=?")
                    .passwordEncoder(passwordEncoder()).rolePrefix("ROLE_");
        }

        @Bean
        public PasswordEncoder passwordEncoder() {
            // TODO Auto-generated method stub
            return new BCryptPasswordEncoder();
        }

        @Override
        protected void configure(HttpSecurity http) throws Exception {

            http.authorizeRequests().antMatchers("/register", "/", "/about", "/login", "/css/**", "/webjars/**").permitAll()
                    .antMatchers("/profile").hasAnyRole("USER,ADMIN")
                    .antMatchers("/users","/evaluateresults").hasRole("ADMIN")
                    .and().formLogin().loginPage("/login").permitAll()
                    .defaultSuccessUrl("/profile").and().logout().logoutSuccessUrl("/login");
        }

    }

}


*/
