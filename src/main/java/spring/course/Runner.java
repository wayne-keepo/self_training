package spring.course;


import org.springframework.beans.factory.FactoryBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import spring.course.configuration.BPPTestBeanPostProcessor;
import spring.course.configuration.JavaConfig;
import spring.course.pojos.*;
import spring.course.services.MovieService;
import spring.course.services.TestService;

public class Runner {

    public static void main(String[] args) {
        var pathToAnnotationConfigs = "spring/course/configuration";
        ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);

//        var service = (TestService) context.getBean("ts");
//        service.show();

//        var cmb = (ComplexBean) context.getBean("clxb");
//        System.out.println(cmb.toString());

//        var tal = new TestAutowiredList();
//        var terst = new TestBeanPostProcessor();
//        System.out.println(tal.toString());
//        var t = context.getBean("testBeanPostProcessor");  //TODO: why cant get FactoryBean for this via &<beanName> ?
//        System.out.println(t);

//        var movieService = (MovieService) context.getBean(MovieService.class);

//        System.out.println(movieService);
        var csfdm = (CheckSpringFromDefaultMethods) context.getBean(CheckSpringFromDefaultMethods.class);
        var csfdms = (CheckSpringFromDefaultMethodsSecond) context.getBean(CheckSpringFromDefaultMethodsSecond.class);










        context.registerShutdownHook();
    }

}
