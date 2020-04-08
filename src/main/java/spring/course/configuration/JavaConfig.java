package spring.course.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import spring.course.pojos.ComplexBean;
import spring.course.pojos.SimpleBean;
import spring.course.services.TestService;


@Configuration
public class JavaConfig {

    @Bean
    public SimpleBean beanOne(){
        return new SimpleBean(1, "First");
    }

    @Bean
    public SimpleBean beanTwo(){
        return new SimpleBean(2, "Second");
    }

    @Bean
    public SimpleBean beanThree(){
        return new SimpleBean(3, "Third");
    }


    @Bean
    public ComplexBean complexBean(){
        return new ComplexBean();
    }

    @Bean
    public TestService service(){
        return new TestService();
    }
}
