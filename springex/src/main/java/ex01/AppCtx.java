package ex01;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
public class AppCtx {
    @Bean
    public Hello hello() {
        return  new Hello();
    }
}
