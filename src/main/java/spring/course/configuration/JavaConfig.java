package spring.course.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import spring.course.pojos.ComplexBean;
import spring.course.pojos.SimpleBean;
import spring.course.services.TestService;

import java.util.ArrayList;


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


    @Bean
    public String s1(){return "handle s1";}
    @Bean
    public String s2(){return "handle s2";}
    @Bean
    public String s3(){return "handle s3";}
    @Bean
    public String s4(){return "handle s4";}

    @Bean
    public ArrayList<String> strings(){
        var list = new ArrayList<String>();
        list.add("ar list 1");
        list.add("ar list 2");
        list.add("ar list 3");
        return list;
    }


    @Bean
    public BPPTestBeanPostProcessor bppTestBeanPostProcessor(){return new BPPTestBeanPostProcessor();}
}
