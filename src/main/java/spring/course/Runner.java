package spring.course;


import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import spring.course.configuration.JavaConfig;
import spring.course.pojos.ComplexBean;
import spring.course.pojos.TestAutowiredList;
import spring.course.services.TestService;

public class Runner {

    public static void main(String[] args) {
        var pathToAnnotationConfigs = "spring/course/configuration";
        ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);

//        var service = (TestService) context.getBean("ts");
//        service.show();

//        var cmb = (ComplexBean) context.getBean("clxb");
//        System.out.println(cmb.toString());

        var tal = new TestAutowiredList();

//        System.out.println(tal.toString());

        context.registerShutdownHook();
    }

}
