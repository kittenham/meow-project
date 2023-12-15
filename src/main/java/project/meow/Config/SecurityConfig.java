//package project.meow.Config;
//
//import jakarta.servlet.DispatcherType;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.security.web.SecurityFilterChain;
//
//import static org.springframework.security.config.Customizer.withDefaults;
//
//@Configuration
//@EnableMethodSecurity
//public class SecurityConfig {
//
//    @Bean
//    public PasswordEncoder passwordEncoder() {
//        return new BCryptPasswordEncoder();
//    }
//
//    @Bean
//    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
//        http.csrf().disable().cors().disable()
//                .authorizeHttpRequests(request -> request
//                        .dispatcherTypeMatchers(DispatcherType.FORWARD).permitAll()
//                        .requestMatchers("/status", "/images/**", "/view/join", "/auth/join").permitAll()
//                        .anyRequest().authenticated()   //어떠한 요청이라도 인증 필요
//                )
//                .formLogin(login -> login   //form 방식 로그인 사용
//                        .loginPage("/login")
//                        .loginProcessingUrl("/login-process")
//                        .usernameParameter("userid")
//                        .passwordParameter("pw")
//                        .defaultSuccessUrl("/main", true) //성공 시 mainpage로
//                        .permitAll()    //메인 페이지 이동이 막히면 안되므로 얘는 허용
//                )
//                .logout(withDefaults());
//
//        return http.build();
//    }
//}