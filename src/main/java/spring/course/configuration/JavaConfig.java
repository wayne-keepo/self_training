package spring.course.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import spring.course.pojos.ComplexBean;
import spring.course.pojos.SimpleBean;
import spring.course.services.TestService;


@Configuration
@ComponentScan("spring.course")
public class JavaConfig {

//    @Bean(initMethod = "init")
//    public SimpleBean beanOne(){
//        return new SimpleBean(4, "First");
//    }
//
//    @Bean(initMethod = "init")
//    public SimpleBean beanTwo(){
//        return new SimpleBean(5, "Second");
//    }
//
//    @Bean
//    public SimpleBean beanThree(){
//        return new SimpleBean(6, "Third");
//    }

//    @Bean
//    public ComplexBean complexBean(){
//        return new ComplexBean();
//    }
//
//    @Bean
//    public TestService service(){
//        return new TestService();
//    }
}
