package spring.course.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import spring.course.interfaces.Movie;
import spring.course.interfaces.annotations.Action;
import spring.course.interfaces.annotations.Drama;
import spring.course.pojos.*;
import spring.course.services.TestService;

import java.util.ArrayList;


@Configuration
@ComponentScan("spring.course")
public class JavaConfig {

    @Bean
    public BPPTestBeanPostProcessor bppTestBeanPostProcessor() {
        return new BPPTestBeanPostProcessor();
    }

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
    public String s1() {
        return "handle s1";
    }

    @Bean
    public String s2() {
        return "handle s2";
    }

    @Bean
    public String s3() {
        return "handle s3";
    }

    @Bean
    public String s4() {
        return "handle s4";
    }

    @Bean
    public ArrayList<String> strings() {
        var list = new ArrayList<String>();
        list.add("ar list 1");
        list.add("ar list 2");
        list.add("ar list 3");
        return list;
    }


/*    @Bean
    public TestBeanPostProcessor testBeanPostProcessor() {
        return new TestBeanPostProcessor();
    }*/
    //TODO: case when return interface type | uncorrected work (only once object in each collections) => i think it need to explicitly define @Qualifiers (correct work), cuz interface haven't qualifare as classes
    @Bean
    @Drama
    public Movie dramaOne() {
        return new DramaMovie();
    }
    @Bean
    @Drama
    public Movie dramaTwo() {
        return new DramaMovie();
    }

    @Bean
    @Action
    public Movie actionOne() {
        return new ActionMovie();
    }
    @Bean
    @Action
    public Movie actionTwo() {
        return new ActionMovie();
    }
    @Bean
    @Action
    public Movie actionThree() {
        return new ActionMovie();
    }
    //TODO: case when return class type | correct work (all objects in collections )
/*    @Bean
    public DramaMovie dramaOne() {
        return new DramaMovie();
    }
    @Bean
    public DramaMovie dramaTwo() {
        return new DramaMovie();
    }

    @Bean
    public ActionMovie actionOne() {
        return new ActionMovie();
    }
    @Bean
    public ActionMovie actionTwo() {
        return new ActionMovie();
    }
    @Bean
    public ActionMovie actionThree() {
        return new ActionMovie();
    }*/
}
