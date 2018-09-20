package analysis.config;

import analysis.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;

/**
 *
 * @auther elio
 * @date 2018/9/18
 */
@EnableWebSecurity
@Configuration
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

    @Bean
    @Override
    public AuthenticationManager authenticationManagerBean() throws Exception {
        return super.authenticationManagerBean();
    }

    @Override
    public void configure(WebSecurity web) throws Exception {
        web.ignoring().antMatchers("/static/**");
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
            .authorizeRequests()
                .antMatchers("/","/test").permitAll()
                .anyRequest().authenticated()
                .and()
            .formLogin()
                .loginPage("/login")
                .permitAll()
                .defaultSuccessUrl("/dashboard")
                .permitAll()
                .and()
            .logout()
                .permitAll();
        http.csrf().disable();
    }

    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
        //admin
        auth.inMemoryAuthentication().withUser("admin").password("{MD5}21232f297a57a5a743894a0e4a801fc3").roles("USER");
        //meiyi123456
        auth.inMemoryAuthentication().withUser("meiyi").password("{MD5}3843fcab4eb1a84f302f23a49d5faf98").roles("USER");
        //developer
        auth.inMemoryAuthentication().withUser("elio").password("{MD5}5e8edd851d2fdfbd7415232c67367cc3").roles("USER");
    }


//    @Bean
//    public UserDetailsService userDetailsService(){
//        return new UserServiceImpl();
//    }

}
