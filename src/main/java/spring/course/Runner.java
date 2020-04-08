package spring.course;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import spring.course.configuration.JavaConfig;
import spring.course.services.TestService;

public class Runner {

    public static void main(String[] args) {
        var pathToAnnotationConfigs = "spring/course/configuration";
        ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);

        var service = (TestService) context.getBean("service");
        service.show();
    }

}
