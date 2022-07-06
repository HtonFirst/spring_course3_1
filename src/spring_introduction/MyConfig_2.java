package spring_introduction;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:itroduction.properties")
public class MyConfig_2 {

    @Bean
    public Pet catBean() {
        return  new Cat_2();
    }
    @Bean
    public Person_2 personBean() {
        return  new Person_2(catBean());
    }
}
